package com.cpq

//import org.scalatest._
/**
  * Created by Enzo Cotter on 2019/5/14.
  */
object TestDemo extends App {
  var capital = Map("US" -> "Washington", "France" -> "Paris")
  capital += ("Chain" -> "Beijing")
  println(capital("US"))

  def factorial(s: BigInt): BigInt =
    if (s == 0) 1 else s * factorial(s - 1)

  println(factorial(30))
  val xs = 1 to 3
  val it = xs.iterator


  val name = "ABC"
  private val nameHashUpperCase = name.exists(_.isUpper)
  private val accumulator = new ChecksumAccumulator
  accumulator.add(127)
  accumulator.add(127)
  accumulator.add(127)
  println(accumulator.checksum())

  def time[T](f: => T) :T ={
    val start = System.nanoTime()
    val ret = f
    val end = System.nanoTime()
    println(s"Time taken :${(end - start ) /1000 / 1000} ms")
    ret
  }
  println(time((5*1010101 -4)))

  def updateRecordByname(r:Symbol,value:Any): Unit ={

  }
  updateRecordByname(Symbol("mysym"),1)

  val y = new Rational(3,4)
  println(y.toString)
  val x = new Rational(1,2)
 println(y + x*x)
  println(s"${x/y}")
  println(s"- ${y-x}")
  println(x-1)

  implicit def intToRational(x: Int) = new Rational(x)

  println(2 * x)


//  println(rational)
//  println("max "+x.max(y))
//  println("lesthan "+x.lessThan(y))
//  val z = new Rational(5)
//  private val rational = new Rational(66,42)
//  println(rational)

  def f() :Int = try return  1 finally  return  2
  def g() :Int = try 1 finally  2
  println(s"f() = ${f()} ; g() = ${g()}")

}
