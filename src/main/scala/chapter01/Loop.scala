package chapter01
import scala.util.control.Breaks
object Loop {
  def main(args: Array[String]): Unit = {
    // for 循环
    // 基本语法
    // to 包含最后一个数值
    // until 不包含最后一个值
    // <- 赋值

    // 1 通过i控制
    var x = 0
    for(x <- 0 to 10) {
      println(x)
    }

    var y = 0
    for(y <- 0 until 10) {
      println(y)
    }

    // 2 遍历集合
    var n = 0
    val numList = List(1, 2, 3, 4)
    for(n <- numList) {
      println(n)
    }

    // 3 if控制
    for(n <- numList) {
      if(n % 2 == 0) {
        println(n)
      }
    }

    // 4 yield
    var a = 0;
    val numList2 = List(1,2,3,4,5,6,7,8,9,10);

    // for 循环
    var retVal = for{ a <- numList2
                      if a != 3; if a < 8
                      }yield a

    for( a <- retVal){
      println( "Value of a: " + a );
    }

    // 5 中断
    var nu = 0
    val numL = List(1, 3, 5, 7, 10, 12)
    val break = new Breaks()
    break.breakable(
      for(nu <- numL) {
        println(nu)
        if(nu > 5) {
          break.break
        }
      }
    )
  }
}
