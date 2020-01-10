/*
Leer 5 números de manera creciente, almacenarlos en un vector de 10 posiciones.
Leer un número N e insertarlo en la posición correspondiente para que 
el vector siga ordenado
 */
package ArreglosOVectores;

import java.util.Scanner;

/**
 *
 * @author genifer.moreno
 */
public class OrdenNumeros {
    
    public static void main(String[] args) {
     
         Scanner entrada = new Scanner(System.in);
         
         int arreglo[] = new int[10];
         boolean creciente = true; //el areglo esta ordenado hasta que se demuestre lo contrario
         int numero,sitio_num=0,j=0;
         
         System.out.println("Llenar el arreglo");
         
         //Llenar el arreglo
         do{
             for(int i=0;i<5;i++) {
                 System.out.println("Digite el número"+(i+1));
                 arreglo[i] = entrada.nextInt();
             }
             
        // Comparar si el arreglo esta ordenado de forma creciente
            for(int i=0;i<4;i++) {
                if(arreglo[i] < arreglo[i+1]) { //creciente 1-2-3
                creciente = true;
                } 
                if(arreglo[i] > arreglo[i+1]) { // Decreciente 3-2-1
                creciente = false;
                break; // si en un numero ya no se cumple que sea creciente, se termina el bucle
                }
            }
            
            // el usuario tendrá que ingresar otra vez los números hasta que esten en orden
            if(creciente == false) {
                System.out.println("El arreglo no esta ordenado de forma creciente, vuelva a digitar");
            }
         } while(creciente == false);
         
          System.out.println("Digite un elemento a insertar ");
          numero = entrada.nextInt();
          
          // Saber en que posición va el numero
          while(arreglo[j]<numero && j<5) { // si la posición es menor al numero ingresado y no se completado la cantidad de elementos del arreglo
          sitio_num++;
          j++;
          }
          
          // Translar una posición en el arreglo a los elementos que van detras del numero
          for(int i=4;i>=sitio_num;i--) {
          arreglo[i+1] = arreglo[i];
          }
          
          // Insertar el numero que el usuario ingreso
          arreglo[sitio_num] = numero;
          
          System.out.println("El arreglo queda: ");
          for(int i=0;i<6;i++) {
              System.out.println(arreglo[i]);}
    }
}
