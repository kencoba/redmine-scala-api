package coba.ken.redmineapi.internal.comm

import org.apache.http.HttpRequest
import coba.ken.redmineapi.RedmineException

/**
 *
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
trait Communicator[K] {
  /**
   * Performs a request.
   *
   */ 
  @throws(classOf[RedmineException])
  def sendRequest[R](request: HttpRequest, contentHandler: ContentHandler[K, R]):R
}
