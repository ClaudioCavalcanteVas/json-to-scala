package types.interfaces

/**
  * Created by claudiocavalcante on 5/1/17.
  */
trait Updatable {

  /**
    * Updates the value from a updatable json object
    *
    * @param value: T
    * */
  def updateValue( key: String, value: JsonTrait ): Unit

}
