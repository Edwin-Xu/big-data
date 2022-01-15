package cn.edw.bigdata.scala.collection

import scala.collection.mutable

/**
 * @date 1/12/2022 12:03 AM
 * @author taoxu.xu
 *
 */
object C008_Map {
  def main(args: Array[String]): Unit = {
    // un mutable map
    val map01: Map[Int, String] = Map(1 -> "a", 2 -> "b")
    println(map01.keys.mkString(","))
    println(map01.getOrElse(1, "none"))
    // mutable map
    val map02 = mutable.Map(1 -> "x")
    map02.put(2, "y")
    map02.+=(3 -> "z")
    map02.-=(3)
  }
}
