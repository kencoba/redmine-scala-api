package coba.ken.redmineapi.bean

import java.util.Date

/**
 * Redmine issue journal field
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class Journal(var id:Int, var notes: String, var user:User,
              var createdOn: Date, var details: List[JournalDetail]) {
  def this() = this(0,null,null,null,null)
  
  def this(id: Int, notes: String, user: User, createdOn: Date) = {
    this(id,notes,user,createdOn,List[JournalDetail]())
  }

  override def toString(): String = {
    val builder = new StringBuilder
    builder ++= "Journal [id="
    builder ++= id.toString
    builder ++= ", notes="
    builder ++= notes
    builder ++= ", user="
    builder ++= user.toString
    builder ++= ", createdOn="
    builder ++= createdOn.toString
    builder ++= ", details="
    builder ++= details.toString
    builder ++= "]"
    builder.toString
  }
}

  
