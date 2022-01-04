package cn.edw.bigdata.scala.basic

/**
 * @date 12/10/2021 12:12 AM
 * @author taoxu.xu
 *
 */
object S009_Operator {
  def main(args: Array[String]): Unit = {
    val a = 1 >> 10 / 3 // 4

    val c = a.equals(1)

    // 标准的加法运算
    val d: Int = 1.+(2)

    // 当调用对象的方法时， .可以省略
    // 如果函数的参数个数 <=1，()可以省略
    println(1.toString())
    println(1.toString)
    println(1 toString)
    println(1    toString)
  }
}
