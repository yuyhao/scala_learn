package chapter01

object Loop_While {
  def main(args: Array[String]):Unit = {
    // while 循环
    var i = 10
    while(i > 5){
      println("i:" + i)
      i -= 1
    }
  }
}

