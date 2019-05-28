package com.cpq

/**
  * @ Auther: Administrator
  * @ Date: 2019/5/28 10:44
  * @ Description: 
  */
class Rational(n: Int, d: Int) {
  require(d != 0)
  //前置条件

  private  val g = gcd(n.abs,d.abs)
  val number: Int = n /g
  val denom: Int = d /g
  def this(n: Int) = this(n, 1)

  println(s"Created $number / $denom")

  override def toString = s"Created $number / $denom"

  def add(that: Rational): Rational = {
    new Rational(number * that.denom + that.number * denom, denom * that.denom)
  }
  def +(that: Rational): Rational = {
    new Rational(number * that.denom + that.number * denom, denom * that.denom)
  }

  def *(that: Rational): Rational = {
    new Rational(number * that.number , that.denom * denom)
  }

  //比较大小
  def lessThan(that: Rational) = {
    number * that.denom < that.number * denom
  }

  //返回最大
  def max(that: Rational) = {
    if (lessThan(that)) that else this
  }
  var index = 0
  //两个数的最大公约数
  private def gcd(a: Int, b: Int): Int = {
    index += 1
    println(s"gcd ${a} ${b} ${index}")
    if (b == 0) {
     index = 0
      println(s"return gcd result ${a}")
      a
    } else gcd(b, a % b)
  }


}
