/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_finally;

/**
 *
 * @author Uptow
 */
public class EVA3_6_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5, y = 1;
        try{
            int resu = x / y;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("SIEMPRE SE EJECUTA!!");
        }
        System.out.println("Fin del programa");
    }
    
}
