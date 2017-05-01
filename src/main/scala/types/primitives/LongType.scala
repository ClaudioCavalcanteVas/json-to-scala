package types.primitives

import types.interfaces.JsonTrait

class LongType( value: Long ) extends JsonTrait {

  /**
    * Function that turns the json object into a JsonString
    *
    * @return String
    **/
  override def toJsonString: String = value.toString

}
