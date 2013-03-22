package coba.ken.redmineapi.bean

import java.util.Date

/**
 * Redmine's project versions
 *
 * @author Kenichi kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class Version(var project:Project, var name: String) extends Identifiable {
  var id:Option[Int] = _
  var description: String = _
  var status: String = _
  var dueDate: Date = _
  var createdOn: Date = _
  var updatedon: Date = _

  def this() = this(null,null)

  override def toString(): String = {
    val builder = new StringBuilder
    builder ++= "Version [id="
    builder ++= id.toString
    builder ++= ", name="
    builder ++= name
    builder ++= "]"
    builder.toString
  }
}
