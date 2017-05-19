import javax.validation.Validation
import com.ejemplo.beans.Persona


object Ejemplo1 extends App{
   var factory = Validation.buildDefaultValidatorFactory
   var validador = factory.getValidator
   
   var p = new Persona("",12)
   
   println(validador.validate(p))
   
   
}