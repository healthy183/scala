package com.kang.demo

/**
  * User: 
  * Description: 
  * Date: 2018-11-07
  * Time: 15:40
  */
object ApplyAndUnapply {

  def main(args: Array[String]): Unit = {

    val x = ApplyAndUnapply(2); //调用apply
    println(x);

    x match
    {
      case 10 => println("是10!")
      //unapply 被调用
      case ApplyAndUnapply(num) => println(x + " 是 " + num + " 的两倍！")
      case _ => println("无法计算")
    }

  }

  //x<<1  x*2
  def apply(x: Int) = x<<1; //调用此方法返回结果

  def unapply(z: Int): Option[Int] =
    if (z%2==0){
      Some(z/2)
    } else{
      None
    }

}
