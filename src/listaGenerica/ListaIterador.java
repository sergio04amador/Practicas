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
public class ListaIterador {
    private Nodo prm, actual;
    
    public ListaIterador(Lista list)
    {
        prm = actual = list.leerPrimero();
    }
    
    public Object siguiente()
    {
        Object elemento = null;
        if (actual != null)
        {
            elemento = actual.leerDato();
            actual = actual.siguiente();
        }
        return elemento;
    }
    public Object existe()
    {
        return actual;
    }
    public Object datos()
    {
        Object elemento = null;
        if (actual != null)
            elemento = actual.leerDato();
            return elemento;
    }
    public void inicIter()
    {
        actual = prm;
    }
    
}






































