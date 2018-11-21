package com.kang.demo

/**
  * User: 
  * Description: 
  * Date: 2018-11-07
  * Time: 14:19
  */

class Point(val xc:Int,val yc:Int){
    var x = xc;
    var y = yc;

    def move(dx:Int, yx:Int){
      x = x + dx;
      y = y + yx;
      println("x是"+x);
      println("y是"+y);
    }
}

class Location(override val xc:Int, override val yc:Int,val zc:Int)
            extends Point(xc,yc) {
      var z = zc;


  override def move(dx: Int, yx: Int) {
    //super.move(dx, yx);
    x = x * dx;
    y = y + yx;
    println("x是"+x);
    println("y是"+y);
  }

   def move(dx: Int, dy: Int,dz:Int) {
     x = x + dx;
     y = y + dy;
     z = z + dz;
     println("x 的坐标点 : " + x);
     println("y 的坐标点 : " + y);
     println("z 的坐标点 : " + z);
  }
}


object ExtendTest {

  def main(args: Array[String]): Unit = {
    var local = new Location(1,2,3);
    local.move(2,2);
    local.move(1,1,1);
  }

}
