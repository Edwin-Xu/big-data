package cn.edw.bigdata.scala.basic

/**
 * @date 12/10/2021 12:05 AM
 * @author taoxu.xu
 *
 */
object S008_NumStrCast {
  def main(args: Array[String]): Unit = {
    // num to str
    val a: String = 1.toString
    val b: String = 2 + ""
    // str to num
    val c: Int = "234".toInt
    val d: Double = "1.2".toDouble
    println(a, b, c, d)
  }
}
