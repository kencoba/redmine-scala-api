package coba.ken.redmineapi

/**
 *
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */

case class RedmineInternalError(message: String, cause: Throwable)
extends Error(message, cause) {
  def this() = this(null: String, null: Throwable)

  def this(message: String) = this(message, null: Throwable)

  def this(cause: Throwable) = this(null: String, cause)
}
