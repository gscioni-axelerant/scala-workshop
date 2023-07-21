package com.axelerant
package tdd

import tdd.RomanToInteger.fromArabic

import org.scalatest.funsuite.AnyFunSuiteLike

class RomanToIntegerTest extends AnyFunSuiteLike {

  val Examples = Seq(
    1 -> "I",
    2 -> "II",
    3 -> "III",
    //pensare alla sottrazione delle I
    5 -> "V",
    6 -> "VI",
    10 -> "X",
    15 -> "XV",
    20 -> "XX"
  )

  Examples.foreach((arab: Int, roman: String) => {
    test(s"converte $arab in $roman") {
      assert(fromArabic(arab) == roman)
    }
  })

  test(""){
    val num = 15
    val roman = 10
    var reminder = num

    val times = num / roman
    println(times)
    reminder %= roman
    println(reminder)

  }
}
