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
public class MetodosAvanzadosOrdenacion {
    //pueden int, long, double
    public static void intercambiar(int []a, int i, int j)
    {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
    public static void ordenacionShell(int a[])
    {
        int intervalo, i, j, k;
        int n = a.length;
        
        intervalo = n / 2;
        while (intervalo > 0)
        {
            for (i = intervalo; i < n; i++)
            {
                j = i - intervalo;
                while (j >= 0)
                {
                    k = j + intervalo;
                    if (a[j] <= a[k])
                        j = -1; //par de elementos ordenado
                    else 
                    {
                        intercambiar(a, j, j+1);
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo / 2;
        }
    }
    public static void quickshort(int a[])
    {
        quickshort(a, 0, a.length-1);
    }
    private static void quickshort(int a[], int primero, int ultimo)
    {
        int i, j, central;
        double pivote;
        
        central = (primero + ultimo)/2;
        pivote = a[central];
        i = primero;
        j = ultimo;
        
        do {
            while (a[i] < pivote) i++;
            while (a[j] > pivote) j--;
            
            if (i <= j)
            {
                intercambiar(a, i, j);
                i++;
                j--;
            } 
           }while (i <= j);
            if ( primero <j)
                quickshort(a, primero, j); //mismo proceso con sublista izqda
            
            if (i < ultimo)
                quickshort(a, i, ultimo); //mismo proceso con sublista drcha
        }
    
}

























