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
public class Lista {
    private Nodo primero;
    
    public Lista()
    {
        primero = null;
    }
    public Nodo leerPrimero()
    {
        return primero;
    }
    public Lista insertarCabezaLista(Object entrada)
    {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }
    public int numElems()
    {
        int n;
        Nodo a = primero;
        if (primero != null)
        n = 0;
        else
        {
            n = 1;
            while (a != null)
            {
                n++;
                a = a.siguiente();
            }
        }
        return n;
    } 
    public void eliminar (Object entrada)
    {
        Nodo actual, anterior;
        
        actual = primero;
        anterior = null;
        //bucle de busqueda
        while ((actual != null) && !actual.dato.equals(entrada))
        {
            if (!actual.dato.equals(entrada))
            {
                anterior = actual;
                actual = actual.enlace;
            }
        }
        if (actual != null)
        {
            //se distingue entre que el nodo sea el cabecera
            //o del resto de la lista
            if (actual == primero)
            {
                primero = actual.enlace;
            }
            else
            {
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }
    }
    public Nodo buscarLista(Object destino)
    {
        //destino: dato que se busca en la lista
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace)
            if (indice.dato.equals(destino))
                return indice;
        return null;
    }
    
}


















