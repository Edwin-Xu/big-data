package cn.edw.bigdata.scala.collection

import scala.collection.mutable.ArrayBuffer

/**
 * @date 1/11/2022 12:01 AM
 * @author taoxu.xu
 *
 */
object C002_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    // ArrayBuffer
    val arr01 = ArrayBuffer(1,2,3,4,5)
    // 追加
    arr01.append(6)
    // 插入
    arr01.insert(0, -1)
    // set
    arr01(1) = 2
    // 往后追加
    arr01.+=(23)
    // 往前追加
    arr01.+=:(50)
    println(arr01.size)
    println(arr01.mkString(","))
  }
}
