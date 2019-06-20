package com.cpq.caseclass

import akka.japi.Util


abstract class Expr
case class Var(name:String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator:String,arg :Expr) extends Expr
case class BinOp(operator :String,left:Expr,right:Expr) extends Expr

object Expr extends App {
  private val v = Var("x")
  private val op = BinOp("+",Number(1.0),v)
  println(v.name)
  println(op.left)
  println(v)
  println(op)
  println(op.right==v)

  private val opcopy: BinOp = op.copy(operator = "-",left = Number(2.0))
  println(opcopy)
  def error(message:String) :Nothing = throw new RuntimeException(message)

  def simplifyTop(expr: Expr) :Expr  = expr match {
    case UnOp("-",UnOp("-",e)) => e
    case BinOp("+",e,Number(0)) => e
    case BinOp("*",e,Number(1)) => e
    case _ => error("not find")
  }
  try {
    println(simplifyTop(v))
    println("------")
  }
  catch {
    case e:Exception => e.printStackTrace()
  }


}