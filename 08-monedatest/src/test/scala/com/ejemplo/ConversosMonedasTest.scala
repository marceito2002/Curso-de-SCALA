package com.ejemplo

import org.scalatest.{ Matchers, PropSpec }

import org.scalatest.prop._
import org.scalatest.FunSuite

/*
Partiendo de n funciones que realizan la conversion monetaria entre
distintas divisas desde y hacia la divisa de referencia que será el 
Dollar.

EuroDollar

DollarRublo

Escribir la tranformacion el Euro al Rublo, empleando funciones de 
orden mayor
*/

class CheckSpec extends FunSuite //  extends FunSuite
//  with Matchers
{
  test("12 Yenes should be 1455.79507065552 Dolares") {

    var euroYen = ConversorMonedas.composicionConversionMonetaria(ConversorMonedas.euroDollar, ConversorMonedas.dollarYen)
    assert(euroYen(12) == 1455.79507065552)
  }

}
