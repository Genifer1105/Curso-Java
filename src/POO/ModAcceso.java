/*
Modificadores de acceso  :
    El modificador de acceso se pone antes del tipo de atributo
 */
package POO;

/**
 *
 * @author genifer.moreno
 */
public class ModAcceso {
    
    /*
    Si no se le pone modificador de acceso, por defecto, se podrá aceder a él desde
    cualquier clase que este en el mismo paquete
  
    */
    int numero1;
  
    
    /*
    Si se quiere acceder a una clase de otro paquete se debe importar el paquete y la clase
    y allí se debe cambiar el modificador de acceso por Public
    */
    
    public int numero2;
    
    /*
    Con el modificador Private, restringe el atributo para que solo pueda ser utilizado por
    la misma clase, sin importan otras clases que esten en el mismo paquete y lo quieran utilizar
    */
    private int numero3;
}
