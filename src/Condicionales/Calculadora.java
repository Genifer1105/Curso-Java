/*
Calculadora
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author genifer.moreno
 */
public class Calculadora {
    
    public static void main(String[] args) {
    
        int numero1, numero2, resultado;
        char operacion;
                
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo úmero"));
        
        operacion = JOptionPane.showInputDialog("Digite la operacion que desea realizar").charAt(0);
         
        switch (operacion) {
            case 's': resultado = numero1+numero2;
                JOptionPane.showMessageDialog(null, "La suma es"+ resultado);
                break;
            case 'r': resultado = numero1-numero2;
                JOptionPane.showMessageDialog(null, "La resta es"+ resultado);
                break;
            case 'm': resultado = numero1*numero2;
                JOptionPane.showMessageDialog(null, "La multiplicacion es"+ resultado);
                break;
            case 'd':   resultado = numero1/numero2;
                JOptionPane.showMessageDialog(null, "La divición es"+ resultado);
                break;
            default : JOptionPane.showMessageDialog(null, "Operacion no permitida");
        }    
     
    }
}
