package exceptions

/**
  * Created by claudiocavalcante on 5/1/17.
  */
class KeyNotFoundException( key: String ) extends Exception(
  "Key " + key + " not found!"
)
