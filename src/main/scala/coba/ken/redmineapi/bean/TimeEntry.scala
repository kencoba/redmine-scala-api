package coba.ken.redmineapi.bean

import java.util.Date

/**
 *
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class TimeEntry extends Identifiable {
  var id: Option[Int] = _
  var issueId: Option[Int] = _
  var projectId: Option[Int] = _
  var projectName: String = _
  var userName: String = _
  var userId: Int = _
  var activityName: String = _
  var activityId: Int = _
  var hours: Option[Float] = _
  var comment: String = _
  var spentOn: Date = _
  var createdOn: Date = _
  var updatedOn: Date = _

  override def toString(): String = {
    val builder = new StringBuilder
    builder ++= "User "
    builder ++= userName
    builder ++= " spent "
    builder ++= hours.toString
    builder ++= " hours on task "
    builder ++= issueId.toString
    builder ++= " (project "
    builder ++= projectName
    builder ++= ") doing "
    builder ++= activityName
    builder.toString
  }

  def valid: Boolean = {
    (hours != None) && (projectId != None || issueId != None)
  }
}
