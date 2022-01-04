package cn.edw.bigdata.scala.basic

/**
 * @date 12/9/2021 12:39 AM
 * @author taoxu.xu
 *
 */
object S003_StringPrint {
  def main(args: Array[String]): Unit = {
    val name: String = "Edwin Xu"
    var age: Int = 24

    println(name + " - " + age)
    printf("I'm %s, and I am %d years old.", name, age)

    // 如果使用字符串模板， 前面加 s
    val hello =
      s"""
        |I'm $name, and I am ${age+2} years old.
        |""".stripMargin
    println(hello)
  }
}
