/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_escritura_archivos_txt;

import java.io.BufferedWriter;
import java.io.File;
import static java.io.FileDescriptor.out;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Uptow
 */
public class EVA3_10_ESCRITURA_ARCHIVOS_TXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "c:\\archivos\\";
        try {
            writeUsingFiles(ruta, "Prueba de escritura de archivos usando CLASE FILES!!!");
            writeUsingFileWriter(ruta, "Prueba de escritura de archivos usando CLASE FILEWRITER!!!");
            writeUsingBufferedWriter(ruta, "Prueba de escritura de archivos usando CLASE BUFFEREDWRITER!!!");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRITURA_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void writeUsingFiles(String ruta, String datos) throws IOException{
        //si el archivo no existe, lo crea
        //Si el archivo existe, lo sobreescribe
        Path path = Paths.get(ruta + "archivoFiles.txt");
        Files.write(path,datos.getBytes());
    }
    
    public static void writeUsingFileWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta + "archivoFileWriter.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(datos);
        fileWriter.close();
    }
    
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException {
        Path path = Paths.get(ruta + "archivoBufferedWriter.txt");
        OutputStream out = Files.newOutputStream(path);
        OutputStreamWriter osWriter = new OutputStreamWriter(out);
        BufferedWriter bufWriter = new BufferedWriter(osWriter);
        for (int i = 0; i < 10; i++) {//escribimos 10 lineas al archivo
            bufWriter.write((i + 1) + " " + datos);
            bufWriter.write("\n");
        }
        bufWriter.close();
        osWriter.close();
    }
}
