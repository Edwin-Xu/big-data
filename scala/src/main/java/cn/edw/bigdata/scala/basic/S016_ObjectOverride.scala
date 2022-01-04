package cn.edw.bigdata.scala.basic

/**
 * @date 12/19/2021 11:35 PM
 * @author taoxu.xu
 *
 */
object S016_ObjectOverride {
  def main(args: Array[String]): Unit = {
    val b = new BS
    println(b.id)
  }
}

class AF {
  val id: Int = 2
}

class BS extends AF {
  override val id: Int = 1
}





