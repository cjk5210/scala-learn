package shop.ljsp.unit2_Number

object number_2_4_1247_plusAndMinus {
  def main(args: Array[String]): Unit = {
    var a=1
    //replace a++,because '+' is a method in scala,so we can't use ++
    a+=1
    var b=2
    //replace b--,because '-' is a method in scala
    b-=1

    println("a->"+a)
    println("b->"+b)
  }
}
