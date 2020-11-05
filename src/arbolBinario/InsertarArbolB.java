/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolBinario;
import pilas.PilaLista_SMAT;
/**
 *
 * @author sergi
 */
public class InsertarArbolB {
    
    public static void main(String[] args) throws Exception{
        ArbolBinario_SMAT arbol;
        Nodo a1, a2, a;
        PilaLista_SMAT pila = new PilaLista_SMAT();
        
        a1 = ArbolBinario_SMAT.nuevoArbol(null, "Maria", null);
        a2 = ArbolBinario_SMAT.nuevoArbol(null, "Rodrigo", null);
        a = ArbolBinario_SMAT.nuevoArbol(a1, "Esperanza", a2);
        pila.insertar(a);
        
        a1 = ArbolBinario_SMAT.nuevoArbol(null, "Carlos", null);
        a2 = ArbolBinario_SMAT.nuevoArbol(null, "Abel", null);
        a = ArbolBinario_SMAT.nuevoArbol(a1, "Jesus", a2);
        pila.insertar(a);
        
        a2 = (Nodo) pila.quitar();
        a1 = (Nodo) pila.quitar();
        a = ArbolBinario_SMAT.nuevoArbol(a1, "Guadalupe", a2);
        arbol = new ArbolBinario_SMAT(a);
        System.out.print("PreOrden -");
        arbol.preorden(arbol.raizArbol());
        System.out.print("\nInOrden -");
        arbol.inorden(arbol.raizArbol());
        System.out.print("\nPostOrden -");
        arbol.postorden(arbol.raizArbol());
        System.out.println("\nNumeros de nodos del arbol binario " + arbol.numNodos(arbol.raizArbol()));
        System.out.println("Altura del arbol binario " + arbol.altura(arbol.raizArbol()));
        System.out.println("Arbol binario completo " + arbol.arbolLleno(arbol.raizArbol()));
    }
}




































