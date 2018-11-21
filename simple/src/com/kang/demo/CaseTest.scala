package com.kang.demo

/**
  * User: 
  * Description: 
  * Date: 2018-11-07
  * Time: 15:19
  */
object CaseTest {

  def main(args: Array[String]): Unit = {
    //println(matchTest(3));
    println(matchAny("two"));
    println(matchAny("test"));
    println(matchAny(1));
    println(matchAny(6));
  }


  def matchTest(x:Int):String = x match{
    case 1 =>"one";
    case 2 =>"two";
    case _ =>"any";
  }

  def matchAny(x:Any):Any = x match{
    case 1 => "one";
    case "two" => 2;
    case y: Int => "scala.Int"; //任意int返回 "scala.Int"
    case _ => "many";
  }
}
