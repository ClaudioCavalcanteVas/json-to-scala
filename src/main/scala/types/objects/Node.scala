package types.objects

import types.interfaces.{JsonTrait, Updatable}

class Node( key: String, var value: JsonTrait ) extends JsonTrait
 with Updatable {

  override def getKey: String = this.key

  /**
    * Returns the Main value of a json type
    *
    * @return T
    **/
  def getValue: JsonTrait = this.value

  /**
    * Function that turns the json object into a JsonString
    *
    * @return String
    **/
  override def toJsonString: String = "\"" + key +"\": " + value.toJsonString

  /**
    * Updates the value from a updatable json object
    *
    * @param value : T
    **/
  override def updateValue(key: String, value: JsonTrait): Unit = this.value = value
}
