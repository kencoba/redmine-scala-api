package coba.ken.redmineapi.bean

import java.util.Date

/**
 * Redmine's issue
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class Issue extends Identifiable {
  var id: Option[Int] = _
  var subject: String = _
  var parentId: Option[Int] = _
  var estimatedHours: Float = _
  var spentHours: Float = _
  var assignee: User = _
  private var fPriorityText: String = _
  def priorityText: String = fPriorityText
  var priorityId: Int = _
  var doneRatio: Int = _
  var project: Project = _
  var author: User = _
  var startDate: Date = _
  var dueDate: Date = _
  var tracker: Tracker = _
  /** Description is empty by default, not NULL */
  var description: String = _
  var createdOn: Date = _
  var updatedOn: Date = _
  var statusId: Int = _
  var statusName: String = _
  var targetVersion: Version = _
  var category: IssueCategory = _

  var note: String = _
  /**
   * list of Custom Field objects, NEVER NULL
   * NOTE: The custom field(s) <b>must have correct database ID set</b> to be saved to Redmine. This is Redmine REST API's limitation.
   */
  private var fCustomFields: List[CustomField] = _
  def customFields_=(customFields: List[CustomField]) = { fCustomFields = customFields }
  def customField(fieldName: String): Option[String] = {
    val matched = fCustomFields.filter(_.name == fieldName)
    if (matched.isEmpty) None else Some(matched(0).value)
  }
  var journals: List[Journal] = _
  var relations: List[IssueRelation] = _
  var attachments: List[Attachment] = _
  var changesets: List[Changeset] = _
  var watchers: List[Watcher] = _

  override def toString(): String = {
    val builder = new StringBuilder
    builder ++= "Issue [id="
    builder ++= id.toString
    builder ++= ", subject="
    builder ++= subject
    builder ++= "]"
    builder.toString
  }
}
