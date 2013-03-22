package coba.ken.redmineapi.bean

/**
 * Redmine custom field
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class CustomField(var id: Int, var name: String,v: String) {
  var multiple: Boolean = false
  private var fValue = v
  private var fValues: List[String] = List[String]()

  def this() = this(0,null,null)

  def value: String = if (!multiple || fValues.isEmpty) fValue else fValues(0)

  def value_=(value: String) = {
    fValue = value
    fValues = null
    multiple = false
  }

  def values: List[String] = fValues

  def values_=(values: List[String]) = {
    fValues = values
    fValue = null
    multiple = true
  }

  override def toString: String = {
    val builder = new StringBuilder
    builder ++= "CustomField [id="
    builder ++= id.toString
    builder ++= ", name="
    builder ++= name
    builder ++= ", value="
    builder ++= value
    builder ++= ", values="
    builder ++= values.toString
    builder ++= ", multiple="
    builder ++= multiple.toString
    builder ++= "]"
    builder.toString
  }
}
