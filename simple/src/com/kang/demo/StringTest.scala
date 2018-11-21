package com.kang.demo

/**
  * User: 
  * Description: 
  * Date: 2018-11-07
  * Time: 10:50
  */
object StringTest {


  def main(args: Array[String]): Unit = {
    var s = "abc";
    var news = s.concat("efg");
    println(news);

    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "菜鸟教程!"
    var fs = println("浮点型变量为 " +
      "%f, 整型变量为 %d, 字符串为 " +
      " %s", floatVar, intVar, stringVar)

    var strVal  = "ab"+
    "ewf";
    println(strVal);

    val name = "James";
    println(s"hi $name");
    println(s"1 + 1 = ${1 + 1}");

    val height = 1.9d;
    println(f"$name%s is $height%2.2f meters tall");

    println(s"Result = \n a \n b");

    //'raw'的插值器使用
    println(raw"Result = \n a \n b");

  }

}
