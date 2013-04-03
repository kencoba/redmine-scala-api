package coba.ken.redmineapi

/**
 * Connection pooling options.
 *
 * @author Kenichi Kobayashi
 *
 * @param maxOpen
 *            number of open connections.
 * @param idleTimeout
 *            idle timeout in seconds.
 * @param evictionCheck
 *            timeout between evictions checks in seconds.
 */
final class RedmineOptions(val maxOpen:Int, val idleTimeout:Int, val evictionCheck:Int) {

  def maxOpenConnections = maxOpen

  def evictionCheckInterval = evictionCheck
}

object RedmineOptions {
  def simpleOptions(): RedmineOptions = new RedmineOptions(Int.MaxValue, 30, 30)

  def withMaxConnections(maxOpen:Int): RedmineOptions = new RedmineOptions(maxOpen, 30, 30)
}
