package coba.ken.redmineapi.internal.comm

import java.io.InputStream

/**
 * Basic http entity. Just an internal implementation to use with proper wrappers, etc...
 *
 * @author Kenichi Kobayashi
 */
final class BasicHttpResponse(val responceCode:Int,val stream: InputStream,val charset: String)
