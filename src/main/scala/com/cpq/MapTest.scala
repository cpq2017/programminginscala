package com.cpq

import scala.collection.immutable

object MapTest extends  App {
  private val map: Map[String, Any] = Map("a"-> 1,"b"->2,"c"->"b")
  private val option:  Option[Any] = map.get("a")
  val second :PartialFunction[List[Int],Int] ={
    case x::y::_ => y
  }


  println(  second.isDefinedAt(List()))

  private val opGroups = Array(
    Set("|","||"),
    Set("&","&&"),
    Set("^"),
    Set("==","!="),
    Set("<","<=",">",">="),
    Set("+","-"),
    Set("*","%")
  )
  private val array = Array("a","b","c","d","e","f")
  val tuples =for {
    i <- 0 until opGroups.length
    op <- opGroups(i)
    arr <- array

  } yield (op,i,arr)

  tuples.foreach(println)
}
