package shop.ljsp.unit2_Number

object number_2_5_1292_CompareWithFloatOrDouble {
  def ~=(x:Double,y:Double,precision:Double)={
    if((x-y).abs<precision) true else false
  }

  def main(args: Array[String]): Unit = {
    val a=0.1
    val b=0.1+0.2
    println("a->"+a)
    println("b->"+b)
    println(~=(0.3,(0.1+0.2),0.0000000000000000000000000000000001))
  }
}
