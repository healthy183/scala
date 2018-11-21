package com.kang.demo

/**
  * User: 
  * Description: 
  * Date: 2018-11-07
  * Time: 19:21
  */

class Student(id:Int,name:String){
  var age:Int = 0;

  //重载构造函数
  def this(id:Int,name:String,age:Int){
    this(id,name);
    this.age = age;
  }

  def showDetail(): Unit ={
    println(id+"-"+name);
  }
}

object ConstructorTest {

  def main(args: Array[String]): Unit = {

    var student = new Student(1,"tom");
    student.showDetail();

    var second = new Student(1,"tom",18);
    second.showDetail();
  }

}
