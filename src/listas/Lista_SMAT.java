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
public class Lista_SMAT {
    Nodo primero;
    int numeros = 0;
            public Lista_SMAT()
            {
             primero = null;   
            }
             //Inserta un nodo al principio de la lista
            public Lista_SMAT insertarPrimero(int entrada)
            {
                Nodo nuevo;
                nuevo = new Nodo(entrada);
                nuevo.setEnlace(primero);
                primero = nuevo;
                return this;
            }
            //Recorre la lista y muestra cada dato
            public void visualizar()
            {
            if(primero==null){
                System.out.println("Lista vacia");
            }else{
              Nodo n;
              int k =0;
              n = primero;
              while (n != null)
              {
                  System.out.print(n.getDato() + "   ");
                  n = n.getEnlace();
                  k++;
                  System.out.print( (k%15 != 0 ? " " : "\n"));
              }
             }    
            }
            //inserta un elemento al final de la lista
            public Lista_SMAT insertarUltimo(int entrada)
            {
                Nodo nuevo, ultimo;
                nuevo = new Nodo(entrada);
                if(primero==null){
                    primero=nuevo;
                }else{
                    ultimo =  primero;
                    while (ultimo.getEnlace() != null)
                    {
                        ultimo = ultimo.getEnlace();
                    }
                    ultimo.setEnlace(nuevo);//enlaza el ultimo nodo al nuevo nodo
                    }
                return this;
            }
            //Inserta un elemento a partir del anterior
            public Lista_SMAT insertarEntreLista(int testigo, int entrada)
            {
                Nodo nuevo, anterior;
                anterior = buscarLista(testigo); //llamada del metodo y envia testigo
                if (anterior != null)
                {
                    nuevo = new Nodo(entrada);
                    nuevo.setEnlace(anterior.getEnlace()); //nuevo nodo apunta al cual apuntaba el nodo anterior
                    anterior.setEnlace(nuevo);//nodo anterior apunta al nuevo nodo
                }
                return this;
            }
            //Busca el elemento destino
            public Nodo buscarLista(int destino)
            {
                Nodo indice;
                for (indice = primero; indice != null; indice = indice.getEnlace())
                    if (destino == indice.getDato())//indice.dato.equals(destino
                        return indice;
                return null;
            }
            //Eliminar el primer elemento
            public void eliminarPrimero()
            {
                Nodo aux;
                if(primero !=null){
                    aux=primero;
                    primero=primero.getEnlace();//primero=primero.enlace;
                    aux.enlace=null;
                }else System.out.println("Lista vacia");
            }
            //Eliminar ultimo elemento
            public void eliminarUltimo()
            {
                Nodo aux;
                if(primero!=null){
                    if(primero.getEnlace()==null){
                        primero=null;
                    }else{
                        aux=primero;
                        while(aux.getEnlace().getEnlace()!=null){
                            aux=aux.getEnlace();
                        }
                        aux.setEnlace(null);
                    }
                } else System.out.println("Lista vacia");
            }
            //Eliminar elemento indroducido
            public void eliminar (int entrada)
            {
                Nodo actual, anterior;
                boolean encontrado;
                //Inicializa los apuntadores
                actual = primero;
                anterior = null;
                encontrado = false;
                //busqueda del nodo y del anterior
                while ((actual != null) && (!encontrado))
                {
                    encontrado = (actual.getDato() == entrada);
                    //actual.dato.equals(entrada)
                    if(!encontrado)
                    {
                        anterior = actual;
                        actual = actual.getEnlace();
                    }
                }
                //Enlace del nodo anterior con el siguiente
                if (actual != null)
                {
                    //Distingue entre que el nodo sea el cabecera
                    //o del resto de la lista
                    if (actual == primero)
                    {
                        primero = actual.enlace;
                    }
                    else
                    {
                        anterior.enlace = actual.enlace;
                    }
                    actual = null; //no es necesario al ser una variable local
                }
            
            }
           public void contador(){
               for(int x=0; x<=primero.getDato(); x++)
               {
                   numeros++;
               }
               System.out.println("El numero de elementos es: " +numeros);
            }
            }
   
                 
















































