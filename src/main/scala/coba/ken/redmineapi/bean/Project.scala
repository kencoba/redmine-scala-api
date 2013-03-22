package coba.ken.redmineapi.bean

import java.util.Date

/**
 * Redmine's Project.
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class Project extends Identifiable with Serializable {
  var id: Option[Int] = _
  var identifier: String = _
  var name: String = _
  var description: String = _
  var homepage: String = _
  var createdOn: Date = _
  var updatedOn: Date = _
  var trackers: List[Tracker] = _
  var parentId: Int = _

  def trackerByName(trackerName: String):Option[Tracker] = {
    if (trackers == null) None
    val found = trackers.filter(_.name == trackerName)
    if (found.isEmpty) None else Some(found(0))
  }

  override def toString(): String = name
}
