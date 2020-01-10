/*
La matriz es simetrica cuando es cuadrada (nFil == nCol)
Y cuadno se obtiene la misma matriz al cambiar sus filas por columnas
 */
package Matrices;

import java.util.Scanner;

/**
 *
 * @author genifer.moreno
 */
public class MatrizSimetrica {
    
     public static void main(String[] args) {
        
     Scanner entrada = new Scanner(System.in);
      int matriz[][], nFil, nCol;
      boolean simetrica = true;
      
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
        
        // Determinar si es simétrica
        
        if(nFil == nCol) { // Comparar número de filas y columnas, si es cuadrada sigue comparando
            int i,j;
            i = 0;
                while(i<nFil && simetrica == true) { //
                    j=0;
                    while(j<i && simetrica==true) {
                        if(matriz[i][j] != matriz[j][i]) { // Si la matriz normal y la traspuesta no quedan iguales no es simetrica
                        simetrica = false;
                       }
                     j++;
                    }
                i++;   
                }
        
              if(simetrica==true) {
                 System.out.println("La matriz  es simétrica");
                 }else {
                   System.out.println("La matriz no es simetrica");
        }
     }
      else { // Si la matriz no es cuadrada, de una vez no es simetrica 
            System.out.println("La matriz no es simetrica");
}
}
}

