/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author genifer.moreno
 */
public class OperadorTerminario {
    
    
    public static void main(String[] args) {

       int numero;
       String mensaje;        
       
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
            
            // Operador ternario ?, valor = (condicion) ? valor1 : valor2;
            
            //si es true se muestra el 1er mensaje, si es false se muestra el 2do 
            mensaje = (numero%2==0) ? "Es par" : "Es impar";
            
            // Se muestra uno de los dos mensajes según el resultado
            JOptionPane.showMessageDialog(null,mensaje);
            
            // JOptionPane.showMessageDialog(null, mensaje = (numero%2==0) ? "Es par" : "Es impar");
        }
}
