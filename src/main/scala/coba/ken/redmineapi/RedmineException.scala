package coba.ken.redmineapi

class RedmineException(message:String, cause:Throwable)
     extends Exception(message,cause) {

       def this() = this(null: String,null: Throwable)

       def this(message: String) = this(message,null: Throwable)

       def this(cause: Throwable) = this(null: String,cause)
}
