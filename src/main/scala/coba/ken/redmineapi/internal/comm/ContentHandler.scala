package coba.ken.redmineapi.internal.comm

import coba.ken.redmineapi.RedmineException

/**
 * Redmine content handler.
 * 
 * @author Kenichi Kobayashi
 */
trait ContentHandler[K,R] {
  /**
   * Consumes content of a specified type and returns a specified result.
   *
   * @param content
   *            content to process.
   * @return processed content.
   * @throws RedmineException
   *            if something goes wrong.
   */
  @throws(classOf[RedmineException])
  def processContent(content:K): R
}
