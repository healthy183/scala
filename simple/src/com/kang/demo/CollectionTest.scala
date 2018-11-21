package com.kang.demo

/**
  * User: 
  * Description: 
  * Date: 2018-11-07
  * Time: 11:27
  */
object CollectionTest {

  def main(args: Array[String]): Unit = {

    var lists = List("11","22","33");
    for(x <- lists){
      println(x);
    }

    println(lists.head);
    println(lists.tail); //此方法返回由除第一个之外的所有元素组成的列表

    val fruit = List.fill(3)("apples");
    println(fruit);


    val squares = List.tabulate(6)(n => n * n)
    println("squares : " + squares); //List(0, 1, 4, 9, 16, 25)
    println(squares.reverse);

    var allList = squares ++  fruit;
    for(x <- allList){
      println(x);
    }


    var sets = Set("44","55","66");
    for(x <- sets){
      println(x);
    }

    println(sets.min);
    println(sets.max);

    var setcp = Set("44","55","66");
    for(x <- setcp){
      println(x);
    }



    var setAll =  sets ++ setcp;
    for(x <- setAll){
      println(x);
    }

    var othSe = Set("44","47","54");

    var intersectSet = othSe.&(setcp); //交集
    //var intersectSet = othSe.intersect(setcp);
    for(x <- intersectSet){
      println(x);
    }

    println("map!")
    var maps = Map("a"->"1","b"->"2","c"->"3");
    for((k,v)<- maps){
      println(k+"|"+v);
      }

    println(maps.get("a"));
    println(maps.get("e"));

   var keySet = maps.keySet;
    for(x <- keySet){
      println(x);
    }

    maps.keySet.foreach(k=>{
      println(k);
    });




  }
}
