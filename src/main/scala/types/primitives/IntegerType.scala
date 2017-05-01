package types.primitives

import types.interfaces.JsonTrait

class IntegerType(value: Int) extends JsonTrait {

  /**
    * Function that turns the json object into a JsonString
    *
    * @return String
    **/
  override def toJsonString: String = this.value.toString

  /**
    * Returns the Main value of a json type
    *
    * @return T
    **/
  def getValue: Int = this.value
}
