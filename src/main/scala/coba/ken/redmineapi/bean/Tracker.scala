package coba.ken.redmineapi.bean

/**
 * Redmine's Tracker (bug/feature/task/...)
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class Tracker(var id: Option[Int],var name: String) extends Identifiable with Serializable {
  def this() = this(None,null: String)
}
