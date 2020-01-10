/*
Al crear un objeto:
 - Se asuigna memoria para el objeto
 - Se inicializan los atributos del objeto
 - Se invoca al constructor de la clase (uno ovarios)
     Persona p1 = new Persona() -> método constructor

Caracteristicas de los constructores:
- Tienen el mismo nombre de la clase
- No devuelven ningun valor
- Debe declararse como público

El constructor es el único método que no se le pone el tipo de valor de retorno
        public Persona()

 */
package POO;

/**
 *
 * @author genifer.moreno
 */
public class Constructor {
    
     String nombre;
     int edad;
     
     
     // Método constructor, se inician las variables 
     // Acá se guardar los argumentos que se envían en el main y se guardan en las variables de arriba 
     public Constructor(String nombre, int edad) {  // Persona - Parametros del constructor
         this.nombre = nombre; // this. es el atributo 
         this.edad = edad;
     }
     
     public void mostrarDatos(){
         System.out.println("El nombre es"+nombre);
         System.out.println("La edad es"+edad);
     
     }
     
     public static void main(String[] args) {
         
         Constructor p1 = new Constructor("Genifer",20); //Llama al metodo constructor (Persona)y le envía esos datos
         
         p1.mostrarDatos();
         
     }
}
