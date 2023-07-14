package com.axelerant

import com.axelerant.functiontypes._
import org.scalatest.funsuite.AnyFunSuiteLike

class functiontypesTest extends AnyFunSuiteLike {

  test("function types") {

    val v1 = addOne(5)
    val fun = new classeUsataComeFunzione
    val v2 = fun(5)

    assert(v1 == v2)
  }
}
