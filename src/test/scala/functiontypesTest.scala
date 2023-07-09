package com.axelerant

import org.scalatest.funsuite.AnyFunSuiteLike

class functiontypesTest extends AnyFunSuiteLike {

  test("function types") {

    val v1 = functiontypes.addOne(5)
    val fun = new functiontypes.classeUsataComeFunzione
    val v2 = fun(5)

    assert(v1 == v2)
  }
}
