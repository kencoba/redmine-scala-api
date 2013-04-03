package coba.ken.redmineapi

/**
 * User or password (or API access key) not recognized.
 *
 * @author Kenichi Kobayashi
 */
class RedmineAuthenticationException(message: String) extends RedmineSecurityException(message)
