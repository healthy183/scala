package com.kang.demo

/**
  * User: 
  * Description: 
  * Date: 2018-11-06
  * Time: 16:48
  */
object MultiplierTest {

    var factor = 3;
    val multiplier = (i:Int) => i * factor; //匿名函数

    def main(args: Array[String]) {
      println( "muliplier(1) value = " +  multiplier(1) )
      println( "muliplier(2) value = " +  multiplier(2) )
    }
}
