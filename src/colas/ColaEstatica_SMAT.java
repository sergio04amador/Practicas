/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author sergi
 */
public class ColaEstatica_SMAT {
    private static final int Size = 3;
    protected int frente;
    protected int fin;
    protected Object [] Cola;
    
    public ColaEstatica_SMAT()
    {
        frente = 0;
        fin = -1;
        Cola = new Object[Size];
    }
    
    public boolean colaVacia(){
        return frente > fin;
    }
    
     public boolean colaLlena(){
        return fin == Size - 1;
    }
     
     public void insertar(final Object elemento) throws
             Exception {
         if (!colaLlena()) {
             Cola[++fin] = elemento;
         } else 
             throw new Exception("Overflow en la cola");
     }
     
     public Object quitar() throws Exception {
         if (!colaVacia()) {
             return Cola[frente++];
         } else 
             throw new Exception("Cola vacia ");
     }
     
      public Object frenteCola() throws Exception {
         if (!colaVacia()) {
             return Cola[frente];
         } else 
             throw new Exception("Cola vacia ");
     }
      
      public void borrarCola()
      {
          frente = 0;
          fin = -1;
      }
}































