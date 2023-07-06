package com.axelerant

import org.scalatest.funsuite.AnyFunSuiteLike

class curryingTest extends AnyFunSuiteLike {

  test("partially applied 1") {

    assert(currying.plus2(3) == 5)

    val content = "contenuto"
    val result = currying.wrap("<div>")(content)("</div>")
    assert(result == "<div>contenuto</div>")
    assert(currying.wrapWithDiv(content) == "<div>contenuto</div>")

  }

}
