/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasDoble;

/**
 *
 * @author sergi
 */
public class iteradorLista {
    private Nodo actual;
    public iteradorLista(ListaDoble_SMAT Ld)
    {
        actual = Ld.cabeza;
    }
    public Nodo siguiente()
    {
        Nodo a;
        a = actual;
        if (actual != null)
        {
            actual = actual.adelante;
        }
        return a;
    }
}





















































































