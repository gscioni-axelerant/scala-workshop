package com.axelerant

import org.scalatest.funsuite.AnyFunSuiteLike

class traitsAndClassesTest extends AnyFunSuiteLike {

  test("classe mutabile") {
    val p1 = Person("Gianni", "Letta")
    p1.printFullName()

    p1.firstName = "Miro"
    p1.printFullName()

    val d = Doggie("Fido")
    d.speak()
    d.startTail()
    d.stopTail()
    d.startRunning()
    d.stopRunning()

  }
}
