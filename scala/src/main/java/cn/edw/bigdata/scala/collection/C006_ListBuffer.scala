package cn.edw.bigdata.scala.collection

import scala.collection.mutable.ListBuffer

/**
 * @date 1/11/2022 11:52 PM
 * @author taoxu.xu
 *
 */
object C006_ListBuffer {
  def main(args: Array[String]): Unit = {
    val buffer: ListBuffer[Int] = ListBuffer(1, 2)
    // 这种形式都是生成新的ListBuffer
    buffer.+:(-1)
    buffer.:+(3)
    buffer.append(4)
    println(buffer.mkString(","))
    buffer.insert(0, -2)
    buffer.update(0, -3)
    println(buffer.mkString(","))
    buffer.-(-1)
    buffer.-=(3)
    buffer.remove(2)
    println(buffer.mkString(","))
  }
}
