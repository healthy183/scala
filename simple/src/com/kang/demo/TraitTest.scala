package com.kang.demo

/**
  * User: 
  * Description: 
  * Date: 2018-11-07
  * Time: 14:57
  */
//Scala Trait(特征)更像 Java 的抽象类
trait  Equal{

  def isEqual(x:Any):Boolean;

  def isNotEqual(x:Any):Boolean = !isEqual(x);
}


class PointEqual(xc:Int,yc:Int) extends Equal {

  var x: Int = xc;
  var y: Int = yc;

  override def isEqual(obj: Any) =
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x
}


object TraitTest {

  def main(args: Array[String]): Unit = {

    val p1 = new PointEqual(2, 3);
    val p2 = new PointEqual(2, 4);
    val p3 = new PointEqual(3, 3);

    println(p1.isNotEqual(p2));
    println(p1.isNotEqual(p3));
    println(p1.isNotEqual(2));
  }

}
