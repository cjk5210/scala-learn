package shop.ljsp.unit2_Number

import org.joda.time.DateTime

object number_2_0_1110TypeRange {
  def showRange(): Unit ={
    println(Short.MinValue)
    println(Short.MaxValue)

    println(Int.MinValue)
    println(Int.MaxValue)

    println(Long.MinValue)
    println(Long.MaxValue)

    println(Float.MinValue)
    println(Float.MaxValue)

    println(Double.MinValue)
    println(Double.MaxValue)

  }

  def main(args: Array[String]): Unit = {
    showRange
  }
}
