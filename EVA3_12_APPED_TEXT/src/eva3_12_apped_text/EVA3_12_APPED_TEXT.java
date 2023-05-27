/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_apped_text;

import java.io.BufferedWriter;
import java.io.File;
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
public class EVA3_12_APPED_TEXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            String ruta = "c:\\aaa\\";
            writeUsingBufferedWriter(ruta, "Prueba de APPEND!!");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_12_APPED_TEXT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta + "archivoBufferedWriter.txt");
        FileWriter  filewriter = new FileWriter(file, true);
        BufferedWriter bufWriter = new BufferedWriter(filewriter);
        for (int i = 0; i < 10; i++) {//escribimos 10 lineas al archivo
            bufWriter.write((i + 1) + " " + datos);
            bufWriter.write("\n");
        }
        bufWriter.close();
        filewriter.close();
    }
}
//:v
