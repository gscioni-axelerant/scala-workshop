package com.axelerant

trait Item:
  def productNumber: String
trait Buyable extends Item:
  def price: Int
trait Book extends Buyable:
  def isbn: String

//quindi (<: figlio di)
//Book <: Buyable <: Item



// an example of an invariant type
trait Pipeline[T]:
  def process(t: T): T
// an example of a covariant type
trait Producer[+T]:
  def make: T
// an example of a contravariant type
trait Consumer[-T]:
  def take(t: T): Unit
