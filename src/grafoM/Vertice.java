/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafoM;

/**
 *
 * @author sergi
 */
public class Vertice {
    String nombre;
    int numVertice;
    public Vertice(String x)
    {
        nombre = x;
        numVertice = -1;
    }
    public String nomVertice() //devuelve identificador del vertice
    {
        return nombre;
    }
    public boolean equals(Vertice n) //true, si dos vertices son iguales
    {
        return nombre.equals(n.nombre);
    }
    public void asigVert(int n) //establece el numero de vertices
    {
        numVertice = n;
    }
    public String toString() //caracteristicas del vertice
    {
        return nombre + " (" + numVertice + ")";
    }
}
























