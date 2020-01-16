/*
 
 Miembros estaticos - No pertenecen a los objetos sino a  la clase 

    Métodos estaticos,
 */
package POO;

/**
 *
 * @author genifer.moreno
 */
public class MiembroEstatico {
    
    
    // Para definir el objeto estatic se le pone static 
    
    private static String frase = "Primera frase";
    
   
    
    public static void main(String[] args) {
        MiembroEstatico obj1 = new MiembroEstatico();
          MiembroEstatico obj2 = new MiembroEstatico();
       
/*Método estatico  
          
          public static int sumar(int n1, int n2)
          
          */

     // Son objetos distintos si el atributo es normal, así pueden cambiar su valor (el atributo no está static)
          obj2.frase = "Segunda frase";
          
    // Como el atributo frase, ya le pertenece es a la clase(static), el objeto no puede cambiar su valor
        System.out.println(obj1.frase);       
        System.out.println(obj2.frase);
        
        
 // Como ahora es estatico, no hace falta crear un objeto, sino que se puede llamar directamente con la clase  
        System.out.println(MiembroEstatico.frase);

        
        
        /* Al crear un método estatico se puede llamar igual 
        System.out.println("La suma es"+MiembroEstatico.sumar(1,2));
    */
    }
    
}
