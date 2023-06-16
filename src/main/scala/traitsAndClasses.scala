package com.axelerant

//i traits sono simili alle interfacce
trait Speaker:
  def speak(): String // has no body, so it’s abstract

trait TailWagger:
  def startTail(): Unit = println("tail is wagging")
  def stopTail(): Unit = println("tail is stopped")

trait Runner:
  def startRunning(): Unit = println("I’m running")
  def stopRunning(): Unit = println("Stopped running")

/* modellazione del dominio stile oop
 */

//classe che implementa le interfacce e definisce il metodo speak che
//era astratto
class Doggie(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = "Woof!"

class Cat(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = "Meow"
  override def startRunning(): Unit = println("Yeah ... I don’t run")
  override def stopRunning(): Unit = println("No need to stop")

//classe con attributi mutabili (var)
class Person(var firstName: String, var lastName: String):
  def printFullName() = println(s"$firstName $lastName")
