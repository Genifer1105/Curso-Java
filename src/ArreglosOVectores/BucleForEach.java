/*
 El buqle for each, sirve para mostrar los valores de un vector, más
sencillo que el for
 */
package ArreglosOVectores;

/**
 *
 * @author genifer.moreno
 */
public class BucleForEach {
    
    public static void main(String[] args) {
    
        String[] nombres = {"Genifer","Alejandro","Susana"};
        
        for(String i:nombres) { // Tipo de dato del vector, iterador : nombre del vector
            System.out.println("Nombres "+ i); // Se imprime el iterador
        // No necesita saber cuantas posiciones tiene el vector 
        }
        
        
        /* for (int i=0;i<nombres.length;i++) 
        Método Length, para cuando no sabemos el tamaño de vector, 
        lo recorre hasta la última posición de este
        */
    }
    
}
