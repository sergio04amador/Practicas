/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mOrdenacion;

/**
 *
 * @author sergi
 */
public class MetodosBasicosOrdenacion {
    //pueden int, long, double
    public static void intercambiar(int []a, int i, int j)
    {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
    public static void ordBurbuja (int a[])
    {
        boolean interruptor = true;
        int i, j;
        int n = a.length;
        //bbucle externo controla la cantidad de pasadas
        for (i =- 0; i < n-1 && interruptor; i++)
        {
            interruptor = false;
            for (j = 0; j < n-i-1; j++)
                if (a[j] > a[j+1])
                {
                    //elementos desordenados, se intercambian
                    interruptor = true;
                    intercambiar(a, j, j+1);
                }
        }
    }
    public static void ordBurbuja2 (int a[])
    {
        int i, j;
        int indiceIntercambio;
        int n = a.length;
        
        i = n-1;
        while (i >0)
        {
            indiceIntercambio = 0;
            //explorar la sublista a[0] a a[i]
            for (j = 0; j < i; j++)
            {
                indiceIntercambio = j;
                intercambiar(a, j, j+1);
            }
            i = indiceIntercambio;
        }
    }
    public static void ordIntercambio (int a[])
    {
        int i, j;
        
        for (i = 0; i < a.length-1; i++)
            for (j = i+1; j < a.length; j++)
                if (a[i] > a[j])
                {
                    intercambiar(a, i, j);
                }
    }
    public static void ordInsercion (int [] a)
    {
        int i, j;
        int aux;
        
        for (i = 1; i < a.length; i++)
        {
            j = i;
            aux = a[i];
            //se localiza el punto de insercion explorando hacia abajo
            while (j > 0 && aux < a[j-1])
            {
                //desplazar elementos hacia arriba para hacer espacio
                a[j] = a[j-1];
                j--;
            }
            a[j] = aux;
        }
    }
    public static void ordSeleccion (int a[])
    {
        int indiceMenor, i, j, n;
        
        n = a.length;
        for (i = 0; i <n-1; i++)
        {
            //comienzo de la exploracion en indice i
            indiceMenor = i;
            // j explora la sublista
            for (j = i+1; j < n; j++)
                if (a[j] < a[indiceMenor])
                    indiceMenor = j;
            //situa el elemento mas peque;o en a[i]
            if (i != indiceMenor)
                intercambiar(a, i, indiceMenor);
        }
    }
    
}













































