package types.primitives

import types.interfaces.JsonTrait

/**
  * Created by claudiocavalcante on 5/1/17.
  */
class DoubleType( value: Double ) extends JsonTrait[Double]( value ){

  /**
    * Function that turns the json object into a JsonString
    *
    * @return String
    **/
  override def toJsonString: String = this.getValue.toString
}
