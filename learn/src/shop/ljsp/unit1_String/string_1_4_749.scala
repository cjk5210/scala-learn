package shop.ljsp.unit1_String

object string_1_4_749 {

  def variableInsertIntoString(): Unit ={
    val name="Fred"
    val age=33
    val weight=200.00
    println(s"$name is $age years old, and $weight pounds.")
//show:Fred is 33 years old, and 200.0 pounds.
  }
  def printf(): Unit ={
    val name="Fred"
    val age=33
    val weight=200.00
    val out=f"$name is $age years old, and $weight%.0f pounds."
    println(out)
  }
  def rawInsertSymbol(): Unit ={
    println(s"foo\nbar")
    println(raw"foo\nbar")
  }
/*
"C:\Program Files\Java\jdk1.8.0_161\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\lib\idea_rt.jar=58079:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_161\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\rt.jar;D:\tensor\scala\scala-learn\out\production\learn;C:\scala\lib\scala-library.jar;C:\scala\lib\scala-parser-combinators_2.12-1.0.7.jar;C:\scala\lib\scala-reflect.jar;C:\scala\lib\scala-swing_2.12-2.0.0.jar;C:\scala\lib\scala-xml_2.12-1.0.6.jar" shop.ljsp.unit1_String.string_1_4_749
foo
bar
foo\nbar

Process finished with exit code 0
-------------------
raw means it won't translate the symbol \n,
you can also define yourself symbol like 's' or 'f'
 */
  //1_5 deal with every char for String
  def upperLetter(): Unit ={
    val upper="hello, world".map(c=>c.toUpper)
    println(upper)
    val upper2="hello, world".map(_.toUpper)
    println(upper2)
  }
  def printEveryLetter(): Unit ={
    for (c<-"hello,world") println(c)
  }
  def forYield(): Unit ={
    val upper = for(c<-"hello,world!") yield c.toUpper
    println(upper)
  }
  def forYieldWithCondition(): Unit ={
    val result=for{
      c<-"hello, world"
      if c!='l'
    } yield c.toUpper
    result.foreach(println)
  }
  def main(args: Array[String]): Unit = {
//    variableInsertIntoString
//    printf
//    rawInsertSymbol
//    upperLetter
//    printEveryLetter
//    forYield
    forYieldWithCondition
  }
}
