package cn.edw.bigdata.scala.basic

/**
 * @date 12/9/2021 11:43 PM
 * @author taoxu.xu
 *
 */
object S006_TypeCast {
  def main(args: Array[String]): Unit = {
    val a = 1 + 0.2 + 3.4f + 'c'
    println(a) // 103.60000009536743  !

    val b: Byte = 1
    val c: Char = 'a'
    val d: Short = 1
    val e = b + c - d
    println(e)
  }
}
