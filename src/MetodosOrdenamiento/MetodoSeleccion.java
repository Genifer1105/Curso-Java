/*
 Requiere O(n¨2) operaciones para ordenar una lista de n números
 */
package MetodosOrdenamiento;

import java.util.Scanner;

/**
 *
 * @author genifer.moreno
 */
public class MetodoSeleccion {
    
     public static void main(String[] args) {
    
      Scanner entrada = new Scanner(System.in);
         int arreglo[], nElementos, min, aux;
         
         System.out.println("Digite el numero de elementos del vector");
         nElementos = entrada.nextInt();
         
         arreglo = new int[nElementos];
         
         for(int i=0; i<nElementos;i++){
             System.out.println("Digite un numero");
             arreglo[i] = entrada.nextInt();
         }

        // Ordenamiento por Seleccion
        
        for(int i=0;i<nElementos;i++) {
          min = i;
          for(int j=i+1;j<nElementos;j++) {
          if(arreglo[j] < arreglo[min]) {
              min = j;
          }
          }
          aux = arreglo[i];
          arreglo[i] = arreglo[min];
          arreglo[min] = aux;
        }
     
        
           System.out.println("\n Arreglo ordenado");
         // Mostrar el arreglo ordenado
         for(int i=0;i<nElementos;i++) {
             System.out.println(arreglo[i]);
     }
 
     }
}
