package com.ejercicio

object Fibonacci {
  
    def crearLista (numero: Int){
      
        var listaFibonacci:Array[Int] = new Array[Int](numero)
        
        for (i <- 0 to numero-1 ) {                 
            if (i<=1)  listaFibonacci(i) = i                                    
            else       listaFibonacci(i)=listaFibonacci(i-1) +listaFibonacci(i-2)        
        }               
        for (i <-listaFibonacci) println(i)
         
    }
    
    def main(args: Array[String]){
       crearLista (20)
    }  
    
 
}
