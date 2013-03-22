package coba.ken.redmineapi.bean

/**
 * Redmine Issue Status ("new", "in progress" etc)
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class IssueStatus extends Identifiable with Serializable {
  var id: Option[Int] = _
  var name: String = _
  var isDefault: Boolean = _
  var closed: Boolean = _

  override def toString(): String = {
    val builder = new StringBuilder
    builder ++= "IssueStatus [id="
    builder ++= id.toString
    builder ++= ", name="
    builder ++= name
    builder ++= ", isDefault="
    builder ++= isDefault.toString
    builder ++= ", closed="
    builder ++= closed.toString
    builder ++= "]"
    builder.toString
  }
}
