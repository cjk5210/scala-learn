package shop.ljsp.unit1_String

object string_1_8_regexExtract {
  def extract(): Unit ={
    val pattern="([0-9]+) ([A-Za-z]+)".r
    val pattern(count,fruit)="100 Bananas"
    //This is a special method to define  variable.
    println(count)
    println(fruit)
  }
  def getCharAt(): Unit ={
    val ch="hello".charAt(1)

    println(ch)
    val chA="hello"(1)
    print(chA)

  }
  def main(args: Array[String]): Unit = {
//    extract
    getCharAt
  }

}
