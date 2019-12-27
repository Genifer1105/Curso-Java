/*
 Si la compra es mayor a 300 se hace descuento del 20%
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author genifer.moreno
 */
public class DescuentoCompra {
    
    public static void main(String[] args) {
    
        float precioCompra, descuento;
        
        precioCompra = Float.parseFloat(JOptionPane.showInputDialog("Cual es el precio de la compra"));
        
        if (precioCompra > 300) {
          descuento = precioCompra + 0.20f;
          precioCompra -= descuento;
          JOptionPane.showMessageDialog(null, "El precio de la compra es" + precioCompra);
        }
        else {
              JOptionPane.showMessageDialog(null, "El precio de la compra es" + precioCompra);
        }
    }
}
