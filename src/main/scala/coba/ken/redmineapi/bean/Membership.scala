package coba.ken.redmineapi.bean

/**
 * User or group membership.
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class Membership extends Identifiable {
  var id: Option[Int] = _
  var project: Project = _

  var user: User = _
  var roles: List[Role] =_

  override def toString(): String = {
    val builder = new StringBuilder
    builder ++= "Membership [id="
    builder ++= id.toString
    builder ++= ", project="
    builder ++= project.toString
    builder ++= ", user="
    builder ++= user.toString
    builder ++= ", roles="
    builder ++= "]"
    builder.toString
  }
}
