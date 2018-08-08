package shop.ljsp.unit1_String

object string_1_1_663 {
  def testEquals(): Unit ={
    val s1="Hello"
    val s2="Hello"
    val s3="H"+"ello"
    println("s1==s2 is "+(s1==s2))
    println("s1==s3 is "+(s1==s3))
    println("-----------------------------")
    val s4:String=null
    println("s3==s4 is "+(s3==s4))//without Exception and Error
  }
  def compareStringIgnoreCase(): Unit ={
    val s1="Hello"
    val s2="hello"
    println("Hello is equals with hello by ignore case ,That's "+(s1.toUpperCase==s2.toUpperCase)+".")
  }
  def splitAndUseMapToTrim(): Unit ={
    val s="eggs, milk, butter, Codo Puffs"
    s.split(",").map(_.trim)
    .foreach(println)
  }
  def main(args: Array[String]): Unit = {
//    testEquals()
//    compareStringIgnoreCase
    splitAndUseMapToTrim
  }

}
