package exceptions

/**
  * Created by claudiocavalcante on 5/1/17.
  */
class KeyExistsException( key: String ) extends Exception(
  "The key [ " + key + " ]  exists at this level of the object!"
)
