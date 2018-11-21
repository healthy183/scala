package com.kang.demo

/**
  * User: 
  * Description: 
  * Date: 2018-11-06
  * Time: 16:56
  */
object StringBuilderTest {

  def main(args: Array[String]): Unit = {
    val buf = new StringBuilder;
    buf += 'a';
    buf ++="efg";
    print("toString "+buf.toString());
  }

}
