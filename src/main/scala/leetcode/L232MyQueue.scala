package leetcode

import scala.collection.mutable

object L232MyQueue {
  //232. Implement Queue using Stacks
  //https://leetcode.com/problems/implement-queue-using-stacks/

}
class MyQueue() {

  /** Initialize your data structure here. */
  private val inputstack = new mutable.Stack[Int]()
  private val outputstack = new mutable.Stack[Int]()

  /** Push element x to the back of queue. */
  def push(x: Int) {
    inputstack.push(x)
  }

  /** Removes the element from in front of queue and returns that element. */
  def pop(): Int = {
    if (outputstack.isEmpty && !inputstack.isEmpty) {
      while (!inputstack.isEmpty) {
        outputstack.push(inputstack.pop())
      }
    }
    outputstack.pop()
  }

  /** Get the front element. */
  def peek(): Int = {
    if (outputstack.isEmpty && !inputstack.isEmpty) {
      while (!inputstack.isEmpty) {
        outputstack.push(inputstack.pop())
      }
    }
    outputstack.head
  }

  /** Returns whether the queue is empty. */
  def empty(): Boolean = {
    outputstack.isEmpty && inputstack.isEmpty
  }
}