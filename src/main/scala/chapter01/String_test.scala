package chapter01

object String_test {
  def main(args: Array[String]): Unit = {
    // 字符串相关方法
    // 在scala中，字符串的类型实际上是java.lang.String
    // String是一个不可变的类型，不可以被修改
    // 0 创建字符串
    var name: String = "yuyinghao"
    var name2 = "yuyinghao"

    // 01 创建可以修改的字符串 new StringBuilder()
    var s3 = new StringBuilder("aaa")
    s3.append("bbb")
    println(s3)

    // 02 字符串长度 .length()
    var s4: String = "aaacccc"
    println(s4.length)
    println(s4.length())

    // 03 字符串拼接 .concat() / +
    var s5: String = "dddd"
    var s6: String = s4.concat(s5)
    var s7: String = s4 + s5
    println(s6)
    println(s7)

    // 04 格式化字符串 ${} / $
    val name3: String = "yyh"
    val schoole: String  = s"this is my $name"
    println(schoole)

    // 05 替换 replace / replaceAll
    val s10: String = "yuyinghao"
    println(s10.replace("y", "Y"))
    println(s10.replaceAll("y", "Y"))

    // 06 取子集
    val s11: String = "yuyinghao"
    println(s11.substring(0, 2))

    // 07 分裂
    val s12: String = "1,2,3,4"
    val s13: Array[String] = s12.split(",")
    s13.foreach(println)
  }
}
