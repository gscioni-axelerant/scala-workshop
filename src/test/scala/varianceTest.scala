package com.axelerant

import org.scalatest.funsuite.AnyFunSuiteLike

class varianceTest extends AnyFunSuiteLike {

  val price4: Buyable = new Buyable:
    override def price: Int = 4

    override def productNumber: String = "eee"

  val book: Book = new Book:
    override def isbn: String = "ddeded"

    override def price: Int = 2

    override def productNumber: String = "ooo"

  test("invariance test") {
    def oneOf(
               p1: Pipeline[Buyable],
               p2: Pipeline[Buyable],
               b: Buyable
             ): Buyable = {
      val b1 = p1.process(b)
      val b2 = p2.process(b)
      if b1.price < b2.price then b1 else b2
    }

    val bookPipeline: Pipeline[Book] = (b: Book) => b
    val identity: Pipeline[Buyable] = (b: Buyable) => b
    val doublePrice: Pipeline[Buyable] = (b: Buyable) => new Buyable:
      override def price: Int = b.price * 2

      override def productNumber: String = "eee"

    assert(oneOf(identity, doublePrice, price4).price == 4)

    //questo non compila: Pipeline[Buyable] != Pipeline[Book]
    //    assert(oneOf(bookPipeline, doublePrice, price4).price == 4)
  }

  test("covariance test") {
    def makeTwo(p: Producer[Buyable]): Int =
      p.make.price + p.make.price

    val prodBuyable: Producer[Buyable] = new Producer[Buyable]:
      override def make: Buyable = price4

    val prodBook: Producer[Book] = new Producer[Book]:
      override def make: Book = book

    assert(makeTwo(prodBuyable)==8)

    //questo funziona perchè in Producer[+T] il tipo T è covariante
    //quindi Producer[Book] <: Producer[Buyable]
    //cioè dove posso usare un Producer[Buyable] posso anche usare un Producer[Book]
    assert(makeTwo(prodBook)==4)

  }

  test("contravariant test"){
    def takeBuyable(p: Consumer[Buyable], b: Buyable): Unit =
      p.take(b)

    val consBook : Consumer[Book] = (t: Book) => println(t.isbn)
    val consBuyable : Consumer[Buyable] = (t: Buyable) => println(t.price)
    val consItem : Consumer[Item] = (t: Item) => println(t.productNumber)


    //questo funziona perchè in Consumer[-T] il tipo T è controvariante
    //quindi Consumer[Item] <: Consumer[Buyable] (con Item >: Buyable)
    takeBuyable(consItem, price4)
    takeBuyable(consBuyable, price4)

    //questo va in errore
//    takeBuyable(consBook, price4)

  }

}
