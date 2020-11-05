/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author sergi
 */
public class PilaLista_SMAT {
    private Nodo cima;

    public PilaLista_SMAT() {
        cima = null;
    }
    public boolean pilaVacia()
    {
    return cima == null;
    }
    
    public void insertar (Object elemento)
    {
        Nodo nuevo;
        nuevo = new Nodo(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }
    
    public Object quitar() throws Exception
    {
        if (pilaVacia())
            throw new Exception ("Pila vacia, no se puede extraer");
        Object aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }
    public Object cimaPilar() throws Exception
    {
        if (pilaVacia())
            throw new Exception ("Pila vacia, no se puede leer cima");
        return cima.elemento;
    }
    
    public void limpiarPila()
    {
        Nodo t;
        while(!pilaVacia())
        {
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null;
        }
    }
    
    
}
























