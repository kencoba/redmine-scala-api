package coba.ken.redmineapi.bean

/**
 *
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class TimeEntryActivity {
  var id: Int = _
  var name: String = _
  var isDefault: Boolean = _

  override def toString(): String = {
    val builder = new StringBuilder
    builder ++= "TimeEntryActivity [id="
    builder ++= id.toString
    builder ++= ", name="
    builder ++= name
    builder ++= ", isDefault="
    builder ++= isDefault.toString
    builder ++= "]"
    builder.toString
  }
}
