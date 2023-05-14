/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_custom_exceptions;

/**
 *
 * @author Uptow
 */
public class EVA3_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setNombre("chi");
        perso.setApellido("flo");
        try{
         perso.setEdad(-10);   
        }catch(DatoIncrrectoCheckedEx e){
            System.out.println(e.getMessage());
            
        }
        
    }
    
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }
    
    

    public Persona(String nombre, String apellido, int edad) throws DatoIncrrectoCheckedEx {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoIncrrectoCheckedEx {
        if (edad < 0 )
            //throw new DatoincorrectoExceptions();
            throw new DatoIncrrectoCheckedEx();
        
        this.edad = edad;
    }
    
}
class DatoincorrectoExceptions extends RuntimeException{

    public DatoincorrectoExceptions() {
        super("Datos incorrecto!! El valor introducido no puede ser negativo. ");
    }
    
}

class  DatoIncrrectoCheckedEx extends Exception{

    public DatoIncrrectoCheckedEx() {
        super("Datos incorrecto!! El valor introducido no puede ser negativo. ");
    }
    
    
}