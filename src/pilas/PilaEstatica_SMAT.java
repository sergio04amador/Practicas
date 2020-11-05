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
public class PilaEstatica_SMAT {
    private static final int Size = 15;
    private int cima;
    private final Object[] Pila;
    
    public PilaEstatica_SMAT(){
        cima = -1;
        Pila = new Object[Size];
    }
    public boolean pilaVacia(){
        return cima == -1;
    }
    
    public boolean pilaLlena(){
        return cima == Size -1;
    }
    
    public void limpiarPila(){
        cima = -1;
    }
    
    public void insertar(final Object elemento) throws Exception
    {
        if (pilaLlena()){
            throw new Exception("Desbordamiento pila");
        }
        cima ++;
        Pila[cima] = elemento;
    }
    
    public Object quitar() throws Exception {
        Object aux;
        if (pilaVacia()){
            throw new Exception("Pila vacia, no se puede extraer.");
        }
        aux = Pila[cima];
        cima--;
        return aux;
    }
    
    public Object cimaPila() throws Exception {
        if (pilaVacia()){
            throw new Exception("Pila vacia, no se puede extraer");
        }
        return Pila[cima];
    }
}




























