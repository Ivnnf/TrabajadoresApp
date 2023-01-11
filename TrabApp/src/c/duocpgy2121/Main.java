
package c.duocpgy2121;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    
    public static void main(String[] args) throws ParseException {
        
    Externo ex1 = new Externo(5, "itamayo", "123456", new SimpleDateFormat ("dd-MM-yyy").parse("05-10-2022"));
    Externo ex2 = new Externo(10, "Thiaree", "123456789", new SimpleDateFormat ("dd-MM-yyy").parse("05-10-2021"));
    
    Coleccion col1 = new Coleccion();
    col1.agregar(ex2);
    col1.agregar(ex1);
    col1.listarSueldoExtrno();
    System.out.println(ex1.horasExterno());
    ex1.imprimir();
    System.out.println("--------------------------------------------------------");
       
    Interno in1 = new Interno(800000, "ivan", "123456", new SimpleDateFormat ("dd-MM-yyy").parse("05-10-2021"));
    
    in1.imprimir();
    
    
    }
    
}
