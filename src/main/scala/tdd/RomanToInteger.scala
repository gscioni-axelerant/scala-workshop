package com.axelerant
package tdd

object RomanToInteger {

  def fromArabic(arabic: Int): String =
    val regole = Seq(
      10 -> "X",
      5 -> "V",
      1 -> "I"
    )
    var resto = arabic
    regole.map {
      case (arab, roman) =>
        val volte = resto / arab
        resto%=arab
        roman*volte
    }.mkString
}
