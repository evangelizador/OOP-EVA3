/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_throw_excption;

import java.util.InputMismatchException;
import java.util.Scanner;



/**
 *
 * @author Uptow
 */
public class EVA3_7_THROW_EXCPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            // TODO code application logic here
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce un valor positivo (numero entero)");
            int valor = input.nextInt();
            prueba pru = new prueba();
            pru.setValor(valor);
        } catch (Exception ex) { // ES LA SUPECLASE DE TODAS LAS EXCEPCIONES POR LO TANTO, COMPLICA DETECTAR EL TIPO DE EXCEPCION, Y CAPTURA TODAS LAS EXCEPCIONES, Y DAR LA SOLUCION CORRECTA
            System.out.println(ex.getMessage());    
        }
        
    }
    
}

class prueba{
    private int valor;

    public int getValor() {
        return valor;
    }
    // checked Exceptions: se deben resolver en tiempo de compilacion 
    // unchecked Exceptions: errores de logica, del programador. java no te obliga a resolverlas

    public void setValor(int valor) throws Exception  {
        // es de tipo checked Exceptions
        if (valor < 0)
            throw new Exception("El valor " + valor + " es invalido. Debe ser mayor o igual a cero.");
        else
            this.valor = valor;
    }
    
}