package coba.ken.redmineapi.bean

class Role {
  var id: Int = _
  var name: String = _
  var inherited: Boolean = _

  override def toString(): String = {
    val builder = new StringBuilder
    builder ++= "Role [id="
    builder ++= id.toString
    builder ++= ", name=" 
    builder ++= name
    builder ++= ", inherited="
    builder ++= inherited.toString
    builder ++= "]"
    builder.toString
  }
}
