/*
Programa que permite dirigir el movimiento de un objeto dentro de un tablero
y actualce su posición dentro del mismo. Se puede mover arriba, abajo,
izquierda y derecha. TRas unmovimeinto el programa mostrará las nuevas coordenadas
del objeto
 */
package POO;

import java.util.Scanner;

/**
 *
 * @author genifer.moreno
 */
public class MoverTablero {
    
    // Atributos para moverse en el plano carteciano
    private int x;
    private int y;

    
    // Constructor
    public MoverTablero(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Métodos para moverse en las 4 posiciones
    public void moverArriba(int incremento) {
        y += incremento; 
    }
    
    public void moverAbajo(int incremento) {
        y -= incremento; 
    }
    
    public void moverIzquierda(int incremento) {
        x -= incremento; 
    }
    
    public void moverDerecho(int incremento) {
        x += incremento; 
    }

    // Métodos para obtener las posiciones
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
        
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        MoverTablero t1; // Objeto de la clase sin inicialización 
        int x,y;
        int opcion = 0, incremento = 0;
        
        
        // Pedir al usuario las coordenadas iniciales
        System.out.println("Digite la posición inicial en X");
        x = entrada.nextInt();
        
        System.out.println("Digite la posición inicial en Y");
        y = entrada.nextInt();
     
        
        t1 = new MoverTablero(x,y); // Inicialización del objeto de la clase con las variablesd el usuario
        
        // Mostrar al usuario las opciones para moverse
        do{
            
            System.out.println("\n Menu");
            System.out.println("1. Mover arriba");
            System.out.println("2. Mover abajo");
            System.out.println("3. Mover derecha");
            System.out.println("4. Mover izquierda");
            System.out.println("5. Salir");
            System.out.print("Digite la opción");
            opcion = entrada.nextInt();
            
            if(opcion != 5) {
                System.out.println("\n Digite la cantidad de espacios a moverse");
                incremento = entrada.nextInt();
            }
            
            /*Según la opción elegida se llama al método corresponciente 
         Al metodo se le nevía el incremento, que es la cantidad de posiciones que el usuario se quiere mover
            */
            
            switch(opcion) {
                case 1: t1.moverArriba(incremento); break;
                case 2: t1.moverAbajo(incremento); break;
                case 3: t1.moverDerecho(incremento);break;
                case 4: t1.moverIzquierda(incremento);break;
                case 5: break; // Si selecciona 5, se sale del programa
                default:System.out.println("Opción de menú invalida");
            }
        
        // cada vez que se hace un movimiento, se muestra las coordenadas actuales
            System.out.println("Posición actual "+ t1.getX() +" , " + t1.getY());
        
      // El ciclo se repetira hasta que el usuario selecciona una opción de menú diferente a 5             
        } while(opcion != 5); 
    }
    
}
