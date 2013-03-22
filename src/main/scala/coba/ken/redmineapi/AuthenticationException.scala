package coba.ken.redmineapi

/**
 * AuthenticationException is thrown when
 * <ul>
 * <li>a user was not authorized (due to invalid or no API access key used when
 * the server requires authorization)
 * <li>OR the user was recognized, but the user permissions do not allow the operation
 * (e.g. trying to create an issue in a project, which the user has no access to).
 * </ul>
 *
 * @author Kenichi Kobayashi
 * @version $Revision$
 * @lastmodified $Date$
 */
case class AuthenticationException(msg:String) extends Exception(msg)
