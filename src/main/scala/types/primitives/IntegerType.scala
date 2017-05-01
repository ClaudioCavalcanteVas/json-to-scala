package types.primitives

import types.interfaces.JsonTrait

class IntegerType(value: Int) extends JsonTrait[Int](value) {

  /**
    * Function that turns the json object into a JsonString
    *
    * @return String
    **/
  override def toJsonString: String = this.getValue.toString
}
