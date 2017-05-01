package types.interfaces

/**
  * Created by claudiocavalcante on 5/1/17.
  */
trait Searchable {

  def findByKey[A]( key: String ): JsonTrait

  /**
    * Checks if the key exists
    *
    * @param key: String
    *
    * @return Boolean
    * */
  def contains( key: String ): Boolean

}
