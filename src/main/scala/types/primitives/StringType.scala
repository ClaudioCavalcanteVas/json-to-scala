package types.primitives

import types.interfaces.JsonTrait

class StringType( value: String ) extends JsonTrait {

  /**
    * Function that turns the json object into a JsonString
    *
    * @return String
    **/
  override def toJsonString: String = "\"" + getValue + "\""

  /**
    * Returns the Main value of a json type
    *
    * @return T
    **/
  def getValue: String = this.value
}
