package coba.ken.redmineapi.internal.io

import java.io.FilterInputStream
import java.io.IOException
import java.io.InputStream

final class MarkedInputStream(in:InputStream, val tag:String) extends FilterInputStream(in) {

  @throws(classOf[IOException])
  override def available(): Int = {
    try {
      super.available
    } catch {
      case e:IOException => throw new MarkedIOException(tag, e)
    }
  }

  @throws(classOf[IOException])
  override def close(): Unit = {
    try {
      super.close
    } catch {
      case e:IOException => throw new MarkedIOException(tag, e)
    }
  }

  @throws(classOf[IOException])
  override def read(): Int = {
    try {
      super.read
    } catch {
      case e:IOException => throw new MarkedIOException(tag, e)
    }
  }
   
  @throws(classOf[IOException])
  override def read(b:Array[Byte]): Int = {
    try {
      super.read(b)
    } catch {
      case e:IOException => throw new MarkedIOException(tag, e)
    }
  }

  @throws(classOf[IOException])
  override def read(b:Array[Byte], off:Int, len:Int): Int = {
    try {
      super.read(b, off, len)
    } catch {
      case e:IOException => throw new MarkedIOException(tag, e)
    }
  }

  @throws(classOf[IOException])
  override def reset(): Unit = {
    synchronized {
      try {
        super.reset
      } catch {
        case e:IOException => throw new MarkedIOException(tag, e)
      }
    }
  }

  @throws(classOf[IOException])
  override def skip(n:Long): Long = {
    try {
      super.skip(n)
    } catch {
      case e:IOException => throw new MarkedIOException(tag, e)
    }
  }
}
