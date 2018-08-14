package shop.ljsp.unit2_Number

object number_2_7_1334_RandomNumber {
  def createRandom(): Unit ={
    val a=scala.util.Random
    println(a.nextLong)
    println(a.nextInt)
    //between 0 and 1
    println(a.nextFloat)
    println(a.nextDouble())
    println("------------------")
    //set seed
    val b=new scala.util.Random(100)
    println(b.nextLong)
    println(b.nextInt)
    //between 0 and 1
    println(b.nextFloat)
  }

  def main(args: Array[String]): Unit = {
    createRandom
  }
}
