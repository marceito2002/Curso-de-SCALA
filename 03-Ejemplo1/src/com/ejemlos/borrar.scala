package com.ejemlos

object borrar {
    
  def sort(xs: Array[String]) {
    xs(0) = "Alfonso"
    xs(1) = "Herreros"
        
       
    for (i <- xs) { println(i)}
  
  }
  
  
  def main(args: Array[String]){
      var lista:Array[String] = new Array[String](3)
      lista(2)= "Terc"   
      sort( lista )
  }

}