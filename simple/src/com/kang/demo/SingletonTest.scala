package com.kang.demo

/**
  * User: 
  * Description: 
  * Date: 2018-11-07
  * Time: 14:36
  */
class Point(val xc:Int,val yc:Int){
      var x = xc;
      var y = yc;

  def move(xc:Int,yc:Int) ={
     x += xc;
     y += yc;
  }
}


object SingletonTest {

  def main(args: Array[String]): Unit = {

    val point = new Point(1,2);
    printPoint

    def printPoint(): Unit ={
      println(point.x);
      println(point.y);
    }
  }

}
