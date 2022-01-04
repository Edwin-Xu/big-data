package cn.edw.bigdata.scala.basic

import scala.io.StdIn

/**
 * @date 12/9/2021 12:48 AM
 * @author taoxu.xu
 *
 */
object S004_Input {
  def main(args: Array[String]): Unit = {
    val name: String = StdIn.readLine()
    val age: Int = StdIn.readInt()
    println(name + " - " + age)
  }
}
