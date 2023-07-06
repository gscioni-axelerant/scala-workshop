package com.axelerant

//a function that takes multiple arguments can be translated into a series of function calls that each take a single argument.
object currying {

  def plus(a: Int)(b: Int) = a + b
  def plus2 = plus(2)(_)

  def wrap(prefix: String)(html: String)(suffix: String) = {
    prefix + html + suffix
  }
  val wrapWithDiv = wrap("<div>")(_: String)("</div>")


}

