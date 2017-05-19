package com.ejemlos

object prueba2 extends App{

 def funcion (): String = {
    println("Alfonso")
    "Alfonso"
  }
  

  var func : () => String = prueba2.funcion
  
  println ("Antes")
  
  println(func())
}