/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_read_text_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Uptow
 */
// \t tabulacion  \n salto de linea 
public class EVA3_9_READ_TEXT_FILES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "c:\\aaa\\prueba.txt"; //windows
        try {
            readUsingFiles(ruta);
        } catch (IOException ex) {
            ex.printStackTrace(); //imprimir la excepcion
        }
    }
    /*
        Files ---> lee todo el archivo y lo carga en memoria principal (RAM). por tanto, solo sirve en archivos pequeños.
    
    */
    public static void readUsingFiles(String ruta) throws IOException{
        
        Path path = Paths.get(ruta);
        //readAllList meregresa una lista de tipo string
        /*List<String> contenidoArch = Files.readAllLines(path);
        //Soystem.out.println(contenidoArch.toString());
        for (int i = 0; i < contenidoArch.size(); i++){
            System.out.println(contenidoArch.get(i));
        }*/
        byte[] arregloBytes = Files.readAllBytes(path);
        System.out.println(new String(arregloBytes));
    }
}
//:v
