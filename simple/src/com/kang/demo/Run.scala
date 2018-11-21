package com.kang.demo

/**
  * User: 
  * Description: 
  * Date: 2018-11-07
  * Time: 16:43
  */
object Run {
  implicit class IntTimes(x: Int) {
    def times [A](f: =>A): Unit = {
      def loop(current: Int): Unit =

        if(current > 0){
          f
          loop(current - 1)
        }
      loop(x)
    }
  }
}
