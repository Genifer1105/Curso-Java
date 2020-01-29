/*
 javax.swing es un paquete de gráficos  
la clase JFrame pertenece al paquete gráfico de Java con el que se pueden crear ventanas
y gráficos 

 JFrame - Panel - Etiquetas
 */
package Interfaces;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author genifer.moreno
 */
public class Ventana extends JFrame{
    
    public Ventana() { // Constructor
        this.setSize(400, 400); // Establecer el tamaño de la ventana: Ancho - Largo
   
        this.setTitle("Ventana JFrame"); // Establecer título de la ventana
   
   //      setLocation(200, 300); // localización de la ventana en pixeles
         
        // setBounds(WIDTH, WIDTH, WIDTH, WIDTH);  X, Y, Ancho, Largo
     
         this.setLocationRelativeTo(null); // Con el parametro null se posicionará la ventana en el centro de la pantalla
         
       //  setResizable(false); // Establecer si la ventana puede cambiar de tamaño (No cambiará el tamaño desde las esquinas)
    
         this.setMaximumSize(new Dimension(200,200)); //Establecer el tamaño mínimo que puede tener la ventana
    
       //   this.getContentPane().setBackground(Color.yellow); // Establecer color de la ventana 
       
            this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando cierre la ventana de la X el programa finalizará 
  
            
            iniciarComponentes();
    }
    
    private void iniciarComponentes() {
      JPanel panel = new JPanel(); // Crear el panel
      panel.setLayout(null); // Desactivar el diseño
      this.getContentPane().add(panel); //Agregar el panel a la ventana
          
      // Crear etiqueta
      JLabel etiqueta = new JLabel();// Crear la etiqueta, se le puede pasar el texto  como parametro 
      etiqueta.setText("Hola");
      etiqueta.setBounds(10,10, 50, 50); 
      etiqueta.setOpaque(true);// Establecer pintar el fondo de la etiqueta
      etiqueta.setForeground(Color.MAGENTA); // Para cambiar el color del texto Hola 
      etiqueta.setBackground(Color.BLACK); // Cambiar el color de fondo de la etiqueta
      panel.add(etiqueta); // Agregar la etiqueta al panel 
      
    }
}
