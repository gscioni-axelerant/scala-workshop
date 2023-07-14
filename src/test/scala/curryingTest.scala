package com.axelerant

import currying._
import org.scalatest.funsuite.AnyFunSuiteLike

class curryingTest extends AnyFunSuiteLike {

  test("partially applied test") {
    assert(plus2(3) == 5)
  }

  test("currying 1"){
    val content = "contenuto"
    val result = wrap("<div>")(content)("</div>")
    assert(result == "<div>contenuto</div>")
    assert(wrapWithDiv(content) == "<div>contenuto</div>")
  }

  test("currying 2"){
    val v1 = add1(1, 2, 3)
    val v2 = add2(1)(2)(3)
    val v3 = add3(1)(2)(3)

    assert(v1==v2)
    assert(v2==v3)
  }

}
