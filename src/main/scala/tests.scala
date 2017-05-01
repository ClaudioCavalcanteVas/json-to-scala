import types.primitives._
import types.objects._

/**
  * Created by claudiocavalcante on 5/1/17.
  */
object tests extends App{

  val string = new StringType( "Agua" )

  println( string.getValue )

  val array = new ArrayType( Array(
      "a", "b", "c", Array( 1,2,3 ), true
    )
  )

  println(array.toJsonString)

  val node = new Node( "string", string )
  val arrNode = new Node( "array", array )

  println( node.toJsonString )
  println( arrNode.toJsonString )

  val json = new JsonObject

  json.addNode(node)

  json.add("Boolean", true)

  json.add("Int", 5)

  json.addNode( arrNode )

  println( json.toJsonString )

  val otherJson = new JsonObject

  val treeNode = new Node( "GOD LIKE", json )

  otherJson.addNode( treeNode )

  println( otherJson.toJsonString )

}
