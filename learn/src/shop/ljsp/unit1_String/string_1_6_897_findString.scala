package shop.ljsp.unit1_String

object string_1_6_897_findString {
  def regex(): Unit ={
    val numPattern="[0-9]+".r
    val address="123 Main String Suite 101"
    val match1=numPattern.findFirstIn(address)
    println(match1.toString)
    println(match1.getClass.getName)
    val matches=numPattern.findAllMatchIn(address)
    matches.foreach(println)
    println( matches.getClass.getName)

  }
  def main(args: Array[String]): Unit = {
    regex
  }
}
