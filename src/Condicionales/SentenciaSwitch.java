
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author genifer.moreno
 */
public class SentenciaSwitch {
    
    public static void main(String[] args) {
    
    // Condicionales multiples Switch
    
       int dato;
       
         // Joption devuelve una cadena, hay que convertirlo a entero
       dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 1 y 5"));
     
       // Solo se debe cumplir un caso del switch
       
       switch(dato) { // dato con el cual se validaran varios casos
           case 1: JOptionPane.showMessageDialog(null, "Es el número 1");
                 break; // con el break se sale del switch al cumplirse el case
           case 2: JOptionPane.showMessageDialog(null, "Es el número 2");
                 break;
           case 3: JOptionPane.showMessageDialog(null, "Es el número 3");
                 break;
           case 4: JOptionPane.showMessageDialog(null, "Es el número 4");
                 break;
           case 5: JOptionPane.showMessageDialog(null, "Es el número 5");
                  break;
            
           default: JOptionPane.showMessageDialog(null, "El número no esta en el rango de 1 a 5");
              break;
       }
    
    }
}
