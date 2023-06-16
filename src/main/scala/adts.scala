package com.axelerant

object adts {

  // adt = algebraic data type

  enum CrustSize:
    case Small, Medium, Large
  // l'enum è un adt di tipo "somma" perchè ad es. un valore di tipo
  // CrustSize può essere Small OR Medium OR Large quindi i possibili valori sono dati dalla somma degli elementi dell'enum

  enum CrustType:
    case Thin, Thick, Regular

  enum Topping:
    case Pepperoni, BlackOlives, GreenOlives, Onions, Cheese, Eggs

  // la case class è un esempio di product type perchè un'istanza può essere rappresentata dal prodotto cartesiano dei valori che assumono i parametri
  case class Pizza(name: String, size: CrustSize, topping: Topping)

}
