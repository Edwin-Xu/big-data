package cn.edw.bigdata.scala.basic

import scala.beans.BeanProperty

/**
 * @date 12/11/2021 11:32 PM
 * @author taoxu.xu
 *
 */
object S013_Object {
  def main(args: Array[String]): Unit = {
    val person = new Person
    person.setSex("women")
    println(person.getSex)
  }
}

class Person {
  var name: String = "bobo" //定义属性
  var age: Int = _ // _表示给属性一个默认值
  //Bean 属性（@BeanProperty）
  @BeanProperty
  var sex: String = "男"
  //val 修饰的属性不能赋默认值，必须显示指定
  protected var a: Int = 1
  private var b: Int = 1

  def sayHi(name: String): Unit = {
    println(s"Hi, $name");
  }
}