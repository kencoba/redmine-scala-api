package coba.ken.redmineapi.bean

/**
 * Issue Watcher for a Redmine issue
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class Watcher(var id: Int, var name: String) {
  def this() = this(0, null)

  override def toString(): String = {
    val builder = new StringBuilder
    builder ++= "Watcher [id="
    builder ++= id.toString
    builder ++= ", name="
    builder ++= name
    builder ++= "]"
    builder.toString
  }
}
