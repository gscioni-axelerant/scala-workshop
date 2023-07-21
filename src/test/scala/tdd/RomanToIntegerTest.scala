package com.axelerant
package tdd

import tdd.RomanToInteger.fromArabic

import org.scalatest.funsuite.AnyFunSuiteLike

class RomanToIntegerTest extends AnyFunSuiteLike {

  val Examples = Seq(
    1 -> "I",
    2 -> "II",
    3 -> "III",
    4 -> "IV",
    5 -> "V",
    6 -> "VI",
    9 -> "IX",
    10 -> "X",
    15 -> "XV",
    20 -> "XX",
    40 -> "XL",
    50 -> "L",
    90 -> "XC",
    100 -> "C",
    400 -> "CD",
    500 -> "D",
    900 -> "CM",
    1000 -> "M",

    //integration tests
    3497 -> "MMMCDXCVII",
    3433 -> "MMMCDXXXIII",
    4999 -> "MMMMCMXCIX"
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


    println(fromArabic(3433))

  }
}
