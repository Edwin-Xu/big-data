package cn.edw.bigdata.scala.basic

/**
 * @date 12/19/2021 11:18 PM
 * @author taoxu.xu
 *
 */
object S015_ObjectExtends {
  def main(args: Array[String]): Unit = {
    val edw = new Son(0, "edw")
    val father = new Father(1)
    println(edw)
    println(father)
  }
}

class Father(id: Int) {

}

class Son(id: Int, name: String) extends Father(id) {
  def this(name: String) {
    this(0, name)
  }
}


