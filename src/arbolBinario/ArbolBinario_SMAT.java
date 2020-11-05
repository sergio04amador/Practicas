/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolBinario;

/**
 *
 * @author sergi
 */
public class ArbolBinario_SMAT {
    protected Nodo raiz;
    
    public ArbolBinario_SMAT()
    {
        raiz = null;
    }
    public ArbolBinario_SMAT(Nodo raiz)
    {
        this.raiz = raiz;
    }
    public Nodo raizArbol()
    {
        return raiz;
    }
    //comprueba el estatus del arbol
    public boolean esVacio()
    {
        return raiz == null;
    }
    
    public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha)
    {
        return new Nodo(ramaIzqda, dato, ramaDrcha);
    }
    //recorrido de un arbol binario en preorden
    public void preorden(Nodo r)
    {
        if (r != null)
        {
            r.visitar();
            preorden (r.subarbolIzdo());
            preorden (r.subarbolDcho());
        }
    }
    //recorrido de un arbol binario inorden
    public void inorden(Nodo r)
    {
         if (r != null)
        {
          
            inorden (r.subarbolIzdo());
            r.visitar();
            inorden (r.subarbolDcho());
        }
    }
     public void postorden(Nodo r)
    {
         if (r != null)
        {
            postorden (r.subarbolIzdo());
            postorden (r.subarbolDcho());
            r.visitar();
        }
    }
     public int altura(Nodo raiz)
     {
         if (raiz == null)
             return 0;
         else
         {
             int alturaIz = altura (raiz.subarbolIzdo());
             int alturaDr = altura (raiz.subarbolDcho());
             if (alturaIz > alturaDr)
                 return alturaIz +1;
             else
                 return alturaDr;
         }
     }
     public boolean arbolLleno(Nodo raiz)
     {
         if (raiz == null)
             return true;
         else
             if (altura(raiz.subarbolIzdo())!= altura(raiz.subarbolDcho()))
                 return false;
         return arbolLleno(raiz.subarbolIzdo()) && arbolLleno(raiz.subarbolDcho());
     }
     public int numNodos (Nodo raiz)
     {
         if (raiz == null)
             return 0;
         else
             return 1 + numNodos(raiz.subarbolIzdo()) + numNodos(raiz.subarbolDcho());
     }
}


















