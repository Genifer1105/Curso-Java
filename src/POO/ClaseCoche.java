/*
 Creación de una clase Coche con un objeto
 */
package POO;

/**
 *
 * @author genifer.moreno
 */
public class ClaseCoche {
    
    //Atributos
    String color;
    String marca;
    int km;
    
    //Método
    public static void main(String[] args) {
    
        ClaseCoche coche1 = new ClaseCoche();
        
        coche1.color = "Negro";
        coche1.marca = "Ferrari";
        coche1.km = 10;
    
        System.out.println("El color del coche es "+coche1.color);
        System.out.println("La marca del coche es "+coche1.marca);
        System.out.println("Los km del coche son "+coche1.km);
    
    }
}
