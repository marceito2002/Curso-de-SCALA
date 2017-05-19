package com.ejemplo

/* 
 		Partiendo de n funciones que realizan la conversion monetaria entre
    distintas divisas desde y hacia la divisa de referencia que será el 
    Dollar.
   
    EuroDollar    
    DollarRublo
    
    Escribir la tranformacion el Euro al Rublo, empleando funciones de 
    orden mayor  
 */

object Monedas {

  val factorConversionEuroDolar = 1.09403
  val factorConversionDolarYen = 110.889332

  def cambioEuroDolar(numEuros: Double): Double = numEuros * factorConversionEuroDolar

  def cambioDolarYen(numEuros: Double): Double = numEuros * factorConversionDolarYen

  //UNA FORMA DE HACERLO
  def funcionOrdenMayor(
    funcion: (Double) ⇒ Double,
    numEuros: Double
  ) = {
    funcion(numEuros)
  }

  var fun = funcionOrdenMayor(cambioEuroDolar, _: Double)
  var fun2 = funcionOrdenMayor(cambioDolarYen, _: Double)

  println("Primer Euro a Dolar --> " + fun(12))
  println("Sgundo Euro a Dolar --> " + funcionOrdenMayor(cambioEuroDolar, 12))

  println("Tercer cambio a Yen --> " + fun2(fun(12)))

  // OTRA FORMA DE HACERLO
  def funcionOrdenMayor2(
    funcion: (Double) ⇒ Double,
    funcion2: (Double) ⇒ Double,
    numEuros: Double
  ) = {
    funcion(funcion2(numEuros))
  }

  var ej = funcionOrdenMayor2(cambioEuroDolar, cambioDolarYen, _: Double)
  println("Tercer cambio a Yen --> " + ej(12))

}

