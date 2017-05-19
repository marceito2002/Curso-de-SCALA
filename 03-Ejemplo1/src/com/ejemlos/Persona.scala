package com.ejemlos


/*
  Jerarquia de clases Persona, Cliente, Agente, 
    
    Donde Cliente y Agente son Personas
    
    Donde Persona tiene atributo nombre y edad (accesibles L y E)
    
    Donde Cliente tiene atributo numeroCuenta (solo escritura)
    
    Donde Agente tiene atributo nomina (de acceso interno)
    
    Edad sea obligatorio y mayor que 18
    
    Contructores con todos los parametros y sin parametros para
    todas las tipologias
*/


// Donde Persona tiene atributo nombre y edad (accesibles L y E)
class Persona (var nombre: String, var edad: Int) {

  def this (nombre: String){
     this(nombre, 0)     
   }
   
   def this (edad: Int){
     this("", edad)
   }
   
   def this(){
     this ("Alfonso",42)
   }
   
   
}


 // Donde Cliente es Persona
 // Donde Cliente tiene atributo numeroCuenta (solo escritura)
class Cliente () extends Persona ()  {
  var numeroCuenta: String = ""  
}

// Donde Agente es Persona
// Donde Agente tiene atributo nomina (de acceso interno)
// Edad sea obligatorio y mayor que 18
    
class Agente (edad: Int) extends Persona (edad) {
  
  private var nomina: String ="Nomina"
    
}