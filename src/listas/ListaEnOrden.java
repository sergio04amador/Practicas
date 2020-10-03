/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;
import java.util.*;
/**
 *
 * @author sergi
 */
public class ListaEnOrden {
    public static void main(String[] args){
        Random r;
        int d;
        ListaOrdenada_SMAT lista;
        int k;
        r = new Random(); //generador de numeros aleatorios
        lista = new ListaOrdenada_SMAT(); //crea lista vacia
        k = r.nextInt(99)+1; //numero de elementos
        //inserta elementos en la lista
        for (; k>= 0; k--)
        {
            d = r.nextInt();
            lista.insertaOrden(d);
        }
        //escribe los elementos de la lista
        System.out.println("Elementos de la lista ordenada \n");
        lista.visualizar();
    }
}




















