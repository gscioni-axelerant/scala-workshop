package com.axelerant
package tdd

import scala.annotation.tailrec

object RomanToIntegerSoluzione {

  def fromArabic(arabic: Int): String =
    val regole = Seq(
      1000 -> "M",
      900 -> "CM",
      500 -> "D",
      400 -> "CD",
      100 -> "C",
      90 -> "XC",
      50 -> "L",
      40 -> "XL",
      10 -> "X",
      9 -> "IX",
      5 -> "V",
      4 -> "IV",
      1 -> "I")

    @tailrec
    def toRoman(acc: String, num: Int, seq: Seq[(Int, String)]): String = seq match
      case Nil => acc
      case (arab, roman) :: tail =>
        val volte = num / arab
        val resto = num % arab
        toRoman(acc + (roman * volte), resto, tail)

    toRoman("", arabic, regole)
}
