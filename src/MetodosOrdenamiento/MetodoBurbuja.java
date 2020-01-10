/*
 Funciona revisando cada elemento con el siguiente, intercambiandolos
de posición si están en el lugar equivocado
Si numeroActual > numeroSiguiente 
        Cambio
 */
package MetodosOrdenamiento;

import java.util.Scanner;

/**
 *
 * @author genifer.moreno
 */
public class MetodoBurbuja {
    
    public static void main(String[] args) {
    
         Scanner entrada = new Scanner(System.in);
         int arreglo[], nElementos, aux;
         
         System.out.println("Digite el numero de elementos del vector");
         nElementos = entrada.nextInt();
         
         arreglo = new int[nElementos];
         
         for(int i=0; i<nElementos;i++){
             System.out.println("Digite los numeros del arreglo");
             arreglo[i] = entrada.nextInt();
         }
         
         // Método burbuja
         
         for(int i=0;i<(nElementos-1);i++) {
             for(int j=0;j<(nElementos-1);i++){ //Para ordenar el arrelo
                 if(arreglo[j] > arreglo[j+1]) { // si numeroActual > numeroSiguietne, cambio
                   aux = arreglo[j];
                   arreglo[j] = arreglo[j+1];
                   arreglo[j+1] = aux;
                 }
             }
         }
         
         System.out.println("\n Arreglo ordenado");
         // Mostrar el arreglo ordenado
         for(int i=0;i<nElementos;i++) {
             System.out.println(arreglo[i]);
         }
    }
}
