/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mOrdenacion;

import java.util.Arrays;

/**
 *
 * @author sergi
 */
public class IntroduccionAvanzados {
    public static void main(String[] args)
    {
        int [] lista1={592,104,183,697,155,694,135,417,600,641,436,870,95,
            881,573,919,880,3,224,415,49,71,2,985,114,630,821,358,936,
            214,945,259,351,315,118,124,846,507,181,283,198,1000,943,933,
            684,12,165,156,910,803};
        
        int [] lista2={951,159,386,420,768,533,767,677,789,563,196,216,815,
        538,729,376,5,858,897,466,626,97,907,310,145,345,57,427,162,
        740,249,185,674,68,91,291,641,183,322,389,916,687,557,125,20,
        180,331,209,53,289};
        
        System.out.println("\tMetodo de ordenacion shell");
        System.out.println("Lista desordenada");
        System.out.println(Arrays.toString(lista1));
        MetodosAvanzadosOrdenacion.ordenacionShell(lista1);
        System.out.println("Lista ordenada");
        System.out.println(Arrays.toString(lista1));
        
        System.out.println("\n\tMetodo de ordenacion Quickshort");
        System.out.println("Lista desordenada");
        System.out.println(Arrays.toString(lista2));
        MetodosAvanzadosOrdenacion.quickshort(lista2);
        System.out.println("Lista ordenada");
        System.out.println(Arrays.toString(lista2));
    }
}
























