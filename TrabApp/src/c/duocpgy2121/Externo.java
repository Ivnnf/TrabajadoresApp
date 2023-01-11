
package c.duocpgy2121;

import java.util.Date;


public class Externo extends Contrato{
    
    private int cantidadDeHoras;

    public Externo() {
        super();
    }

    public Externo(int cantidadDeHoras, String NombreCompleto, String rut, Date fechaContrado) {
        super(NombreCompleto, rut, fechaContrado);
        this.cantidadDeHoras = cantidadDeHoras;
    }

    public int getCantidadDeHoras() {
        return cantidadDeHoras;
    }

    public void setCantidadDeHoras(int cantidadDeHoras) {
        this.cantidadDeHoras = cantidadDeHoras;
    }

    @Override
    public String toString() {
        return "Externo{" + "cantidadDeHoras=" + cantidadDeHoras + '}';
    }

    @Override
    public void imprimir() {
        super.imprimir(); 
    }
    

    public int horasExterno()      
    {
      int pagoHoras=0;
      pagoHoras = VALOR_HORA_EXTERNO*cantidadDeHoras;
      return pagoHoras;
    }
    
}
