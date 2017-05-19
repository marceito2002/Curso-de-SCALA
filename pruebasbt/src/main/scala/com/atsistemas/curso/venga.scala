package com.atsistemas.curso
import org.apache.log4j.Logger
import org.apache.log4j.BasicConfigurator;



object venga extends App{

 
     def pruebalog () : Unit = {
      
        var confi = BasicConfigurator.configure();
        var p = new HelloWorld
        var log = Logger.getLogger(p.getClass);      
      
        log.info("Mensaje con Info")
        log.info("Mensaje con Info");
        log.fatal("Mensaje con Fatal");
        log.warn("Mensaje con Warn");
        log.error("Mensaje con Error");
        log.debug("Mensaje con Debug");      
        
        println("fin")
    }
    
    pruebalog
}