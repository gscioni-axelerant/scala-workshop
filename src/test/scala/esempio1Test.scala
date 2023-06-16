package com.axelerant

import org.scalatest.funsuite.AnyFunSuite

class esempio1Test extends AnyFunSuite:

  // test 1
  test("double raddoppia gli elementi") {
    val input = List(1, 2, 3)
    val result = esempio1.double(input)
    assert(result == List(2, 4, 6))

    val resultWithMap = esempio1.doubleWithMap(input)
    assert(resultWithMap == List(2, 4, 6))
  }

  test("list examples"){
    val xs = List(1, 2, 3, 4, 5)
    xs.map(_ + 1) // List(2, 3, 4, 5, 6)
    xs.filter(_ < 3) // List(1, 2)
    xs.find(_ > 3) // Some(4)
    println(xs.takeWhile(_ < 3)) // List(1, 2)
    println(xs.find(_ > 3))
    println(xs.findLast(_ > 3))

    val stuff = ("fish", 42, 1_234.5) //tupla
  }

  test("numAsString"){
    assert(numAsString(4) == "even")
  }

  test("isTruthy") {
    assert(!isTruthy(""))
  }


