package shop.ljsp.other.TopStock_378

class unit1_634_upper1 {
  def upper(strings:String*):Seq[String]={
    strings.map((s:String)=>s.toUpperCase())
  }
  val up=new unit1_634_upper1
  println(up.upper("hello","World!"))
}

