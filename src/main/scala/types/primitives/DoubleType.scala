package types.primitives

import types.interfaces.JsonTrait

/**
  * Created by claudiocavalcante on 5/1/17.
  */
class DoubleType( value: Double ) extends JsonTrait{

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
  def getValue[T]: Double = this.value
}
