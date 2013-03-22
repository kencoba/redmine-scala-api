package coba.ken.redmineapi.bean

/**
 * Redmine's Group
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class Group extends Identifiable {
  var id: Option[Int] = _
  var name: String = _

  override def toString(): String = name
}
