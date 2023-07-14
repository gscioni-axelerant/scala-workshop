package com.axelerant

import com.axelerant.tuples.{bento, getAge}
import org.scalatest.funsuite.AnyFunSuiteLike

class tuplesTest extends AnyFunSuiteLike {

  test("tuples") {
    val t1 = bento._1
    val (first, second) = bento
    assert(t1 == first)

    assert(getAge == 17)
  }
}
