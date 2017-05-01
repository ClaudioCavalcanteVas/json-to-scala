package types.interfaces

abstract class JsonTrait[T]( value: T ) {

  /**
    * Function that turns the json object into a JsonString
    *
    * @return String
    * */
  def toJsonString: String

  /**
    * Returns the Main value of a json type
    *
    * @return T
    * */
  def getValue: T = this.value

}
