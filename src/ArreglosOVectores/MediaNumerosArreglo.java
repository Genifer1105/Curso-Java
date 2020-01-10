/*
 Pedir 5 números, alamacenarlos en un arreglo,
sacar la media de los positivos y los negativos
y contar la cantidad de ceros que hay
 */
package ArreglosOVectores;

import java.util.Scanner;

/**
 *
 * @author genifer.moreno
 */
public class MediaNumerosArreglo {
    
    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        int  sumaPos=0, sumaNeg=0, mediaPositivos=0, mediaNegativos, contPos=0, contNeg=0, contCeros=0;
        
        int[] arreglo = new int[5];
        
        System.out.println("Solicitando números");
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Digite el número"+(i+1));
            arreglo[i] = entrada.nextInt();
        }
        
            for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]>0) {
                sumaPos = sumaPos + arreglo[i];
                contPos ++;
            } else if (arreglo[i]<0){
                sumaNeg = sumaNeg + arreglo[i];
                contNeg ++;
            } else {
              contCeros++;
            }
                
        }
            
         System.out.println("La cantidad de números positivos es"+ contPos);
         
            if(contPos != 0) {
                 mediaPositivos = sumaPos / contPos;
                 System.out.println("La media de los números positivos es"+ mediaPositivos);
            } else {
              System.out.println("No hay numeros positivos para sacar la media");
            }
            
            
            System.out.println("\n La cantidad de números negativos es"+ contNeg);
             
            if(contNeg !=0) {
                mediaNegativos = sumaNeg / contNeg;
                System.out.println("La media de los números negativos es"+ mediaNegativos);
            }else {
                 System.out.println("No hay numeros negativos para sacar la media");
            }
            
         System.out.println("\n La cantidad de ceros es"+ contCeros);
        }
    }

