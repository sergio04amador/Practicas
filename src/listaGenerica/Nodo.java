/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaGenerica;

/**
 *
 * @author sergi
 */
public class Nodo {
    Object dato;
    Nodo enlace;
    
    public Nodo(Object x)
    {
        dato = x;
        enlace = null;
    }
    public Nodo(Object x, Nodo n)
    {
        dato = x;
        enlace = n;
    }
    public Object leerDato()
    {
        return dato;
    }
    public Nodo siguiente()
    {
        return enlace;
    }
}



































