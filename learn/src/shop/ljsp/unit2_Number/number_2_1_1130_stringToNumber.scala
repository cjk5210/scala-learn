package shop.ljsp.unit2_Number

object number_2_1_1130_stringToNumber {
  def main(args: Array[String]): Unit = {
//    stringToNumber
//    bigIntAndBigDecimal
    parseIntFromOtherHexadecimal
  }
  def bigIntAndBigDecimal(): Unit ={
    val a=BigInt("1")
    val b=BigDecimal("3.1415926")
    println("a->"+a.getClass.getName)
    println("b->"+b.getClass.getName)
  }
  /*
  a->scala.math.BigInt
  b->scala.math.BigDecimal
   */


  def parseIntFromOtherHexadecimal(): Unit ={
    println(Integer.parseInt("1",2))
    println(Integer.parseInt("10",2))
    println(Integer.parseInt("100",2))
    println(Integer.parseInt("1",8))
    println(Integer.parseInt("10",8))
    println(Integer.parseInt("10",16))
  }

  def stringToNumber(): Unit ={
    println("100->"+"100".toInt.getClass.getName)
    println("100->"+"100".toDouble.getClass.getName)
    println("100->"+"100".toFloat.getClass.getName)
    println("100->"+"100".toLong.getClass.getName)
    println("100->"+"100".toShort.getClass.getName)
    println("100->"+"100".toByte.getClass.getName)
  }
}
