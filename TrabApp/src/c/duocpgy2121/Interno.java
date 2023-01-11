
package c.duocpgy2121;

import java.util.Date;


public class Interno extends Contrato{
    
   private int sueldoFijo;

    public Interno() {
        super();
    }

    public Interno(int sueldoFijo, String NombreCompleto, String rut, Date fechaContrado) {
        super(NombreCompleto, rut, fechaContrado);
        this.sueldoFijo = sueldoFijo;
    }

    public int getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(int sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public String toString() {
        return "Interno{" + "sueldoFijo=" + sueldoFijo + '}';
    }

    @Override
    public void imprimir() {
        super.imprimir(); //To change body of generated methods, choose Tools | Templates.
    }
   
    
   
}
