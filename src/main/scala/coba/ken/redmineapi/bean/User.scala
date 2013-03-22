package coba.ken.redmineapi.bean

import java.util.Date

/**
 * Redmine's User.
 * @author Kenichi kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class User extends Identifiable {
  var id: Option[Int] = _
  var login: String = _
  var password: String = _
  var firstName: String = _
  var lastName: String = _
  var mail: String = _
  var createdOn: Date = _
  var lastLoginOn: Date = _

  var customFields: List[CustomField] = _
  var memberships: List[Membership] = _

  override def toString(): String = fullName

  def fullName: String = {
    val builder = new StringBuilder
    builder ++= firstName
    builder ++= " "
    builder ++= lastName
    builder.toString
  }
  def fullName_=(fullName:String) = {
    val names = fullName.split(" ")
    if (names.size != 1) {
      firstName = names(0)
      lastName = names(1)
    } else {
      firstName = fullName
    }
  }

  def customField(fieldName: String): Option[String] = {
    val found = customFields.filter(_.name == fieldName)
    if (found.isEmpty) None else Some(found(0).value)
  }
}
