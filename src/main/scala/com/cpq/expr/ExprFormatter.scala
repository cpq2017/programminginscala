package com.cpq.expr

//import com.cpq.stairwaybook.layout.Element
import com.cpq.Element
import com.cpq.Element.elem

sealed abstract class Expr
case class Var(name:String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator:String,arg :Expr) extends Expr
case class BinOp(operator :String,left:Expr,right:Expr) extends Expr

class ExprFormatter {

  private val opGroups = Array(
    Set("|","||"),
    Set("&","&&"),
    Set("^"),
    Set("==","!="),
    Set("<","<=",">",">="),
    Set("+","-"),
    Set("*","%")
  )

  private val precedence = {
    val assocs =
      for {
        i <- 0 until opGroups.length
        op <- opGroups(i)

      } yield op -> i

      assocs.toMap
  }
  private val unaryPrecedence = opGroups.length
  private val fractionPrecedence = -1

  private def format(e:Expr,enclPrec:Int) :Element =

    e match {
      case Var(name) => elem(name)
      case Number(num) =>
        def stripDot(s:String) =
        if(s endsWith ".0") s.substring(0,s.length-2)
        else s
        elem(stripDot(num.toString))
      case UnOp(operator, arg) =>
        elem(operator) beside format(arg,unaryPrecedence)
      case BinOp("/", left, right) =>
        val top = format(left,fractionPrecedence)
        val bot = format(right,fractionPrecedence)
        val line = elem('-',top.width max bot.width,1)
        val frac = top above line above bot
        if (enclPrec != fractionPrecedence) frac
        else elem(" ") beside frac beside elem(" ")
      case BinOp(operator, left, right) =>
        val opPrec = precedence(operator)
        val l = format(left,opPrec)
        val r = format(right,opPrec +1)
        val oper = l beside elem(" "+operator +" ") beside r
        if(enclPrec <= opPrec) oper
        else elem("(") beside oper beside elem(")")
    }
  def  format(e:Expr) :Element = format(e,0)

}
object Express extends  App {
  private val f = new ExprFormatter
  private val op1 = BinOp("*",BinOp("/",Number(1),Number(2)),BinOp("+",Var("x"),Number(1)))
  private val op2 = BinOp("+",BinOp("/",Var("x"),Number(2)),BinOp("/",Number(1.5),Var("x")))
  private val op3 = BinOp("/",op1,op2)
  private val op4 = BinOp("/",Number(1),Number(2))
  private val op: BinOp = BinOp("/",Number(1),Number(2))

  def show(e:Expr) = println(f.format(e) +"\n"+"\n")
//  for  (e <- Array(op1,op2,op3)) show(e)
//  show(BinOp("+",op4,op4))
  show(op3)
}
