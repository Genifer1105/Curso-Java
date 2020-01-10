/*
 
Métodos - Parámetros y Argumentos 
 */
package POO;

import java.util.Scanner;

/**
 *
 * @author genifer.moreno
 */
public class Operacion {
    
    // Atributos - Variables globales
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int numero1;
    int numero2;
    

    // Métodos
    
    public void leerNumeros() {
    
        /*
        Scanner entrada = new Scanner(System.in);
     
        System.out.println("Digite el numero 1");
        numero1 = entrada.nextInt();
        
        System.out.println("Digite el numero 2");
        numero2 = entrada.nextInt();
        */
    }
    
    // Los métodos piden argumentos
    
    public void sumar(int numero1, int numero2) {
        suma = numero1 + numero2;
    }
    
      public void restar(int numero1, int numero2) {
        resta = numero1 - numero2;
    }
     
      public void  multiplicar(int numero1, int numero2) {
        multiplicacion = numero1 + numero2;
    }
        
      public void  dividir(int numero1, int numero2) {
        division = numero1 / numero2;
    }
      
      
     public void mostrarResultados() {
         System.out.println("La suma es"+suma);
         System.out.println("La resta es"+resta);
         System.out.println("La multiplicacion es"+multiplicacion);
         System.out.println("La division es"+division);
            
     }
     
     /* El método main se ejecuta y se crea un objeto de la clase operación para poder llamar los metodos
     El método main se puede hacer en una clase separada e igual funciona
     */
     public static void main(String[] args) {
        
         Operacion op = new Operacion();      
              /*
         op.leerNumeros();
         op.sumar();
         op.restar();
         op.multiplicar();
         op.dividir();
     */
         
        int numero1, numero2;
               
        Scanner entrada = new Scanner(System.in);
     
        System.out.println("Digite el numero 1");
        numero1 = entrada.nextInt();
        
        System.out.println("Digite el numero 2");
        numero2 = entrada.nextInt();
        
        op.sumar(numero1, numero2); // Al invocarlos piden que se envíen los argumentos 
        op.restar(numero1, numero2);
        op.multiplicar(numero1, numero2);
        op.dividir(numero1, numero2);
        op.mostrarResultados();
         
     }
     
}
