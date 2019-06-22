package com.cpq.list

import scala.collection.immutable.TreeSet
import scala.collection.mutable

object ListTest {
  def main(args: Array[String]): Unit = {
     val fruit = "apples"::"oranges"::"pears"::"apple"::Nil
    val a::b::c = fruit
    println(a)
    println(b)
    println(c)
    val strings: List[String] = fruit:::c
    println(strings)
    fruit.isEmpty
    println(fruit.head)
    println(fruit.tail)
    println(fruit.init)

    println(fruit.last)

    val stringToInt = mutable.Map.empty[String,Int]
    val ints = Set(1,2)
    val ints2: Set[Int] = Set(1,2,3,4,5,6)

    val set = TreeSet(3,2,5,7,2,1)
    print(set)
  }
}
