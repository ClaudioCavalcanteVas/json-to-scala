package types.interfaces

abstract class JsonTrait {

  /**
    * Function that turns the json object into a JsonString
    *
    * @return String
    * */
  def toJsonString: String

  protected def getKey: String = null

}
