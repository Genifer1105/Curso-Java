/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

import java.util.Scanner;

/**
 *
 * @author genifer.moreno
 */
public class SumaMatrices {
      public static void main(String[] args) {
          
          Scanner entrada = new Scanner(System.in);
          int matriz1[][] = new int[3][3];
          int matriz2[][] = new int[3][3];
          int suma[][] = new int[3][3];
          
         
           // Llenar la matriz 1
           System.out.println("Digite la matriz 1");
             for(int i=0; i<3;i++) {
               for(int j=0;j<3;j++) {
                System.out.println("Digite el número de la matriz"+i+j);
                matriz1[i][j] = entrada.nextInt();
                 }
            }
           
            // Llenar la matriz 2
           System.out.println("Digite la matriz 2");
            for(int i=0; i<3;i++) {
                for(int j=0;j<3;j++) {
                System.out.println("Digite el número de la matriz"+i+j);
                matriz2[i][j] = entrada.nextInt();
            }
        }            
            
           // Sumar las matrices
          for(int i=0;i<3;i++) {
              for(int j=0;j<3;j++) {
                  suma[i][j] = matriz1[i][j] + matriz2[i][j];
              }
          }
          
          // Imprimir matriz suma
          
          System.out.println("La suma de las matrices es");
          for(int i=0;i<3;i++) {
              for(int j=0;j<3;j++) {
                  System.out.println(suma[i][j]+" ");
              }
          }
          
      
      }
}
