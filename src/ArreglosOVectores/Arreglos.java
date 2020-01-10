/*
  Un areglo es una estructura de datos que permite almacenar datos
del mismo tipo. El tamaño del arrar se declara al inicio y no puede
cambiar durante la ejecución
Array Unidimencionales:
 TipoVariable[] NombreArray = new TipoVariable[dimensión]
 */
package ArreglosOVectores;

/**
 *
 * @author genifer.moreno
 */
public class Arreglos {
    
    public static void main(String[] args) {

        int[] numeros = new int[5];
         // int[] numeros = {1,2,3,4,5}
             
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        
   
        
        System.out.println(numeros[0]); // imprime el número que hay en esa posición
        
        // el buque debe ir desde 0 hasta un número antes del tamañao del vector y muestra los valores
        for(int i=0;i<3;i++) {
        System.out.println(numeros[i]);    
    }
}
}