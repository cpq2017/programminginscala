package com.cpq

object TestRational {

  def main(args: Array[String]): Unit = {
//    val rational = new Rational(4,5)
//    println(rational.+(1))

//    assert(false,new Exception("error test"))

   val flag = if (1 > 2 ) {
     println("test if")
     true
   }
    else {
     println("test else")
      false
    } ensuring {
     println("test ensuring")
     2>3
   }
    println(flag)
  }
}
