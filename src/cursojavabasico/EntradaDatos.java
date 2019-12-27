
package cursojavabasico;

import java.util.Scanner;

/**
 *
 * @author genifer.moreno
 */
public class EntradaDatos {
    
    public static void main(String args[]) {
    
        Scanner entrada = new Scanner(System.in); // .in viene de input o entrada de datos
        
        int numero;
        System.out.println("Digite un numero");
        numero = entrada.nextInt(); // int por el tipo de la variable
        System.out.println("El número es "+ numero);
        
        
        float numeroFloat;
          System.out.println("Digite un numero float"); // Al ingresar el valor float en consola debe ser con coma 
          numeroFloat = entrada.nextFloat(); 
          System.out.println("El número float es "+ numeroFloat);
          
        String cadena;
         System.out.println("Digite una cadena");
         cadena = entrada.next(); // para guardar una cadena larga se pone nextLine(), con next se guarda hasta que haya un espacio
         System.out.println("La cadena es "+ cadena);
        
         char letra;
          System.out.println("Digite una letra");
          letra = entrada.next().charAt(0); //con el charAt(0) se guarda solo el primer caracter de lo que se ingrese
    }
}
