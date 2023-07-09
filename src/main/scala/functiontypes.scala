package com.axelerant

//in Scala le funzioni sono dei tipi: si possono istanziare e passare come argomenti
//in Java è possibile dalla versione 8 introducendo le lambda
object functiontypes {

  // tipo funzione: da Int ad Int
  // Int => Int

  // istanza di funzione
  val addOne: Int => Int = (x) => x + 1 // anche senza parentesi funziona

  // altro modo di istanziare una funzione: se in una classe è presente un metodo apply che prende in ingresso
  // gli stessi parametri e ritorna lo stesso valore di una funzione precedentemente dichiarata, allora questi
  // sono compatibili
  class classeUsataComeFunzione:
    def apply(x: Int): Int = x + 1


}
