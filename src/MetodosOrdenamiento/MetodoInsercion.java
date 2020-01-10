/*
 Requiere O(n¨2) 
Si numeroIzq > numeroActual
        Cambio
 */
package MetodosOrdenamiento;

import java.util.Scanner;

/**
 *
 * @author genifer.moreno
 */
public class MetodoInsercion {
    
    public static void main(String[] args) {
    
         Scanner entrada = new Scanner(System.in);
         int arreglo[], nElementos, pos, aux;
         
         System.out.println("Digite el numero de elementos del vector");
         nElementos = entrada.nextInt();
         
         arreglo = new int[nElementos];
         
         for(int i=0; i<nElementos;i++){
             System.out.println("Digite los numeros del arreglo");
             arreglo[i] = entrada.nextInt();
         }
         
         // Ordenamiento por insercion
         for(int i=0;i<nElementos;i++) {
             pos = i;
             aux = arreglo[i];
              while((pos>0) && (arreglo[pos-1] > aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--; // para que siga comprobando con os números que hay a la izquierda
              }
              arreglo[pos] = aux;
         }
         
           System.out.println("\n Arreglo ordenado");
         // Mostrar el arreglo ordenado
         for(int i=0;i<nElementos;i++) {
             System.out.println(arreglo[i]);
         }
    }
}
