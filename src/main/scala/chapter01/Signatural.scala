package chapter01

object Signatural {
  def main(args: Array[String]): Unit = {
    // 0 算术运算符
    val a = 10
    val b = 20
    val c = 30
    val d = 50
    println(a + b)
    println(b - c)
    println(c * d)
    println(d / a)

    // 1 关系运算符
    println(a == b)
    println(a > b)
    println(a >= b)
    println(a < b)
    println(a <= b)
    println(a != b)

    // 2 逻辑运算
    val l1 = false
    val l2 = true
    println(l1 && l2)
    println(l1 || l2)
    println(!(l1 || l2))

    // 3 位运算

  }
}
