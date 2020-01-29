/*

 */
package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author genifer.moreno
 */
public class ArchivoTexto {
      // Atributo archivo
        File archivo;
    
        
        private void crearArchivo() {
         // Debe capturar alguna excepcion 
            try {
                archivo = new File("Prueba.txt");
                               
                if(archivo.createNewFile()) {
                    System.out.println("El archivo se ha creado correctamente");
                }  
            } catch (IOException ex) {
                Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          
        /*
        private void crearDirectorio(){
            
            archivo = new File("Directorio");
            
            if(archivo.mkdir()) { // mkdir es el método para crear una carpeta
                System.out.println("Se ha creado el directorio correctamente");
            }else {
                System.out.println("No se ha podido crear el directorio");
            }
        
        }
        
        */
        private void escribirTexto(){
         // Con este método se sobrescribe lo que ya tiene el texto
            try {
                // Clase para escribir sobre un archivo
                FileWriter escribir = new FileWriter(archivo);// se le puede pasar la ruta para crear un archivo
                // Se le pasa la cadena que se quiere escribir en el archivo
                escribir.write("Hola curso de Java");
                // Se debe cerrar el archivo 
                escribir.close();
            } catch (IOException ex) {
                System.out.println("No se pudo escribir sobre el archivo");
            }
        }
        
        
        private void añadirTexto(){
             try {
                // Clase para escribir sobre un archivo
                FileWriter escribir = new FileWriter(archivo,true);// El true indica que va a añadir más texto, no escribir
                // Se le pasa la cadena que se quiere escribir en el archivo
                escribir.write("\r\nHola curso de Java"); // \r\n Para dar saltos de línes en archivos
                 escribir.write("\r\nGenifer Moreno");
                // Se debe cerrar el archivo 
                escribir.close();
            } catch (IOException ex) {
                System.out.println("No se pudo escribir sobre el archivo");
            }
            
        }
        
        
         private void leerTexto(){       
            String cadena;
            
            try {
                // Objeto de tipo FileReader
                FileReader lector = new FileReader(archivo);
                // objeto 
                BufferedReader lectura = new BufferedReader(lector);
               // lee una línea
                cadena = lectura.readLine();
                
                // Se valida hasta que el archivo sea vacio se seguirá leyendo 
                while(cadena!=null) {
                 System.out.println(cadena);
                 cadena = lectura.readLine();
                }
                
                             
            } catch (FileNotFoundException ex) {
                System.out.println("Ocurrio un error"+ex);
            } catch (IOException ex) {
                    System.out.println("Ocurrio un error"+ex);
                }
        
        }
        
                
    public static void main(String[] args) {
          // Crear el objeto de tipo ArchivoTexto
         ArchivoTexto archivos = new ArchivoTexto();
         
         // Se le dice que utilice su método crearArchivo
       archivos.crearArchivo();
        // archivos.crearDirectorio();
      //  archivos.escribirTexto();
      //  archivos.añadirTexto();
        archivos.leerTexto();
    }
}
