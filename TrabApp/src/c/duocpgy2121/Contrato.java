
package c.duocpgy2121;

import java.util.Date;


public abstract class Contrato implements Icontrato {
    
    protected String NombreCompleto,rut;
    protected Date fechaContrado;

    public Contrato() {
    }

    public Contrato(String NombreCompleto, String rut, Date fechaContrado) {
        this.NombreCompleto = NombreCompleto;
        this.rut = rut;
        this.fechaContrado = fechaContrado;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Date getFechaContrado() {
        return fechaContrado;
    }

    public void setFechaContrado(Date fechaContrado) {
        this.fechaContrado = fechaContrado;
    }

    @Override
    public String toString() {
        return "Contrato{" + "NombreCompleto=" + NombreCompleto + ", rut=" + rut + ", fechaContrado=" + fechaContrado + '}';
    }

    public void imprimir()
    {
        System.out.println("Nombre :"+this.NombreCompleto);
        System.out.println("Rut "+this.rut);
        System.out.println("Fecha :"+this.fechaContrado);
    }
    
    
}
