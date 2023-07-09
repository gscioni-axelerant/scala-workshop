package com.axelerant

import org.scalatest.funsuite.AnyFunSuiteLike

class tuplesTest extends AnyFunSuiteLike {

  test("tuples") {
    val t1 = tuples.bento._1
    val (first, second) = tuples.bento
    assert(t1 == first)

    assert(tuples.getAge == 17)
  }
}
