/*
El arreglo debe estar ordenado  de manera ascendente 
 */
package Busquedas;

import javax.swing.JOptionPane;

/**
 *
 * @author genifer.moreno
 */
public class Binaria {
    
         public static void main(String[] args) {
             int arreglo[] = {1,2,3,4,5};
             int dato, inf=0, sup=5, mitad, i=0;
             boolean band = false;
             
            dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato que desea buscar"));
             
            mitad = (inf+sup)/2;
            
            while(inf<=sup && i<5) {
                if(arreglo[mitad] == dato) { // si el numero de la mitad es el numero lo encontro
                 band = true;
                 break;
                }
             if(arreglo[mitad] > dato){ // el numero de mitad es mayor al numero que esta buscando
               sup = mitad;
               mitad = (inf+sup)/2;
             } 
             if(arreglo[mitad] < dato) { // el numero de la mitad es menor al numero que esta buscando
              inf = mitad;
              mitad = (inf+sup)/2;
             }
            i++;
            }
            
         if(band == false){
          System.out.println("No se ha encontrado en número");
        }else {
          System.out.println("Se encontro el número en la posición"+(i-1));
     }
}
}
