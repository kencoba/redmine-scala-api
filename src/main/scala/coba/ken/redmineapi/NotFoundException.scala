package coba.ken.redmineapi

case class NotFoundException(msg: String) extends RedmineException(msg)
