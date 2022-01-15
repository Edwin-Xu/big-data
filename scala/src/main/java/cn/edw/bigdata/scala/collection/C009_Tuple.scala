package cn.edw.bigdata.scala.collection

/**
 * @date 1/12/2022 12:09 AM
 * @author taoxu.xu
 *
 */
object C009_Tuple {
  def main(args: Array[String]): Unit = {
    // tuple: 一系列的元素的集合
    val tuple: (Int, String, Boolean) = (10, "x", true)
    // visit by index
    println(tuple._1 + tuple._2)
    // also index
    println(tuple.productElement(2))

    // Tuple1~Tuple22
    val tuple1 = Tuple7
    val tuple2 = tuple1.apply(1, 2, 3, 4, 5, 6, 7)
    println(tuple2.toString())
  }
}
