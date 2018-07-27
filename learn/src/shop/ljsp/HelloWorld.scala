package shop.ljsp

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World!")
    for(i<-1 to 3){
      print(s"$i,")
    }
    println("Scala Rocks!!!")

    for(i<-1 until 3){
      print(s"$i,")
    }
    println("Scala Rocks!!!")
  }

}
