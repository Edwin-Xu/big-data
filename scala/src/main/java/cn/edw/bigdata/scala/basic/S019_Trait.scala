package cn.edw.bigdata.scala.basic

/**
 * @date 12/25/2021 11:21 PM
 * @author taoxu.xu
 *
 */
object S019_Trait {
  def main(args: Array[String]): Unit = {
    val student = new Student
    student.work()
  }
}

class People {
  val name:String = ""
  def hi():Unit = {}
}

trait Workable{
  var id:String
  def work():Unit
}

class Student extends People with Workable {
  override def work(): Unit = {
    println(s"$name is working")
  }

  override var id: String = "001"
}