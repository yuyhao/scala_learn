package chapter01

object Function {
  def main(args: Array[String]):Unit = {
    // 方法与函数的区别
    // 方法是类的一部分
    // 函数是一个对象可以赋值给一个变量

    // 1 声明方法
    def getData():Unit = {

    }

    // 2 方法定义 有返回值
    def add(a: Int, b: Int): Int = {
      return a + b
    }

    // 无返回值
    def add2(a: Int, b: Int): Unit = {
      print("a + b = " + a + b)
    }

    add2(1, 2)

  }
}
