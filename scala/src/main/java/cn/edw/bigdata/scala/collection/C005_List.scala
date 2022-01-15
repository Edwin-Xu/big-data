package cn.edw.bigdata.scala.collection

/**
 * @date 1/11/2022 12:23 AM
 * @author taoxu.xu
 *
 */
object C005_List {
  def main(args: Array[String]): Unit = {
    // List默认不可变
    val list01: List[Int] = List(1, 2, 3, 4)
    // ::, 空集合 Nil
    val list02: List[Int] = 1 :: 2 :: 3 :: Nil
    // :::
    val list03: List[Int] = list01 ::: list02
    // 头插 +:
    val list04 = list02.+:(-1)
    // 尾插 :+
    val list05 = list04.:+(8)
    println(list05.mkString(","))
  }
}
