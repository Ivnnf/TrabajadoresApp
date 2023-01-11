
package c.duocpgy2121;

import java.util.ArrayList;

public class Coleccion {
    
    private final ArrayList<Contrato>listaTrabajadores;
    
     public Coleccion() {
        listaTrabajadores = new ArrayList<>();
    }
    
       public boolean agregar(Contrato contrato)
    {
        return listaTrabajadores.add(contrato);
    
    }
     
          public void listar()
    {
        for(Contrato i : listaTrabajadores)
        {
            System.out.println("");
            i.imprimir();
            
        }}
        
        
       
       
        public void listarSueldoExtrno()
        {
        int sumaTotal=0;
        for(Contrato e : listaTrabajadores)
        {
            if(e instanceof Externo)
            {
            sumaTotal=sumaTotal+((Externo) e).horasExterno();
            
            }
            
        }
          System.out.println("Total: " +sumaTotal);         
        
        }
        
        
    } 
       

