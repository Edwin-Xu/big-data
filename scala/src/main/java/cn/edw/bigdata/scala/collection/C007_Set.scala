package cn.edw.bigdata.scala.collection

import scala.collection.mutable

/**
 * @date 1/11/2022 11:59 PM
 * @author taoxu.xu
 *
 */
object C007_Set {
  def main(args: Array[String]): Unit = {
    // 不可变SET
    val set01: Set[Int] = Set(1, 2, 3)
    // 可变set:mutable.Set
    val set02: mutable.Set[Int] = mutable.Set(1, 2, 3)
    // add ele
    set02 += 4
    // add ele and return a new set
    val set03 = set02.+(5)
  }
}
