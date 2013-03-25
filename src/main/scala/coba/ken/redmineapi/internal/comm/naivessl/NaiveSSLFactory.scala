package coba.ken.redmineapi.internal.comm.naivessl

import java.security.KeyManagementException
import java.security.NoSuchAlgorithmException

import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager

import org.apache.http.conn.ssl.SSLSocketFactory

/**
 * Create naive SSLSocket factory which will authorize any TSL/SSL host.
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
object NaiveSSLFactory {
  /**
   * @return Return naive SSL socket factory (authorize any SSL/TSL host)
   */
  def createNaiveSSLSocketFactory(): SSLSocketFactory = {
    val manager = new NaiveX509TrustManager
    def getSSLContext(): SSLContext = {
      try {
        val managers = List[TrustManager](manager).toArray
        val sslcontext = SSLContext.getInstance("SSL")
        sslcontext.init(null, managers, null)
        sslcontext
      } catch {
        case e: NoSuchAlgorithmException => null
        case e: KeyManagementException   => null
      }
    }
    val sslcontext = getSSLContext
    new SSLSocketFactory(sslcontext, SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER)
  }
}
