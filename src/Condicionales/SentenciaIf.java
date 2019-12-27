
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author genifer.moreno
 */
public class SentenciaIf {
    
    // Entre parentesis va la condición if
    
    public static void main(String[] args) {
    
        int numero, dato = 5;
        
        // Joption devuelve una cadena, hay que convertirlo a entero
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número")); 
        
        if (numero == dato) {
        JOptionPane.showMessageDialog(null,"El número es 5");
        } 
        else {
        JOptionPane.showMessageDialog(null,"El número es diferente de 5");
        }
    }
    
}
