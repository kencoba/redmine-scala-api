package coba.ken.redmineapi

/**
 * Some Redmine configuration is not set properly.
 * E.g. invalid port number is provided to RedmineManager class
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */

case class RedmineConfigurationException(message: String, e: NumberFormatException) extends RuntimeException(message)
