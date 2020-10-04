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
public class ListaDoble_SMAT {
    Nodo cabeza, fin;
    public ListaDoble_SMAT(){
        cabeza = fin = null;
    }
    //Insertar al principio de la lista doble 
    public ListaDoble_SMAT insertarCabezaLista(int entrada){
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.adelante = cabeza;
        if (cabeza != null)
            cabeza.atras = nuevo; //cabeza apunte al nuevo nodo
        else
            fin = nuevo; //en caso de ser el primer elemento ingresado
        cabeza = nuevo;
        return this;
    }
    //Visualizar del principio al fin
    public void visualizarCabeza()
    {
        Nodo aux;
        aux = cabeza;
        while (aux != null)
        {
            System.out.println(aux.dato + "  ");
            aux = aux.adelante;
        }
        System.out.println("");
    }
        //Visualizar del fin al principio
    public void visualizarFin()
    {
        Nodo aux;
        aux = fin;
        while (aux != null)
        {
            System.out.println(aux.dato + "  ");
            aux = aux.atras;
        }
        System.out.println("");
    }
    public ListaDoble_SMAT insertarFinLista(int entrada)
    {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.atras = fin;
        if (fin != null)
            fin.adelante = nuevo;
        else
            cabeza=nuevo;
        fin = nuevo;
        return this;
    }
    //eliminar nodo del principio
    public void eliminarCabeza()
    {
        Nodo actual;
        actual=cabeza;
        if (actual != null)
        {
        if (cabeza==fin)
            fin=cabeza=null;
        cabeza = actual.adelante;
        if (actual.adelante != null)
            actual.adelante.atras = null;
        actual = null;
        } else System.out.println("Lista vacia");
    }
     //eliminar nodo del final
    public void eliminarFinal()
    {
        Nodo actual;
        actual=fin;
        if (actual != null)
        {
        if (cabeza==fin)
            cabeza=fin=null;
        if (actual.atras != null)
            fin=actual.atras;
        actual.atras.adelante = null;
        actual = null;
        } else System.out.println("Lista vacia");
    }
    //Insertar despues de elemento
    public ListaDoble_SMAT insertarDespues(int testigo, int entrada)
    {
        Nodo nuevo, anterior;
        nuevo = new Nodo(entrada);
        anterior=buscarLista(testigo);
        nuevo.adelante = anterior.adelante;
        if (anterior.adelante != null)
            anterior.adelante.atras = nuevo;
        else
            fin=nuevo;
        anterior.adelante = nuevo;
        nuevo.atras = anterior;
        return this;   
    }
    //bucar elemento para despues
    public Nodo buscarLista(int destino)
    {
        Nodo indice;
        for(indice = cabeza; indice!= null; indice = indice.adelante)
            if (destino == indice.dato)
                return indice;
        return null;
    }
    //insertar antes de elemento
    public ListaDoble_SMAT insertarAntes(int testigo, int entrada)
    {
        Nodo nuevo, siguiente;
        nuevo = new Nodo(entrada);
        siguiente=buscarLista(testigo);
        nuevo.atras = siguiente.atras;
        if (siguiente.atras != null)
            siguiente.atras.adelante = nuevo;
        else
           cabeza=nuevo;
        siguiente.atras = nuevo;
        nuevo.adelante = siguiente;
        return this;
    }
    //eliminar elemento especifico
    public void eliminar (int entrada)
    {
        Nodo actual;
        boolean encontrado = false;
        actual = cabeza;
        //bucle de busqueda
        while ((actual != null) && (!encontrado))
        {
            encontrado = (actual.dato == entrada);
            if (!encontrado)
                actual = actual.adelante;
        }
        //enlace de nodo anterior con el siguiente
        if (actual != null)
        {
            //distingue entre nodo cabeza o resto de la lista
            if (actual == cabeza)
            {
                cabeza = actual.adelante;
                if (actual.adelante != null)
                    actual.adelante.atras = null;
            }
            else if (actual.adelante != null) //No es el ultimo nodo
            {
                actual.atras.adelante = actual.adelante;
                actual.adelante.atras = actual.atras;
            }
            else //ultimo nodo
            {
                fin=actual.atras; //esto permite ver si funciona
                actual.atras.adelante = null;
            }
            actual = null;
        }
    }
    
    }































