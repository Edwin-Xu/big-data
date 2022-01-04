package cn.edw.bigdata.scala.basic

/**
 * @date 12/11/2021 9:10 PM
 * @author taoxu.xu
 *
 */
object S011_FunctionalProgramming {
  def main(args: Array[String]): Unit = {
    def function1(id: Int): String = {
      def function2(name: String, age: Int = 20): String = {
        s"name: $name, age: $age"
      }

      def function3(pets: String*): String = {
        ", pets: " + pets.+(",")
      }

      s"id: $id, " + function2("edw") + function3("cat01", "dog01")
    }

    println(function1(1))

    // 函数作为值
    def func01(id: Int): Int = {
      id
    }

    val fVal = func01 _
    println(fVal) // <function0>
    println(fVal(1)) // 1

    // 函数作为参数
    def func02(f: (Int) => Int, id: Int): Int = {
      f(id)
    }

    println(func02(func01, 2)) // 2

    // 匿名函数
    println(func02((id: Int) => id * 2, 3)) // 6

    // 函数作为返回值
    def func03() = {
      def func04() = {}

      func04 _
    }

    println(func03()) // <function0>

    // 匿名函数参数类型可以省略
    def func05(f: Int): Unit = {

    }

    def f1() = {
      val a: Int = 10

      def f2(b: Int) = {
        a + b
      }
      f2 _
    }
    // 在调用时，f1 函数执行完毕后，局部变量 a 应该随着栈空间释放掉
    val f = f1()
    // 但是在此处，变量 a 其实并没有释放，而是包含在了 f2 函数的内部，形 成了闭合的效果
  }

}
