package coba.ken.redmineapi

/**
 *
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
case class RedmineTransportException(message: String, cause: Throwable)
     extends RedmineCommunicationException(message, cause) {

       def this(cause: Throwable) = this(null: String, cause)

       def this(message: String) = this(message, null: Throwable)
     }
