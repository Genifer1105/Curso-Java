/*
 Archivos: 
Es un conjunto de bits almacenados en un dispositivo
Es identificado por un nombrey la descripción de la carpeta o directorio que lo contiene (ruta)
Facilitan una manera de organizar los recursos para almacenar permanentemente datos en un sistema

 */
package Archivos;

import java.io.File;

/**
 *
 * @author genifer.moreno
 */
public class ClaseFile {
    
    
    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\genifer.moreno\\Desktop\\Archivo.txt"); // Ruta absoluta del archivo
        // Para usar la ruta relativa el archivo debe estar dentro del proyecto  ("Archivo.txt")
        
        if(archivo.exists()) { // Validar si el archivo existe
            System.out.println("El archivo si existe");
        }else {
            System.out.println("El archivo no existe");}
    }
}
