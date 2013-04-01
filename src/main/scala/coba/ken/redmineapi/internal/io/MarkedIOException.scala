package coba.ken.redmineapi.internal.io

import java.io.IOException

/**
 * IOException, marked by a tag.
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
class MarkedIOException(val fTag:String,val fCause:IOException) extends IOException(fCause) {
  def tag(): String = fTag

  def IOEx:IOException = fCause
}
