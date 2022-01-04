package cn.edw.bigdata.scala.basic

/**
 * @date 12/26/2021 12:02 AM
 * @author taoxu.xu
 *
 */
object S020_EnumApp {
  def main(args: Array[String]): Unit = {
  }
}

class Enum extends Enumeration{
  val RED: Value = Value(1, "red")
}
object MyApp extends App{
  // Type 定义新类型
  type Str = String
  var name:Str = "edwin xu"
  println(s"$name")

  private val enum = new Enum
  println(`enum`.RED)
}