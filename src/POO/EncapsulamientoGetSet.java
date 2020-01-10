/*
  El encapsulamiento = atributos esten encapsulados (privados)

    Métodos accesores
    Set = establecer
    get = obtener
 */
package POO;

/**
 *
 * @author genifer.moreno
 */
public class EncapsulamientoGetSet {
    
    
    private int edad;
    private String nombre;

    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNomre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public static void main(String[] args) {
    
         EncapsulamientoGetSet objeto1 = new EncapsulamientoGetSet();
         
         objeto1.setEdad(20); // Se asgina el valor con el set porque es private, así podrá acceder a el
         System.out.println("La edad es"+objeto1.getEdad()); //Obtengo la edad ingresada con el Get
      
    }
}
