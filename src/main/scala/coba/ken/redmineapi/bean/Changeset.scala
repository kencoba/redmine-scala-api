package coba.ken.redmineapi.bean

import java.util.Date

/**
 * Repository Change for a Redmine issue
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class Changeset {
  var revision: String = _
  var user: User = _
  var comments: String = _
  var commitedOn: Date = _

  override def toString(): String = {
    val builder = new StringBuilder
    builder ++= "Changeset [revision="
    builder ++= revision
    builder ++= ", user="
    builder ++= user.toString
    builder ++= ", comments="
    builder ++= comments
    builder ++= ", commitedOn="
    builder ++= commitedOn.toString
    builder ++= "]"
    builder.toString
  }
}
