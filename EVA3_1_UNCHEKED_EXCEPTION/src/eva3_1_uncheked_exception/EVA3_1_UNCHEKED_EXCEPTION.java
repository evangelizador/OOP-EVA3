/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_uncheked_exception;
import java.util.Scanner;
/**
 *
 * @author Uptow
 */
public class EVA3_1_UNCHEKED_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        System.out.println("INICIANDO EL PROGRAMA");
        System.out.println("DECLARANDO VARIABLES");
        int x=5, y=0;
        System.out.println("intentando la division");
        int resu=x/y;
        
        System.out.println("resultado"+resu);
    
    //inputmismatch exception
                
    Scanner input=new Scanner(System.in);
    System.out.println("introduce el numero");
    int nume= input.nextInt();
    
    //si el usuario captura una cadea que no puede convertirse a numero se produce la excepcion del programa
    System.out.println("El numero es:"+nume);
    //ARRAYINDECOUTOFBOUNDS
    int[] arreglo= new int[5];

    arreglo[0]=100;
    arreglo[1]=200;
    arreglo[2]=300;
    arreglo[3]=400;
    arreglo[4]=500;
    arreglo[5]=600;//---? 5 no es un indice valido,el arrelgo va de 0 a 4
    
    //NULLPOINTER EXCEPTION
    prueba objpru = null; // el objeto no existe, es nulo

    System.out.println("valor de x = " + objpru.x); // no puedo leer la x, porque el objeto no existe
    }
}


class prueba {
    int x = 100;
}