package chapter01

object Variable {
  def main(args: Array[String]): Unit = {
    // 两种方式声明变量
    // 0 var 声明变量
    var data1 = 0
    // data1 = 1 可以进行修改

    // 1l val 声明常量
    val data2 = 1
    // data2 = 2 无法修改

    // 变量类型声明
    var name: String = "yuyinghao"

    // 变量类型可以省略，系统自动推断
    var age = 10

    // 多变量声明
    val min,max = 10

    println(max)


  }
}
