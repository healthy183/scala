package com.kang.demo

/**
  * User: 
  * Description: 
  * Date: 2018-11-07
  * Time: 14:44
  */

// 私有构造方法
class SingletonTestTwo private(var color:String){
  println("创建"+this);

  override def toString: String = "颜色标记："+ color;
}


// 伴生对象，与类共享名字，可以访问类的私有属性和方法
object SingletonTestTwo {

  //main方法执行即记性此方法(类初始化)
  private val markers : Map[String,SingletonTestTwo] = Map(
    "red"  -> new SingletonTestTwo("red"),
    "blue" -> new SingletonTestTwo("blue"),
    "green"-> new SingletonTestTwo("green")
  );

  def apply(color:String) = {
    if(markers.contains(color)){
      markers(color);
    }else{
       null;
    }
  }

  def getMarker(color:String) = {
    if(markers.contains(color)){
      markers(color);
    }else{
      null;
    }
  }

  def main(args: Array[String]): Unit = {

    println(SingletonTestTwo("red"));
    println(SingletonTestTwo("yellow"));
    println(SingletonTestTwo getMarker "blue")
  }

}
