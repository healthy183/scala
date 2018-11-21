package com.kang.demo

/**
  * User: 
  * Description: 
  * Date: 2018-11-07
  * Time: 11:03
  */
object ArrayTest {

  def main(args: Array[String]): Unit = {
    var firstArray = Array(1,2,3);
    println(firstArray.toString);

    for(x <- firstArray){
      println(x);
    }

    var total = 0;
    for(i <-0 to (firstArray.length - 1)){
      total += firstArray(i);
    }
    println(total);

    println();
    var secondArray = Array(4,5,6);
    var concatArray = Array.concat(firstArray,secondArray);
    for(x <- concatArray){
      println(x);
    }

    //区间数组
    println("区间数组");  //10 到 20间  2是步数
    var rangeArray = Array.range(10,20,2);
    for(x <- rangeArray){
      println(x)
    }



  }

}
