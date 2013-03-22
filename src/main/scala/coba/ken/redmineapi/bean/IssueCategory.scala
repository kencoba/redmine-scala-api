package coba.ken.redmineapi.bean

/**
 * Redmine issue category.
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class IssueCategory(var project:Project, var name: String) extends Identifiable with Serializable {
  var id: Option[Int] = _
  var assignee: User = _

  override def toString(): String = {
    val builder = new StringBuilder
    builder ++= "IssueCategory [id="
    builder ++= id.toString
    builder ++= ", name="
    builder ++= name
    builder ++= ", project="
    builder ++= project.toString
    builder ++= ", assignee="
    builder ++= assignee.toString
    builder ++= "]"
    builder.toString
  }
}
