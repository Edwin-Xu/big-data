package cn.edw.bigdata.scala.collection

/**
 * @date 1/10/2022 11:47 PM
 * @author taoxu.xu
 *
 */
object C001_Array {
  def main(args: Array[String]): Unit = {
    // [T]指定类型
    val arr01 = new Array[Int](10)
    // (20)数组大小，确定不可变化
    val arr02 = new Array[Any](20)
    // 直接初始化
    val arr04 = Array(1,2,3,4,5)
    // 通过下标赋值
    arr01(1) = 100
    // 通过update赋值
    arr01.update(2, 300)
    // mkString
    println(arr01.mkString(","))
    // 遍历
    for( i <- arr01){
      println(i)
    }
    // foreach
    arr01.foreach(x => {println(x)})
    // 增加元素：由于数组长度不可变，因此实际产生的是新的数组
    val arr03:Array[Int] = arr01:+5
  }
}
