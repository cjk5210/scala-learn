package shop.ljsp.preface

object ErgodicArray {
  def forArray(): Unit ={
    for(i<-Array(1,2,3)) println(i*2)
  }
  def forYield(): Unit ={

    (for(i<-Array(1L,2L,3L)) yield i*2).foreach((y:Long)=>println(y))
  }
  def forMap(): Unit ={
    Array(1,2,3).map(_*2).foreach((x:Int)=>println(x))
  }
  def listFilter(): Unit ={
    val nums=List(1,2,3,4,5).filter(_<4)
    nums.foreach((u:Int)=>println(u*2))
  }
  def main(args: Array[String]): Unit = {
//    forArray()
    forYield()
//    forMap()
//    listFilter()
  }

}
