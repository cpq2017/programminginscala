import com.cpq.Rational

var a=1+2
a * 3

println("hello world!")

val msg= "Hello ,world!"
val msg2 :java.lang.String = "Hello,world!"

val multiLine = " This" +
  "is the next line."
//定义函数
def max(x:Int,y:Int):Int = {
  if(x > y) x
  else  y
}

val args = List(1,2,3,4)
args.foreach(println)

for(arg <- args) println(arg)

val greetStrings = new Array[String](3)
greetStrings.update(0,"a")
greetStrings.update(1,"b")
greetStrings.update(2,"c")
//greetStrings.update(3,"d")
println(greetStrings.apply(0))

val numNames = Array("a","b","c")

var oneTwoThree = List(1,2,3)
val one = List(1)
val ones = oneTwoThree ::: one
2:: one
one.::(2)
val two = 1::2::3::Nil

two:+5
val six = 6::two
six.reverse

val s= 'a

val nm = s.name
println(nm)
println(f"${math.Pi}%.5f")

val n = "hello, world"
n.indexOf("o")
n.indexOf("o",5)
n indexOf "o"
//class Rational(i: Int, i1: Int)

val oneHalf = new Rational(1,2)
new Rational(3,4)
val y = new Rational(3,3)
println(y.toString)

//val x = new Rational(1,2)
//val rational: Rational = y.add(x)
//val max1: Rational = x.max(y)
//println(x.lessThan(y))

val increase = (x:Int) => x+1
increase(10)
increase(15)

val f = (_: Int) + (_: Int)
f(4,5)