package com.cpq

/**
  * Created by Enzo Cotter on 2019/5/14.
  */
object Test extends  App {
  var capital = Map("US"->"Washington","France" -> "Paris")
  capital += ("Chain"->"Beijing")
  println(capital("US"))
  def factorial(s:BigInt):BigInt =
    if(s ==0 ) 1 else s* factorial(s-1)
  println(factorial(30))
}
