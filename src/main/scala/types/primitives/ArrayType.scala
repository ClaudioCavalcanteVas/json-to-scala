package types.primitives

import types.interfaces.JsonTrait

/**
  * Created by claudiocavalcante on 5/1/17.
  */
class ArrayType[T]( value: Array[T] ) extends JsonTrait[Array[T]]( value ){

  /**
    * Function that turns the json object into a JsonString
    *
    * @return String
    **/
  override def toJsonString: String = value.map( translate(_).toJsonString ).mkString("[", ",", "]")

  def translate( elem: T ) = elem match {
    case string: String => new StringType( string )
    case int: Int => new IntegerType( int )
    case long: Long => new LongType( long )
    case double: Double => new DoubleType( double )
    case boolean: Boolean => new BooleanType( boolean )
    case array: Array[T] => new ArrayType[T]( array )
  }

}
