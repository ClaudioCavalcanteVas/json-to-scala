package types.objects

import types.interfaces.JsonTrait

/**
  * Created by claudiocavalcante on 5/1/17.
  */
class Node[T]( key: String, var value: JsonTrait[T] ) extends JsonTrait[JsonTrait[T]]( value ){
  /**
    * Function that turns the json object into a JsonString
    *
    * @return String
    **/
  override def toJsonString: String = "{" + "\"" + key +"\": " + value.toJsonString + "}"
}
