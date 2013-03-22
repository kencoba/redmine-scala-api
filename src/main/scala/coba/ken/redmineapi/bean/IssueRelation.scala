package coba.ken.redmineapi.bean

/**
 *
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class IssueRelation extends Identifiable {
  object TYPE extends Enumeration {
    val precedes = Value
  }

  var id: Option[Int] = _
  var issueId: Int = _
  var issueToId: Int = _
  var typeOf: String = _
  var delay: Int = _
  
  override def toString(): String = {
    val builder = new StringBuilder
    builder ++= "IssueRelation [id="
    builder ++= id.toString
    builder ++= ", issueId="
    builder ++= issueId.toString
    builder ++= ", issueToId="
    builder ++= issueToId.toString
    builder ++= ", typeOf="
    builder ++= typeOf
    builder ++= ",delay="
    builder ++= delay.toString
    builder ++= "]"
    builder.toString
  }
}
