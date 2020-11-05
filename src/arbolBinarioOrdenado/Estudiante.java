/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolBinarioOrdenado;

/**
 *
 * @author sergi
 */
public class Estudiante implements Comparador{
    int numMat;
    String nombre;
    public Estudiante (String n, int mat)
    {
        nombre = n;
        numMat = mat;
    }
    public Estudiante()
    {
        this(null, 0);
    }
    public String toString()
    {
        if (nombre!= null)
            return nombre + " "+ numMat;
            else
            return "No asignado";
    }
    public boolean menorQue(Object op2)
    {
        Estudiante p2 = (Estudiante) op2;
        return numMat < p2.numMat;
    }
    public boolean menorIgualQue(Object op2)
    {
        Estudiante p2 = (Estudiante) op2;
        return numMat <= p2.numMat;
    }
    public boolean mayorQue(Object op2)
    {
        Estudiante p2 = (Estudiante) op2;
        return numMat > p2.numMat;
    }
    public boolean mayorIgualQue(Object op2)
    {
        Estudiante p2 = (Estudiante) op2;
        return numMat >= p2.numMat;
    }
    public boolean igualQue(Object op2)
    {
        Estudiante p2 = (Estudiante) op2;
        return numMat == p2.numMat;
    }
}



























