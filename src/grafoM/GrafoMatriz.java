/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafoM;

import colas.ColaLista_SMAT;
import pilas.PilaLista_SMAT;

/**
 *
 * @author sergi
 */
public class GrafoMatriz {
    int numVerts;
    static final int maxVerts = 20;
    Vertice [] verts;
    int [][] matAd;
    static final int CLAVE = 0xffff;
    
    public GrafoMatriz()
    {
        this(maxVerts);
    }
    public GrafoMatriz (int mx)
    {
        matAd = new int [mx][mx];
        verts = new Vertice[mx];
        for (int i = 0; i< mx; i++)
        for (int j = 0; i< mx; i++)
            matAd[i][j] = 0;
        numVerts = 0;
    }
    public int numeroDeVertices()
    {
        return numVerts;
    }
    public Vertice[] vertices()
    {
        return verts;
    }
    
    public void nuevoVertice (String nom)
    {
        boolean esta = numVertice(nom) >= 0;
        if (!esta)
        {
            Vertice v = new Vertice(nom);
            v.asigVert(numVerts);
            verts[numVerts++] = v;
        }
    }
    int numVertice (String vs)
    {
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for (; (i < numVerts) && !encontrado;)
        {
            encontrado = verts[i].equals(v);
            if (!encontrado) i++;
        }
        return (i <numVerts) ? i : -1;
    }
    public void nuevoArco (String a, String b) throws Exception
    {
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va <0 || vb <0) throw new Exception ("Vertice no existe");
        matAd[va][vb] =1;
    }
    //otra version del metodo recibe directamente
    //los numeros de vertice del arco
    public void nuevoArco (int va, int vb) throws Exception
    {
        if (va < 0 || vb < 0) throw new Exception ("Vertice no existe");
        matAd[va][vb] = 1;
    }
    boolean adyacente(String a, String b) throws Exception
    {
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception ("Vertice no existe");
        return matAd[va][vb] == 1;
    }
    //otra version del metodo
    //recibe directamente los numeros de vertices a comprobar
     boolean adyacente(int va, int vb) throws Exception
    {
        
        if (va < 0 || vb < 0) throw new Exception ("Vertice no existe");
        return matAd[va][vb] == 1;
    }
     public int[]recorrerAnchura(GrafoMatriz g, String org) throws Exception
     {
         int w, v;
         int [] m;
         v = g.numVertice(org);
         if (v <0) throw new Exception("Vertice origen no existe");
         ColaLista_SMAT cola = new ColaLista_SMAT();
         m = new int[g.numeroDeVertices()];
         //inicializa los vertices como no marcados
         for (int i = 0; i <g.numeroDeVertices(); i++)
             m[i] = CLAVE;
         m[v] =0; //vertice origen queda marcado
         cola.insertar(Integer.valueOf(v));
         while (! cola.colaVacia())
         {
             Integer cw;
             cw = (Integer) cola.quitar();
             w = cw.intValue();
             System.out.println("Vertice "+ g.verts[w] + "visitado");
             //insertar en la cola los adyacentes de w no marcados
             for (int u = 0; u <g.numeroDeVertices(); u++)
                 if ((g.matAd[w][u] == 1) && (m[u] == CLAVE))
             {
                 //se marca vertice u con numero de arcos hasta el
                 m[u] = m[w] +1;
                 cola.insertar(Integer.valueOf(u));
             }
         }
         return m;
     }
      public int[]recorrerProf(GrafoMatriz g, String org) throws Exception
     {
         int w, v;
         PilaLista_SMAT pila = new PilaLista_SMAT();
         int [] m;
         m = new int[g.numeroDeVertices()];
         //inicializa los vertices como no marcados
         v = g.numVertice(org);
         if (v <0) throw new Exception("Vertice origen no existe");
         for (int i = 0; i <g.numeroDeVertices(); i++)
             m[i] = CLAVE;
         m[v] =0; //vertice origen queda marcado
         
         pila.insertar(Integer.valueOf(v));
         while (! pila.pilaVacia())
         {
             Integer cw;
             cw = (Integer) pila.quitar();
             w = cw.intValue();
             System.out.println("Vertice "+ g.verts[w] + "visitado");
             //insertar en la pila los adyacentes de w no marcados
             for (int u = 0; u <g.numeroDeVertices(); u++)
                 if ((g.matAd[w][u] == 1) && (m[u] == CLAVE))
             {
                 pila.insertar(Integer.valueOf(u));
                 m[u] = 1;
             }
         }
         return m;
     }
    
     public void dibujarGrafo()
     {
         System.out.println(" ");
         for(int i = 0; i < numVerts; i++)
         {
             System.out.printf(" =", i);
         }
         System.out.println();
         for(int i = 0; i < numVerts; i++)
         {
             System.out.printf(" =", i);
             for(int j = 0; j < numVerts; j++)
             {
                  System.out.printf(" =", matAd[i][j]);
             }
             System.out.println();
         }
     }
     
}

























