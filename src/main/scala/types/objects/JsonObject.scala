package types.objects

import exceptions._
import types.interfaces.{JsonTrait, Searchable, Updatable}
import types.primitives._

/**
  * Created by claudiocavalcante on 5/1/17.
  */
class JsonObject( var value: List[Node] = List()  ) extends JsonTrait
  with Updatable with Searchable {

  /**
    * Adds a new node into the Object. If the node's key exists, throws an KeyExistsException
    *
    * @param node: types.objects.Node
    *
    * @return Unit
    * */
  def addNode( node: Node ): Unit = {
    if ( this.contains( node.getKey ) )
      throw new KeyExistsException( node.getKey )
    else
      this.value = this.value ::: List(node)
  }

  /**
    * Creates a Node with the string value. If the node's key exists, throws an KeyExistsException
    *
    * @param key: String
    * @param value: String
    *
    * @return Unit
    * */
  def add( key: String, value: String ): Unit = {

    if ( this.contains( key ) )
      throw new KeyExistsException( key )
    else {
      val node = new Node( key, new StringType( value ) )

      this.value = this.value ::: List(node)
    }

  }

  /**
    * Creates a Node with the Int value. If the node's key exists, throws an KeyExistsException
    *
    * @param key: String
    * @param value: Int
    *
    * @return Unit
    * */
  def add( key: String, value: Int ): Unit = {

    if ( this.contains( key ) )
      throw new KeyExistsException( key )
    else {
      val node = new Node( key, new IntegerType( value ) )

      this.value = this.value ::: List(node)
    }

  }

  /**
    * Creates a Node with the Int value. If the node's key exists, throws an KeyExistsException
    *
    * @param key: String
    * @param value: Int
    *
    * @return Unit
    * */
  def add( key: String, value: Boolean ): Unit = {

    if ( this.contains( key ) )
      throw new KeyExistsException( key )
    else {
      val node = new Node( key, new BooleanType( value ) )

      this.value = this.value ::: List(node)
    }

  }

  /**
    * Creates a Node with the Int value. If the node's key exists, throws an KeyExistsException
    *
    * @param key: String
    * @param value: Int
    *
    * @return Unit
    * */
  def add( key: String, value: Long ): Unit = {

    if ( this.contains( key ) )
      throw new KeyExistsException( key )
    else {
      val node = new Node( key, new LongType( value ) )

      this.value = this.value ::: List(node)
    }

  }

  /**
    * Creates a Node with the Int value. If the node's key exists, throws an KeyExistsException
    *
    * @param key: String
    * @param value: Int
    *
    * @return Unit
    * */
  def add[T]( key: String, value: Array[T] ): Unit = {

    if ( this.contains( key ) )
      throw new KeyExistsException( key )
    else {
      val node = new Node( key, new ArrayType( value ) )

      this.value = this.value ::: List(node)
    }

  }

  /**
    * Function that turns the json object into a JsonString
    *
    * @return String
    **/
  override def toJsonString: String = this.getValue.map( _.toJsonString ).mkString("{", ",", "}")

  /**
    * Updates the value from a updatable json object
    *
    * @param value : T
    **/
  override def updateValue(key: String, value: JsonTrait): Unit = {
    findByKey( key ).updateValue( key, value )
  }

  /**
    * Returns the first value found by a key. If the value doesn't exists, @throws a KeyNotFoundException
    *
    * @param key: String
    *
    * @return Node[T]
    * */
  override def findByKey[A](key: String): Node = {
    val found = this.getValue.filter(_.getKey == key)

    if ( found.isEmpty )
      throw new KeyNotFoundException( key )
    else
      found.head
  }

  /**
    * Checks if the key exists
    *
    * @param key : String
    * @return Boolean
    **/
  override def contains(key: String): Boolean = this.getValue.exists( _.getKey == key )

  override def getKey: String = null

  /** Returns the Main value of a json type
    *
    * @return T
    * */
  def getValue: List[Node] = this.value
}
