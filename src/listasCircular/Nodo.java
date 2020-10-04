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
public class Nodo {
    String dato;
    Nodo enlace;
    
    public Nodo (String entrada)
    {
        dato = entrada;
        enlace = this; //se apunta asimismo
    }
}

































