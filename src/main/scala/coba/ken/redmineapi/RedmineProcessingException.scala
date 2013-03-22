package coba.ken.redmineapi

/**
 *
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
case class RedmineProcessingException(errs: List[String])
     extends RedmineException {
       
       private final val errors: List[String] = errs
       private val builder = new StringBuilder
       // TODO Refactor this to get rid of adding "\n". it should be up to the UI layer how to format all this
       errors.foreach{e => builder ++= e; builder ++= "\n"}
       private val text = builder.toString

       def getErrors: List[String] = errors

       override def getMessage() : String = text
}
