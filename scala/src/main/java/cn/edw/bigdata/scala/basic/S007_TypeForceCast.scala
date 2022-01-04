package cn.edw.bigdata.scala.basic

/**
 * @date 12/9/2021 11:57 PM
 * @author taoxu.xu
 *
 */
object S007_TypeForceCast {
  def main(args: Array[String]): Unit = {
    val a: Double = 1.2
    val b: Int = a.toInt
    val c = 2.2f.toByte
    println(b, c)
  }
}
