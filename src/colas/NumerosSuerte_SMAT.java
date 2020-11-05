/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;
import java.io.*;
import java.util.Random;
/**
 *
 * @author sergi
 */
public class NumerosSuerte_SMAT {
    
    public static void mostrarCola (ColaLista_SMAT q) throws Exception
    {
        while (!q.colaVacia())
        {
            Integer v;
            v = (Integer) q.quitar();
            System.out.println(" " + v.intValue());
        }
    }
    
    public static void main(String [] a)
    {
        int n, n1, n2, i;
        Integer nv;
        ColaLista_SMAT q = new ColaLista_SMAT();
        Random r = new Random();
        try {
            //numero inicial de elementos de la lista
            n = 11 + r.nextInt(49);
            //se genera n numeros aleatorios
            for (i = 1; i<=n; i++){
                nv = Integer.valueOf(1+r.nextInt(101));
                q.insertar(nv);
            }
            //se genera aleatoriamente el inventyario n1
            n1 = 1 + r.nextInt(11);
            //se retiran de la cola elementos a distancia n1
            System.out.println("\n Se quita de la lista: ");
            while (n1 <= n) {
                Object nt;
                n2 = 0; //contador de elementos que quedan
                for (i = 1; 1 <= n; i++){
                    nt = q.quitar();
                    if (i % n1 == 1){
                        System.out.println(nt + " ");
                    } else {
                        q.insertar(nt); //se vuelve a meter en la cola
                        n2++;
                    }
                }
                n = n2;
                n1 = 1 + r.nextInt(11);
            }
            System.out.println("\n Los numeros de la suerte: ");
            mostrarCola(q);
            System.out.println();
        } catch (Exception e ){
            System.out.println("Ha ocurrido la excepcion: " + e);
        }
    }
}























