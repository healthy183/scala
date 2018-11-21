package com.kang.demo

/**
  * User: 
  * Description: 
  * Date: 2018-11-06
  * Time: 16:36
  */
object TestMap {

  def ttt(f:Int => Int):Unit = {
    val r = f(10);
    println(r);
  }

  val f0 = (x : Int) => x * x;

  //定义了一个方法
  def m0(x:Int) : Int = {
    //传递进来的参数乘以10
    x * 10;
  }

  //将方法转换成函数，利用了神奇的下滑线
  val f1 = m0 _;

  def main(args: Array[String]): Unit = {

    println(m0(12));

    ttt(f0); //方法ttt调用f0函数

    //通过m0 _将方法转化成函数,再给方法ttt调用
    ttt(m0 _);

    //如果直接传递的是方法名称，scala相当于是把方法转成了函数
    ttt(m0); //方法调用方法

    //通过x => m0(x)的方式将方法转化成函数,这个函数是一个匿名函数，等价：(x:Int) => m0(x)
    ttt(x => m0(x));
  }

}
