package coba.ken.redmineapi.bean

/**
 *
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class SavedQuery {
  var id: Int =_
  var name: String = _
  var publicQuery: Boolean = _
  var projectId: Int = _

  override def toString(): String = {
    val builder = new StringBuilder
    builder ++= "SavedQuery [id="
    builder ++= id.toString
    builder ++= ", name="
    builder ++= name
    builder ++= ", publicQuery="
    builder ++= publicQuery.toString
    builder ++= ", projectId"
    builder ++= projectId.toString
    builder ++= "]"
    builder.toString
  }
}
