package chapter01


class Qualifier {
  // private 带有此标记的成员仅在包含了成员定义的类或对象内部可见，同样的规则还适用内部类。
  class Inner {
    private def myName() = "yuyinghao"
    println(myName())
    private class InnerMost {
      myName()
    }
  }
  //  (new Inner()).myName() 在类外部无法访问


  // protected 因为它只允许保护成员在定义了该成员的的类的子类中被访问
  class Outer {
    protected def myAge() = println(10)
    myAge()

    def myName() = println("1")
  }
  class OuterSon extends Outer {
    myAge()
  }

  class Outer2 {
    // new Outer().myAge 无法访问
    new Outer().myName()
  }

  // 没有声明则为public 没有访问限制

}


object Qualifier {
  def main(args: Array[String]): Unit = {
    // scala有三种修饰符 private protected public
    // private 私有的

  }
}
