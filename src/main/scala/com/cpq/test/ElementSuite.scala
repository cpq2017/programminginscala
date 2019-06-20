package com.cpq.test

import org.scalatest.FunSuite
import com.cpq.Element.elem
class ElementSuite extends FunSuite{
  test("elem result should have passed width") {
    val ele =elem('x',5,3)
//    assert(ele.width == 2)
    assertResult(2) {
      ele.width
    }
  }


}
