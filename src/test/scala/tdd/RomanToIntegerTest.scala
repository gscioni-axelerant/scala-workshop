package com.axelerant
package tdd

import com.axelerant.tdd.RomanToInteger.fromArabic
import org.scalatest.funsuite.AnyFunSuiteLike

class RomanToIntegerTest extends AnyFunSuiteLike {

  test("converte 1 in I") {
    assert(fromArabic(1) == "I")
  }

}
