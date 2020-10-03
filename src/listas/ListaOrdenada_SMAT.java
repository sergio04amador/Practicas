/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author sergi
 */
public class ListaOrdenada_SMAT extends Lista_SMAT{
    public ListaOrdenada_SMAT(){
          super();
    }
    public ListaOrdenada_SMAT insertaOrden(int entrada)
    {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        if (primero == null) //lista vacia
            primero = nuevo;
        else if (entrada < primero.getDato())
        {
            nuevo.setEnlace(primero);
            primero = nuevo;
        }
        else //busqueda del nodo anterior a partir del
             //que se debe insertar
        {
            Nodo anterior, p;
            anterior = p = primero;
            while ((p.getEnlace() != null) && (entrada > p.getDato()))
            {
                anterior = p;
                p = p.getEnlace();
            }
            if (entrada > p.getDato()) //se inserta despues del ultimo nodo
                anterior = p;
                //se procede al enlace del nuevo nodo
                nuevo.setEnlace(anterior.getEnlace());
                anterior.setEnlace(nuevo);
        }
        return this;
    }
}














