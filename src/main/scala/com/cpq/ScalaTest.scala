package com.cpq

import scala.util.Random

object ScalaTest {
  def main(args: Array[String]): Unit = {
    var i=0
    val ints: Array[Int] = Array.fill(5){
      i += 2
      i
    }
      ints.foreach(println)
  }
}
