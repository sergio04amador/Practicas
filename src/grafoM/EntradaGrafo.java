/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafoM;

import java.io.*;
import java.util.*;

/**
 *
 * @author sergi
 */
public class EntradaGrafo {
    static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static final int CLAVE = 0xffff;
    
    public void grafoInverso(GrafoMatriz g, GrafoMatriz x, int n) throws Exception
    {
        Vertice [] vr = g.vertices();
        for (int i = 0; i < n; i++)
            x.nuevoVertice(vr[i].nomVertice());
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (g.adyacente(i, j)) x.nuevoArco(j, i);
    }
    static int todosArboles(int [] bosque, int n)
    {
        int i, w;
        w = i = -1;
        do
        {
            if (bosque[++i] == 0)
                w = i;
        } while ((i < n - 1) && (w == -1));
        return w;
    }
    static void entradaGrafo(GrafoMatriz gra, int n) throws Exception
    {
        String v, w;
        System.out.println("Lista de " + n + " vertices");
        for (int i = 1; i <= n; i++)
        {
            v = entrada.readLine();
            gra.nuevoVertice(v);
        }
        System.out.println("Arcos, pares de vertices separados por un espacio " 
        + " (termina con fin)");
        boolean fin = false;
        do {
            StringTokenizer r;
            r = new StringTokenizer(entrada.readLine());
            v = r.nextToken();
            
            if (! v.equalsIgnoreCase("fin"))
            {
                w = r.nextToken();
                gra.nuevoArco(v, w);
                //gra.nuevoArco(w, v); //activar si el grafo es no dirigido
            }
            else fin = true;
        } while (!fin);
    }
    
    public static void main(String [] a) throws Exception
    {
        int n, i, v;
        GrafoMatriz ga;
        GrafoMatriz gaInverso;
        
         System.out.println("Numero de vertices del grafo: ");
         n = Integer.parseInt(entrada.readLine());
         
         ga = new GrafoMatriz(n);
         gaInverso = new GrafoMatriz(n);
         int []m = new int [n];
         int []descendientes = new int[n];
         int []ascendientes = new int[n];
         int []bosque = new int[n];
         
         entradaGrafo(ga, n);
         //grafoInverso(ga, gaInverso, n);
         Vertice [] vs = new Vertice[n];
         vs = ga.vertices();
         for (i = 0; i < n; i++)
             bosque[i] = 0;
         
          System.out.println("\n Dibujar matriz del grafo ");
          ga.dibujarGrafo();
          
          v = 0; //vertice de partida
                  do {
                       System.out.println("\n\n Recorrido partiendo del vertice "+vs[v].nombre);
                        System.out.println("\n Reccorido en profundidad de grafo");
                        m = ga.recorrerProf(ga, vs[v].nomVertice());
                         System.out.println("\n Recorrido en anchura del grafo ");
                         ga.recorrerAnchura(ga, vs[v].nomVertice());
                         //se obtiene conjunto de vertices descendientes
                         for (i =0; i <n; i++)
                         {
                             descendientes[i] = m[i]!= CLAVE ? 1 :0;
                         }
                         //recorre el grafo inverso y obtiene ascendientes
                          System.out.println("\n Recorrido en profundidad de grafo inverso");
                          m = ga.recorrerProf(gaInverso, vs[v].nomVertice());
                           System.out.println("\n Recorrido en anchura del grafo ");
                           ga.recorrerAnchura(gaInverso, vs[v].nomVertice());
                           //se obtiene conjunto de vertices descendientes
                           for (i = 0; i < n; i++)
                           {
                               ascendientes[i] = m[i]!= CLAVE ? 1 : 0;
                           }
                            System.out.println("\nComponente conexa { ");
                            for (i = 0; i < n; i++)
                            {
                                if (descendientes[i] * ascendientes[i] ==1)
                                {
                                     System.out.println(" " + vs[i].nomVertice());
                                     bosque[i] = 1;
                                }
                            }
                             System.out.println(" }");
                             //vertice a partir del cual se obtiene otra componente
                             v = todosArboles(bosque, n);
                  } while (v != -1);
    }
}


















