package shop.ljsp.unit1_String

object string_1_6_959_replaceString {
  def replaceStringByRegex(): Unit ={
    val address="123 Main Street at 756.25632,987.47852".replaceAll("[0-9]{3}","x")
    println(address)
  }
  def replaceByRegexAndGetValue(): Unit ={
    val regex="[0-9]".r
    val newAddress=regex.replaceAllIn("123 main streed","x")
    println(newAddress)
  }
  def main(args: Array[String]): Unit = {
//    replaceStringByRegex
    replaceByRegexAndGetValue
  }
}
