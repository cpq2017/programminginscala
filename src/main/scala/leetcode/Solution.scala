package leetcode

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}

object Solution {
  def reverseList(head: ListNode): ListNode = {
    var prev: ListNode = null
    var curr = head
    while (curr != null) {
      val nextTemp = curr.next
      curr.next = prev
      prev = curr
      curr = nextTemp
    }
    prev
  }

  def swapPairs(head: ListNode): ListNode = {
    val behind = new ListNode(-1)
    behind.next = head
    var a = head
    var pre = behind
    while (a != null && a.next != null) {
      pre.next = a.next
      a.next = a.next.next
      pre.next.next = a
      pre = a
      a = pre.next
    }
    behind.next
  }

  def swapPairs2(head: ListNode): ListNode = {
    var a = head
    var pre = new ListNode(-1)
    pre.next = head
    while (a != null && a.next != null) {
      pre.next = a.next
      a.next = a.next.next
      pre.next.next = a
      pre = a
      a = pre.next
    }
    pre.next
  }

  def swapPairs3(head: ListNode): ListNode = {
    var a = head
    var pre = new ListNode(-1)
    while (a != null && a.next != null) {
      val temp = a.next
      val b = a.next.next
      a = temp
      temp.next = b


      pre.next = a.next
      a.next = a.next.next
      pre.next.next = a
      pre = a
      a = pre.next
    }
    pre.next
  }


}
