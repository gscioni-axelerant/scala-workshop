package com.axelerant

trait Animal:
  def speak(): Unit

trait HasTail:
  def wagTail(): Unit

class Dog extends Animal, HasTail:
  def speak(): Unit = println("Woof")
  def wagTail(): Unit = println("⎞⎜⎛  ⎞⎜⎛")

//esempio di funzione
//match è detto pattern matching, una specie di
//switch on steroids
val numAsString = (i: Int) =>
  i match
    case 1 | 3 | 5 | 7 | 9  => "odd"
    case 2 | 4 | 6 | 8 | 10 => "even"
    case _                  => "too big"

//metodo (di solito si dichiara all'interno di una classe
//ma sembra che in Scala 3 si possa anche dichiarare di fuori
//il comportamento in questo caso è equivalente ad una funzione)
def isTruthy(a: Any) = a match
  case 0 | "" => false
  case _      => true
