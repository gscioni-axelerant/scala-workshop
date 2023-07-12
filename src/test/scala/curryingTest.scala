package com.axelerant

import org.scalatest.funsuite.AnyFunSuiteLike

class curryingTest extends AnyFunSuiteLike {

  test("partially applied test") {
    assert(currying.plus2(3) == 5)
  }

  test("currying 1"){
    val content = "contenuto"
    val result = currying.wrap("<div>")(content)("</div>")
    assert(result == "<div>contenuto</div>")
    assert(currying.wrapWithDiv(content) == "<div>contenuto</div>")
  }

  test("currying 2"){
    val v1 = currying.add1(1, 2, 3)
    val v2 = currying.add2(1)(2)(3)
    val v3 = currying.add3(1)(2)(3)

    assert(v1==v2)
    assert(v2==v3)
  }

}
