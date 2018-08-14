package shop.ljsp.unit2_Number

object number_2_6_1305_BigNumber {

  def operateBigNumberLikeNormalNumber(): Unit ={
    val b=BigInt(1234567890)
    println(b+b)
    val a=BigDecimal(123456.789)
    println(a*a)
  }
  def typeConvertWithBigNumber(): Unit ={
    val a=BigInt(1234)
    val b=a.toInt
    println("a->"+b.getClass.getName+"="+b)
    val c=BigInt(123456789)
    //confirm the BigInt is can be convert.
    println("c can be convert to Byte :"+c.isValidByte)

    if(c.isValidLong) println(c.toLong)
  }
  def main(args: Array[String]): Unit = {
    val b=BigInt(1234567890)
    println("b->"+b.getClass.getName+"="+b)
    val a=BigDecimal(123456.789)
    println("a->"+a.getClass.getName+"="+a)
    /*
    b->scala.math.BigInt=1234567890
    a->scala.math.BigDecimal=123456.789
     */
    operateBigNumberLikeNormalNumber

    typeConvertWithBigNumber
  }
}
