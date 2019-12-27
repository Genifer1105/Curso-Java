/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadores;

/**
 *
 * @author genifer.moreno
 */
public class IncrementoDecremento {
    
         public static void main(String[] args) {
             
             // Incremento y decremento de variables
             
             int x = 5;
             int y;
             
             x++; // Aumenta una unidad el valor de la variable  
             x--; // Disminuye una unidad el valor de la variable 
             
             y = x++; // No funciona, primero se esta asignando el valor de x a y (5), después se aumentará
             y = ++x; // Primero se aumentará y luego se hará la asignación
         
         }
}
