/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosOVectores;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author genifer.moreno
 */
public class ArregloUsuario {
    
    public static void main(String[] args){
    
        Scanner entrada = new Scanner(System.in);
        int elementos; // variable para guardar el tamaño del arreglo
        
    //    elementos =  Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo"));
    
      System.out.println("Digite el tamaño del arreglo ");
      elementos = entrada.nextInt();
      
      
        // Crear arreglo de caracteres del tamaño ingresado
       char[] letras = new char[elementos];
       
       
       //Llenar el arreglo
        System.out.println("Digite los valores del arreglo");
        
        for(int i=0;i<elementos;i++) {
            System.out.println((i+1)+"Digite un caracter"); // Para que el conteo aparezca desde 1
            letras[i] = entrada.next().charAt(0); // Para que guarde el primer caracter que encuentre
        }
        
        // Recorre el vector y mostrar los valores
        System.out.println("\n Los caracteres del arreglo son");
        for(int i=0;i<elementos;i++) { 
            System.out.println(letras[i]);
        }
    }
    
}
