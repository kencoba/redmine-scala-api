package coba.ken.redmineapi.bean

import java.util.Date

/**
 * File Attachment for a Redmine issue
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class Attachment extends Identifiable {
  var id: Option[Int] = _
  var fileName: String = _
  var fileSize: Long = _
  var contentType: String = _
  var contentURL: String = _
  var description: String = _
  var createdOn: Date = _
  var author: User = _
  var token: String = _

  override def toString(): String = {
    val builder = new StringBuilder
    builder ++= "Attachment [id="
    builder ++= id.toString
    builder ++= ", fileName="
    builder ++= fileName
    builder ++= ", fileSize="
    builder ++= fileSize.toString
    builder ++= ", contentType="
    builder ++= contentType
    builder ++= ", contentURL="
    builder ++= contentURL
    builder ++= ", description="
    builder ++= description
    builder ++= ", createdOn="
    builder ++= createdOn.toString
    builder ++= ", author="
    builder ++= author.toString
    builder ++= ", token="
    builder ++= token
    builder ++= "]"
    builder.toString
  }
}
