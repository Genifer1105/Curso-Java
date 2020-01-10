/*
Sobre carga de métodos,

Los métodos se pueden llamar igual, pero se deben diferencia por los parametros 
que solicitan cada uno NO por el tipo de retorno que tengan
 */
package POO;

/**
 *
 * @author genifer.moreno
 */
public class SMPersona {
    
    String nombre;
    int edad;
    String cc;
    
    
 // Click derecho insertar código - Constructor 

    public SMPersona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Sobre carga de constructor, este tiene solo un parametro 
    public SMPersona(String cc) {
        this.cc = cc;
    }
    
    public void correr() {
        System.out.println("Soy"+nombre+"tengo"+edad+"años y estoy corriendo una maraton");
    }
    
    // No muestra error, porque el metodo tienen parametros diferentes
    
    public void correr(double km){
        System.out.println("He corrido"+km+"kilometros");
    }
         
    
    public static void main(String[] args) {
        SMPersona persona1 = new SMPersona("Genifer", 20); // Acá se muestran los dos constructores creados arriba 
      // Primer constructor con primer método
      persona1.correr();
    
       // PSegundo constructor que pide la cédula con segundo método que pide kilometros
       SMPersona persona2 = new SMPersona("123456789");
       persona2.correr(5);
       }
        
    }
    

