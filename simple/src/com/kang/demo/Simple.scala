package com.kang.demo

/**
  * User: 
  * Description: 
  * Date: 2018-11-06
  * Time: 16:20
  */
object Simple {

  def main(args: Array[String]) {
    println( "Returned Value : " + addInt(5,7) );
  }


  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b
    return sum
  }
}

