package com.axelerant

//a function that takes multiple arguments can be translated into a series of function calls that each take a single argument.
object currying {

  def plus(a: Int)(b: Int) = a + b
  def plus2 = plus(2)(_)

  def wrap(prefix: String)(html: String)(suffix: String) = {
    prefix + html + suffix
  }
  val wrapWithDiv = wrap("<div>")(_: String)("</div>")

  def add1(a:Int, b:Int, c:Int): Int =            a + b + c
  //add2 è una funzione che prende un parametro a e ritorna una funzione che prende un parametro b e ritorna una funzione che prende un parametro c e ritorna il risultato finale
  def add2(a:Int): Int => Int => Int = b => c =>  a + b + c
  //add3 è una funzione definita in modo curried, in questo modo è possibile chiamarla con un sottoinsieme dei parametri, che ritornerà una funzione invece del risultato finale
  def add3(a:Int)(b:Int)(c:Int): Int =            a + b + c



}

