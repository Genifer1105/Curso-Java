/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author genifer.moreno
 */
public class AdivinarNroAleatorio {
    
    public static void main(String[] args) {
    
        int numero,aleatorio, contador = 0;
        
        aleatorio = (int)(Math.random()*10); //ramdom devuelve un double, se debe comvertir a entero entre 1-10
        
        // mínimo se le pide al usuario un número una vez
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
            
            // comparar el número ingresado con el generado aleatoriamente
            if (aleatorio > numero) {
                System.out.println("El número es mayor");
            } else {
                 System.out.println("El número es menor");
            }
            contador++;
        }while(numero != aleatorio); // miestras sean diferentes se seguirá ejecutando, termina cuando adivine el aleatorio
        
            System.out.println("Adivinaste el número en"+contador+"intentos");
    
    }
}
