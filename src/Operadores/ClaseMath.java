
package Operadores;

/**
 *
 * @author genifer.moreno
 */
public class ClaseMath {
    
     public static void main(String[] args) {
       
         // Raiz cuadrada 
         double raiz = Math.sqrt(9); // sqrt funciona solo con un double
         System.out.println("La raiz cuadrada de 9 es"+ raiz);    
     
         
        // Potencia        
        double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente);
        
         System.out.println("La potencia de 5 es " + resultado);
     
         
        // Redondear un numero
        double numero = 4.56;
        long redondeo = Math.round(numero); // la variable de resultado debe ser long (entero)
       System.out.println("El redondeo es " + redondeo);
       
       
        float numero1 = 4.56f;
        int redondeoFloat = Math.round(numero1); // la variable de resultado debe ser int
       System.out.println("El redondeo float es " + redondeoFloat);
       
       
       // Método ramdom 
       
       double ramdom = Math.random(); // Ramdom debe ser con una variable Double
         System.out.println("Ramdom "+ ramdom);
       
     }
}
