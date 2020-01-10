/*
Buscar un elemento dentro de un arreglo
Busca un elemento ingresado por el usuario y dice en que posicion está
 */
package Busquedas;

import javax.swing.JOptionPane;

/**
 *
 * @author genifer.moreno
 */
public class Secuencial {
 
    
    
     public static void main(String[] args) {
         
         int arreglo[] = {3,4,5,1,2};
         int dato;
         boolean band = false;
         
         dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato que desea buscar"));
         
         //Busqueda secuencial
          int i=0;
          
          while(i<5 && band == false) {
          if(arreglo[i] == dato)
              band = true;
          }
          i++;
     
      if(band == false){
          System.out.println("No se ha encontrado en número");
        }else {
          System.out.println("Se encontro el número en la posición"+(i-1));
}
}
}
