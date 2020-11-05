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
public class ColaLista_SMAT {
    protected Nodo frente;
    protected Nodo fin;
    
    public ColaLista_SMAT()
    {
        frente = fin = null;
    }
    
    public boolean colaVacia()
    {
        return (frente == null);
    }
    
    public void insertar(Object elemento)
    {
        Nodo a;
        a = new Nodo(elemento);
        if (colaVacia()) {
            frente = a;
        } else {
            fin.siguiente = a;
        }
        fin = a;
    }
    
    public Object quitar() throws Exception {
        Object aux;
        if (!colaVacia()) {
            aux = frente.elemento;
            frente = frente.siguiente;
        } else 
            throw new Exception("Eliminar de una cola vacia");
        return aux;
    }
    
     public Object frenteCola() throws Exception {
         if (colaVacia()){
             throw new Exception("Error: cola vacia");
         } 
         return (frente.elemento);
     }
     
     public void borrarCola() {
         while (frente != null) {
             frente = frente.siguiente;
         } 
         System.gc();
     }
}






















