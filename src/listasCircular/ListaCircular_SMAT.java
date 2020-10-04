/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasCircular;

/**
 *
 * @author sergi
 */
public class ListaCircular_SMAT {
   
    private Nodo lc;
    public ListaCircular_SMAT()
    {
        lc = null;
    }
    
    public ListaCircular_SMAT insertar(String entrada)
    {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        if (lc != null) //liosta circular no vacia
        {
            nuevo.enlace = lc.enlace;
            lc.enlace = nuevo;
        }
        lc = nuevo;
        return this;
    }
    public void recorrer()
    {
        Nodo p;
        if (lc != null)
        {
            p = lc.enlace; //siguiente nodo al de acceso
            do {
                System.out.println("\t" + p.dato);
                p = p.enlace;
            } while (p != lc.enlace);
        }
        else System.out.println("\t Lista circular vacia");
    }
    
    public void eliminar(String entrada)
    {
        Nodo actual;
        actual = lc;
        while ((actual.enlace != lc) && ! (actual.enlace.dato.equals(entrada)))
        {
            if (!actual.enlace.dato.equals(entrada))
                actual = actual.enlace;
        }
        //Enlace de nodo anterior con el siguiente
        //si se ha encontrado el nodo
        if (actual.enlace.dato.equals(entrada))
        {
            Nodo p;
            p = actual.enlace;  //Nodo a eliminar
            if (lc == lc.enlace) // lista con un solo nodo
                lc = null;
            else
            {
                if (p == lc)
                {
                    lc = actual;  //se borra el elemento referenciado por lc
                    // el nuevo acceso a la lista es el anterior
                }
                actual.enlace = p.enlace;
            }
            p = null;
        }
    }
    
    public void eliminarLc ()
    {
        Nodo p;
        if (lc != null)
        {
            p = lc.enlace; //Nodo a eliminar
            if (lc == p)  //Lista con un solo nodo
                lc = null;
            else
            {
                if (p == lc) lc = p;
                lc.enlace = p.enlace;
            }
            p = null;
        } else
            System.out.println("\n Lista vacia");
    }
    
    public void borrarLista()
    {
        Nodo aux;
        if (lc != null)
        {
            aux = lc;
            do {
                aux = aux.enlace;
            } while (aux != lc);
        } else
            System.out.println("\n\t Lista vacia");
        lc = null;
    }
    
    
}



































