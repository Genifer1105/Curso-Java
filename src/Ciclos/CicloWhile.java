/*
 while (condicion) { si no cumple la condición no se ejecuta ni una vez
    instrucciones
} si la condición no se cumple se detiene el bucle 
 */
package Ciclos;

/**
 *
 * @author genifer.moreno
 */
public class CicloWhile {
    
    public static void main(String[] args) {
         // se debe inicializar el iterador 
         int i=1;
         
         // Aumenta el valor de i que empezó en 1 hasta 10
         while(i<=10) {
             System.out.println(i);
             i++; // i += 2
            }
    
    }
}
