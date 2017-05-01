package types.primitives

import types.interfaces.JsonTrait

class BooleanType( value: Boolean ) extends JsonTrait[Boolean]( value ){

  /**
    * Function that turns the json object into a JsonString
    *
    * @return String
    **/
  override def toJsonString: String = this.getValue.toString
}
