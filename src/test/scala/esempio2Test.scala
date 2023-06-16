package com.axelerant

import org.scalatest.funsuite.AnyFunSuite

class esempio2Test extends AnyFunSuite:

  test("pattern") {
    assert(numAsString(3) == "odd")
    assert(numAsString(399) == "too big")

  }
