package leetcode

import com.sun.jmx.remote.internal.ArrayQueue

import scala.collection.mutable

object L225MyStack {

  //  225. Implement Stack using Queues
//  https://leetcode.com/problems/implement-stack-using-queues/description/
def main(args: Array[String]): Unit = {
  val stack = new MyStack()
  stack.push(1)
  stack.push(2)
  stack.push(4)
  println( "pop  "+ stack.pop())
  println( "pop  "+ stack.pop())
  println( "pop  "+ stack.pop())


}
}
class MyStack() {

  /** Initialize your data structure here. */

  private val inputQueue = new mutable.Queue[Int]()
  private var outputQueue = new mutable.Queue[Int]()

  /** Push element x onto stack. */
  def push(x: Int) {
    inputQueue.enqueue(x)
    outputQueue=inputQueue.reverse

  }

  /** Removes the element on top of the stack and returns that element. */
  def pop(): Int = {

    outputQueue.dequeue()

  }

  /** Get the top element. */
  def top(): Int = {
    outputQueue.head

  }

  /** Returns whether the stack is empty. */
  def empty(): Boolean = {
    outputQueue.isEmpty
  }

}
