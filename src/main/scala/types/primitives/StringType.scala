package types.primitives

import types.interfaces.JsonTrait

class StringType( value: String ) extends JsonTrait[String]( value ) {
  /**
    * Function that turns the json object into a JsonString
    *
    * @return String
    **/
  override def toJsonString: String = "\"" + getValue + "\""


}
