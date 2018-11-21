package com.kang.demo

import java.io.{FileNotFoundException, FileReader, IOException}

/**
  * User: 
  * Description: 
  * Date: 2018-11-07
  * Time: 15:30
  */
object ExceptionTest {

  def main(args: Array[String]) {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    } finally {
      println("Exiting finally...")
    }
  }

}
