package com.axelerant

import org.scalatest.funsuite.AnyFunSuite

class esempio3Test extends AnyFunSuite:

  test("pila 1") {
    val pila = Stack[String]
    pila.push("pippo")
    pila.push("pluto")

    assert(pila.peek == "pluto")
    assert(pila.peek == "pluto")
    assert(pila.pop() == "pluto")
    assert(pila.pop() == "pippo")
  }



