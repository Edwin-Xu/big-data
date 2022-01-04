package cn.edw.bigdata.scala.basic

/**
 * @date 12/21/2021 12:07 AM
 * @author taoxu.xu
 *
 */
object S017_ObjectAbstract{
  def main(args: Array[String]): Unit = {
    new AA{
      override var name: String = "edw"

      override def hi(): Unit = println("hi")
    }
  }
}

abstract class AA{
  var name:String
  def hi():Unit
}