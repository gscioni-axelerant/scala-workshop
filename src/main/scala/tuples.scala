package com.axelerant

//sono simili a liste ma gli oggetti contenuti non devono essere
//per forza dello stesso tipo
object tuples {

  val bento: (Sushi, Sushi) = (new Sashimi, new Onigiri)
  trait Sushi
  class Sashimi extends Sushi
  class Onigiri extends Sushi

  val user: (String, Int) = ("John Doe", 17)
  def getAge: Int = user match
    case (name, age) => age
    case null        => 0
}
