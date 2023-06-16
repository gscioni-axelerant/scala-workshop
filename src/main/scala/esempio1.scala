package com.axelerant
import scala.collection.mutable.ListBuffer

object esempio1:
  def double(ints: List[Int]): List[Int] =
    val buffer = new ListBuffer[Int]()
    for i <- ints do
      buffer += i * 2
    buffer.toList

  def doubleWithMap(ints: List[Int]): List[Int] =
    //(i => i * 2) versione lunga
    ints.map(_ * 2)



