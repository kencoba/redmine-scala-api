package coba.ken.redmineapi

/**
 * Some I/O error
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */

class RedmineCommunicationException(message: String, cause: Throwable)
     extends RedmineException(message, cause) {
       def this(cause: Throwable) = this(null: String, cause)

       def this(message: String) = this(message, null: Throwable)
     }
