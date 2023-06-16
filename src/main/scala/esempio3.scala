package com.axelerant

// here we declare the type parameter A
//          v
class Stack[A]:
  private var elements: List[A] = Nil
  //                         ^
  //  Here we refer to the type parameter
  //          v
  def push(x: A): Unit =
    elements = elements.prepended(x)
  def peek: A = elements.head
  def pop(): A =
    val currentTop = peek
    elements = elements.tail
    currentTop