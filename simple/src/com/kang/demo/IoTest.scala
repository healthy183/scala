package com.kang.demo

import java.io.{File, PrintWriter}

import scala.io.Source

/**
  * User: 
  * Description: 
  * Date: 2018-11-07
  * Time: 15:48
  */
object IoTest {

  def main(args: Array[String]): Unit = {
    var fileUrl ="d://file.txt";
    wirte(fileUrl);

    Source.fromFile(fileUrl).foreach{
      print
    }


  }

  def wirte(fileUrl:String): Unit ={
    val writer = new PrintWriter(new File(fileUrl))
    writer.write("菜鸟教程"+"\r")
    writer.write("111")
    writer.close();
  }


}
