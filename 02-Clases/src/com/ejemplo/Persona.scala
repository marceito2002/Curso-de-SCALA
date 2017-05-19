package com.ejemplo


// Getter y Setter
class Persona (var nombre: String){
  
}
  
//Solo Getter
class Cliente (val nombre: String){
  
}

//Parámetro de construcción, que se alnacen de fora interna en la clase 
//para su uso interno (como una var private en java)
class Empleado (nombre:String){
  
}

class Agente (nombre:String){
  private var _nombre = nombre
  def nombre(nombre:String): Unit = _nombre= nombre
  
  def nombre(): String = _nombre
  
}