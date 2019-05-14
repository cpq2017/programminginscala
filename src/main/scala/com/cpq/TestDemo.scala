package com.cpq
//import org.scalatest._
/**
  * Created by Enzo Cotter on 2019/5/14.
  */
object TestDemo extends  App {
  var capital = Map("US"->"Washington","France" -> "Paris")
  capital += ("Chain"->"Beijing")
  println(capital("US"))
  def factorial(s:BigInt):BigInt =
    if(s ==0 ) 1 else s* factorial(s-1)
  println(factorial(30))
  val xs = 1 to 3
  val it = xs.iterator

//  eventually {it.next() shouldBe 3}
}
