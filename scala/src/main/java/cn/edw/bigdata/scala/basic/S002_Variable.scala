package cn.edw.bigdata.scala.basic

/**
 * @date 12/9/2021 12:24 AM
 * @author taoxu.xu
 *
 */
object S002_Variable {
  def main(args: Array[String]): Unit = {
    // var changeable
    var a = 10
    // declare type
    var b: Int = 20
    //val: unchangeable
    val c: Int = 30
    // c = 40  // ERR
    val d = a + b + c
  }
}
