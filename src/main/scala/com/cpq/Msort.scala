package com.cpq

class Msort {
  def msort[T](less:(T,T) => Boolean)
              (xs:List[T]) :List[T] = {
    def merge(xs:List[T],ys:List[T]):List[T] =
      (xs,ys) match {
        case (Nil,_) => ys
        case (_,Nil) => xs
        case (x::xs1,y::ys1) =>
          if(less(x,y)) x::merge(xs1,ys)
          else y :: merge(xs,ys1)
      }
    val n = xs.length /2
    if(n == 0) xs
    else {
      val (ys,zs) = xs splitAt(n)
      merge(msort(less)(ys),msort(less)(zs))
    }
  }
}

object Msort extends App {
  private val msort = new Msort()
  private val ints: List[Int] = msort.msort((x:Int, y:Int) => x<y) (List(5,7,1,3))
  println(ints)
  private val ints2: List[Int] = List.tabulate(5)(n => n+1)
  println(ints2)
  private val tuples: List[(Int, String)] = (List(1,2),List("a","b","c")).zipped.map((_,_))
  println(tuples)
}