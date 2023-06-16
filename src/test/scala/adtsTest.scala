package com.axelerant

import adts.CrustSize.*
import adts.CrustType.*
import adts.Topping.*
import adts.{CrustSize, Pizza, Topping}

import org.scalatest.funsuite.AnyFunSuiteLike

class adtsTest extends AnyFunSuiteLike {

  test("adts") {

    val currentCrustSize = CrustSize.Small

    // enums in a `match` expression
    currentCrustSize match
      case Small  => println("Small crust size")
      case Medium => println("Medium crust size")
      case Large  => println("Large crust size")

    // enums in an `if` statement
    if currentCrustSize == Small then println("Small crust size")

    val napoli = Pizza("napoli", Medium, Cheese)
    val rossini = Pizza("rossini", Small, Eggs)

    assert(napoli.size == Medium)
    assert(rossini.topping == Eggs)

  }
}
