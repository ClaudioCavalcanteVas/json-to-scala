package types.primitives

import types.interfaces.JsonTrait

/**
  * Created by claudiocavalcante on 5/1/17.
  */
class ArrayType[T]( value: Array[T] ) extends JsonTrait{

  /**
    * Returns the Main value of a json type
    *
    * @return T
    **/
  def getValue: Array[T] = this.value

  /**
    * Function that turns the json object into a JsonString
    *
    * @return String
    **/
  override def toJsonString: String = value.map( translate(_).toJsonString ).mkString("[", ",", "]")

  /**
    * Function used to translate the inner values from value array
    *
    * @param elem: T
    *
    * @return JsonTrait
    * */
  def translate( elem: T ) = elem match {
    case string: String => new StringType( string )
    case int: Int => new IntegerType( int )
    case long: Long => new LongType( long )
    case double: Double => new DoubleType( double )
    case boolean: Boolean => new BooleanType( boolean )
    case array: Array[T] => new ArrayType[T]( array )
  }

}
