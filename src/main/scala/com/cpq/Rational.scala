package com.cpq

/**
  * @ Auther: Administrator
  * @ Date: 2019/5/28 10:44
  * @ Description: 
  */
class Rational (n:Int ,d:Int){
  require(d != 0) //前置条件
  val number :Int = n
  val denom :Int = d

  println(s"Created $number / $denom")
  override def toString = s"Created $number / $denom"

  def add(that :Rational): Rational ={
    new Rational(number*that.denom + that.number*denom , denom*that.denom)
  }
}
