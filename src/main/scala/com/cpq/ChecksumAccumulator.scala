package com.cpq

/**
  * @ Auther: Administrator
  * @ Date: 2019/5/17 08:33
  * @ Description: 
  */
class ChecksumAccumulator {
  private var sum =0
  def add(b:Byte): Unit ={
    println(s"sum =$sum + $b")
    sum += b
  }
 /* def checksum() :Int ={
     ~(sum &0xFF) +1
   }*/
  def checksum()  = ~(sum &0xFF) +1

}
