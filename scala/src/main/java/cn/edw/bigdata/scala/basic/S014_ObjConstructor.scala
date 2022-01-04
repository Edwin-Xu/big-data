package cn.edw.bigdata.scala.basic

/**
 * @date 12/14/2021 12:23 AM
 * @author taoxu.xu
 *
 */
object S014_ObjConstructor {
  def main(args: Array[String]): Unit = {
    var a = new A(1)
    println(s"a.b = ${a.b}, a.a = ${a.a}")
    a = new A(1, 2)
    println(s"a.b = ${a.b}, a.a = ${a.a}")
  }
}

class A(a_ : Int) {
  var b: Int = _
  var a: Int = a_

  def this(a_ : Int, b_ : Int) {
    this(a_)
    this.b = b_
  }
}
