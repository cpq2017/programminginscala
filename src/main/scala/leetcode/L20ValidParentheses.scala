package leetcode

object L20ValidParentheses {
  //  20. Valid Parentheses
  //  https://leetcode.com/problems/valid-parentheses/
  def isValid(s: String): Boolean = {
    val q = new scala.collection.mutable.Queue[Char]()

    var flag = false

    s.foreach(l => {
      l match {
        case '(' => q.enqueue(l)
        case '{' => q.enqueue(l)
        case '[' => q.enqueue(l)
        case  ')'  => if(l != q.dequeue()) flag = false
        case '}' => if(l != q.dequeue()) flag = false
        case ']'  => if(l != q.dequeue()) flag = false
      }

    })
    if(q.length != 0){
      flag = false
    }else {
      flag = true
    }
    flag
  }

  def isValid2(s: String): Boolean = {
    val q = new scala.collection.mutable.Stack[Char]()
    val charmap = Map(')' -> '(','}' -> '{',']' -> '[')
    s.foreach( i =>{
      if ( !charmap.keySet.contains(i)){
        q.push(i)
      }else {
        if ( q.isEmpty || charmap.get(i).get != q.pop()){

          return  false
        }
      }
    })

    q.isEmpty
  }

  def isValid4(s: String): Boolean = {

    val st = scala.collection.mutable.Stack[Char]()
    val map = Map[Char,Char](')' -> '(', '}' -> '{',']' -> '[')

    s.foreach(ch => {
      if(map.keySet.contains(ch)){
        if(st.isEmpty || st.pop() != map.get(ch).get)
          return false
      } else {
        st.push(ch)
      }
    }
    )
    st.isEmpty
  }
  def isValid3(s: String): Boolean = {
    val (opening, closing) = (List('(', '[', '{'), List(')', ']', '}'))

    s.foldLeft(List[Char]()) ((stack, ch) => {
      ch match {
        case c if opening contains c => c :: stack
        case c if closing contains c => stack match {
          case Nil => return false
          case head :: tail => if(!check(c, head)) return false else tail
        }
      }
    }).isEmpty
  }

  def check(c: Char, head: Char): Boolean = {
    c==')' && head=='(' || c==']' && head=='[' || c=='}' && head=='{'
  }



}
