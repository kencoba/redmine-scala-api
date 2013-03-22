package coba.ken.redmineapi.bean

import java.util.Date

/**
 *
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class News extends Identifiable with Serializable {
  var id: Option[Int] = _
  var project: Project = _
  var user: User = _
  var title: String = _
  var description: String = _
  var createdOn: Date = _
  var link: String = _

  override def toString(): String = {
    val builder = new StringBuilder
    builder ++= "News [id="
    builder ++= id.toString
    builder ++= ", title="
    builder ++= title
    builder ++= "]"
    builder.toString
  }
}
