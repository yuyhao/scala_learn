package chapter01

object DataType {
  def main(args: Array[String]): Unit = {
    // Scala支持的数据类型包括
    // Byte、Short、Int、Long
    // Float Double
    // Char String
    // Boolean
    // Unit  表示无值, 和其他语言的void类似
    // Null null或者空引用
    // Nothing 它是任何类型的子类型
    // Any 它是任何类型的超类
    // AnyRef 它是引用类的基类

    // 01 整型字面量
    val data1 = 0

    // 如果表示long, 则在数字后面加上L或者l
    val data2 = 0L

    println(data1)
    println(data2)

    // 02 浮点型字面量 默认为Double型
    val data3: Double = 1.1

    // 如果表示float, 则在数字后面加上F或者f
    val data4: Double = 1.1F

    println(data3)
    println(data4)

    // 03 布尔型
    val data5 = true
    val data6 = false

    // 04 字符型 用单引号
    val data7:Char = '1'
    // val data8: Char = '11'

    // 05 字符串 用双引号
    val data9: String = "abc"

    // 06 多行字符串表示方法 """..."""
    val data10 =
      """
        |this is my name
        |what is yours
        |"""

    // 07 Null


    //




  }
}
