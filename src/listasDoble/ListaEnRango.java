/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasDoble;

import java.util.Random;
import java.io.*;
/**
 *
 * @author sergi
 */
public class ListaEnRango {
    public static void main(String [] ar) throws IOException
    {
        Random r;
        int d, x1, x2;
        final int M = 29; //numero de elementos de la lista
        final int MX = 999;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        ListaDoble_SMAT listaDb;
        r = new Random();
        listaDb = new ListaDoble_SMAT();
        for (int j = 1; j <= M; j++)
        {
            d = r.nextInt(MX) + 1;
            listaDb.insertarCabezaLista(d);
        }
        System.out.println("Elementos de la lista original");
        listaDb.visualizarCabeza();
        //rango de valores
        System.out.println("\nRango que va a contener la lista");
        x1 = Integer.parseInt(entrada.readLine());
        x2 = Integer.parseInt(entrada.readLine());
        //crea iterador asociado a la lista
        iteradorLista iterador=new iteradorLista(listaDb);
        Nodo a;
        //recorre la lista con el iterador
        a = iterador.siguiente();
        while (a != null)
        {
            int w;
            w = a.dato;
            if (!(w >= x1 && w <= x2)) //fuera de rango
                listaDb.eliminar(w);
            a = iterador.siguiente();
        }
        System.out.println("Elementos actuales de la lista");
        listaDb.visualizarCabeza();
    }
}





































































































