/*
    Es un arreglo Bidimencional que también almacena datos del mismo tipo
Necesita dos indices para acceder a los elementos
 */
package Matrices;

import java.util.Scanner;

/**
 *
 * @author genifer.moreno
 */
public class Matriz {
    
    public static void main(String[] args) {
    
    // Llenar la matriz manualemtne:  int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
      Scanner entrada = new Scanner(System.in);
      int matriz[][], nFil, nCol;
      
      // Pedir numero de filas y columnas
        System.out.println("Digite el número de filas");
        nFil = entrada.nextInt();
        
        System.out.println("Digite el número de columnas");
        nCol = entrada.nextInt();
        
        matriz = new int[nFil][nCol];
        
        // Llenar la matriz
        for(int i=0; i<nFil;i++) {
            for(int j=0;j<nCol;j++) {
                System.out.println("Digite el número de la matriz"+i+j);
                matriz[i][j] = entrada.nextInt();
            }
        }
               
        // Imprimir la matriz
        System.out.println("La matriz es");
        
      for(int i=0;i<nFil;i++) { //numero de filas
          for(int j=0;j<nCol;j++) { //numero de columnas
              System.out.println(matriz[i][j]);
          }
      }
    }
    
}
