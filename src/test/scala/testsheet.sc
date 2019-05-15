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




