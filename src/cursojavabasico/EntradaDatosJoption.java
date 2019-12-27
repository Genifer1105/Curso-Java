package cursojavabasico;

import javax.swing.JOptionPane;

/**
 *
 * @author genifer.moreno
 */
public class EntradaDatosJoption {

    public static void main(String args[]) {

        String cadena;
        int entero;
        char caracter;
        double decimal;

        // Ingresar datos por ventana, da como resultado un String/cadena
        cadena = JOptionPane.showInputDialog("Digite una cadena");

        // Transforma la cadena del Joption / String a un entero para que guarde en la variable entero
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero"));

        caracter = JOptionPane.showInputDialog("Digite un caracter").charAt(0);

        // Se tranforma la cadena a double para que pueda guardar
        // Con JOption se ingresa el valor con punto
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal"));

        
        // Mostrar la ventana pero con mensajes 
        
        JOptionPane.showMessageDialog(null, "La cadena es:" + cadena);

        JOptionPane.showMessageDialog(null, "El entero es:" + entero);

        JOptionPane.showMessageDialog(null, "El caracter es:" + caracter);

        JOptionPane.showMessageDialog(null, "El decimal es:" + decimal);
    }
}
