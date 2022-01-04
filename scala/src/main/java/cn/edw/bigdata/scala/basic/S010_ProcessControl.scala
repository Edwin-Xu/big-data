package cn.edw.bigdata.scala.basic

import scala.language.postfixOps
import scala.util.control.Breaks

/**
 * @date 12/10/2021 12:29 AM
 * @author taoxu.xu
 *
 */
object S010_ProcessControl {
  def main(args: Array[String]): Unit = {
    val age = Math.random() * 100
    val res = if (age < 10) {
      "young man"
    } else if (age < 50) {
      "adult"
    } else {
      "old man"
    }
    println(res)


    // 前后闭合
    for (i <- 1 to 3) {
      print(i)
    }
    println()

    // until： 前开后闭 1-2
    for (i <- 1 until 3) {
      print(i)
    }
    println()

    // 循环守卫，类似continue
    for (i <- 1 until 10 if i % 3 != 0) {
      print(i)
    }
    println()

    // 步长
    for (i <- 1 to 9 by 3) {
      print(i)
    }
    println()

    // 多重循环嵌套
    for (i <- 1 to 3; j <- 1 to 3; k <- 0 to 3) {
      println(i, j, k)
    }

    for {
      i <- 1 to 10
      j = 2 * i
      k = 3 * j
    } {
      println(i, j, k)
    }

    val R = for (i <- 1 to 3) yield i * 10
    println(R)
    val r = for (i <- 1 to 3) yield {
      i * Math.PI
    }
    println(r)
    // Vector(10, 20, 30)
    // Vector(3.141592653589793, 6.283185307179586, 9.42477796076938)

    for (i <- 1 to 3 reverse) {
      print(i)
    }
    println()


    // 循环中断
    // 1.异常退出中断
    try {
      for (i <- 1 to 3) {
        if (i % 2 == 0) throw new Exception
        print(i)
      }
    } catch {
      case  e: Throwable => println(e.getMessage)
    }
    println()

    // 2. Scala自带的函数 Breaks.break()
    Breaks.breakable{
      for (i <- 1 to 3) {
        if (i % 2 == 0) Breaks.break()
        print(i)
      }
    }

  }
}
