package coba.ken.redmineapi.internal.comm.naivessl

import java.security.cert.CertificateException
import java.security.cert.X509Certificate

import javax.net.ssl.X509TrustManager

/**
 * The goal of this trust manager is to do nothing - it will authorize
 * any TSL/SSL secure connection.
 *
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class NaiveX509TrustManager extends X509TrustManager {
  @throws(classOf[CertificateException])
  override def checkClientTrusted(certs: Array[X509Certificate], str: String):Unit = {}

  @throws(classOf[CertificateException])
  override def checkServerTrusted(certs: Array[X509Certificate], str: String):Unit = {}

  override def getAcceptedIssuers(): Array[X509Certificate] = null
}
