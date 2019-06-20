package com.cpq.list

object SortInsert {
  def main(args: Array[String]): Unit = {

    val ints = issort(List(1,3,2,6,4,2,4,9,10))
    ints.sorted

    println(ints)
  }
  def insert(x:Int,xs:List[Int]) :List[Int] ={
    if(xs.isEmpty || x<= xs.head) x::xs
    else xs.head::insert(x,xs.tail)
  }
  def issort(xs:List[Int]) :List[Int] ={
    if(xs.isEmpty) Nil
    else insert(xs.head,issort(xs.tail))
  }
}
