package cn.edw.bigdata.scala.basic

/**
 * @date 12/9/2021 1:04 AM
 * @author taoxu.xu
 *
 */
object S005_Type {
  def main(args: Array[String]): Unit = {
    val a: Byte = 1
    val b: Short = 2
    val c: Int = 3
    val d: Long = 4

    val e: Char = 'a'

    val f: Boolean = false

    val g: Float = 3.0f
    val h: Double = 4.0

    val i: Null = null
    // val i:Int = null  ERR: null不能赋值给AnyVal
    val j: Unit = Unit
    val k: Unit = ()

    def f1(): Unit = {

    }

    def f2(): Nothing = {
      // no return
      throw new Exception()
    }
  }
}
