package shop.ljsp.unit2_Number

object number_2_2_1186_typeConvert {
  def convertTest(): Unit ={


    val b=19.45.toInt
    println("b->"+b.getClass.getName+"="+b)

    val c=19.toFloat
    println("c->"+c.getClass.getName+"="+c)

    val d=19.toDouble
    println("d->"+d.getClass.getName+"="+d)

    val e=19.toLong
    println("e->"+e.getClass.getName+"="+e)

    val f="1945".toFloat
    println("f->"+f.getClass.getName+"="+f)


  }
  def defineVariableWithType(): Unit ={
    var a:Short=1
     a=32767
    println("a->"+a.getClass.getName+"="+a+"--"+Short.MaxValue)
  }
  def main(args: Array[String]): Unit = {
//    convertTest
    defineVariableWithType
  }


}
