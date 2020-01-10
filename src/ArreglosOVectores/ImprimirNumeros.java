/*
Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden
que fueron ingresados
 */
package ArreglosOVectores;

import java.util.Scanner;

/**
 *
 * @author genifer.moreno
 */
public class ImprimirNumeros {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5]; //Crear vector
    
    // Pedir los 5 números
      for(int i=0;i<5;i++) {
          System.out.println("Digite el valor"+(i+1));
          numeros[i] = entrada.nextInt();
      }
      
      // Mostrar los valores con un for each
        System.out.println("\n Imprimiendo los valores");
      for(int i:numeros) {
          System.out.println(i);
      }
      
     System.out.println("\n Imprimiendo los valores a la inversa");
      
      // Mostrar los valores ingresados a la inversa
      for(int i=4;i>=0;i--) {
          System.out.println(numeros[i]);
      }
    }
}
