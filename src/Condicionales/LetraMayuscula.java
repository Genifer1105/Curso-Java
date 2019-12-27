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
public class LetraMayuscula {
    
    public static void main(String[] args) {
    
        char letra;
        
        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0); // guarda la primera letra de la cadena
        
        if(Character.isUpperCase(letra)) { // Función de la clase Character para validar que sea mayuscula
          JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        } 
        else  {
        JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
            
    }
}
