/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasDoble;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class insertarLD {
    public static void main(String [] args){
        ListaDoble_SMAT listaD=new ListaDoble_SMAT();
        int opcion;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Lista Doblemente Enlazada");
        System.out.println("1.- Insertar Principio");
        System.out.println("2.- Insertar Final");
        System.out.println("3.- Mostrar Principio");
        System.out.println("4.- Mostrar Finaal");
        System.out.println("5.- Insertar antes de");
        System.out.println("6.- Insertar despues de");
        System.out.println("7.- Eliminar Principio");
        System.out.println("8.- Eliminar Final");
        System.out.println("9.- Eliminar Especifico");
        do
        {
            System.out.println("Elige una opcion");
            opcion=teclado.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Escriba un dato: ");
                    listaD.insertarCabezaLista(Integer.parseInt(teclado.next()));
                     break;
                case 2:
                    System.out.println("Escriba un dato: ");
                    listaD.insertarFinLista(Integer.parseInt(teclado.next()));
                    break;
                case 3:
                    System.out.println("Escriba un dato: ");
                    listaD.visualizarCabeza();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Escriba un dato: ");
                    listaD.visualizarFin();
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Escriba un dato a buscar y dato a insertar: ");
                    listaD.insertarAntes(Integer.parseInt(teclado.next()),
                                          Integer.parseInt(teclado.next()));
                    break;
                case 6:
                     System.out.println("Escriba un dato a buscar y dato a insertar: ");
                    listaD.insertarAntes(Integer.parseInt(teclado.next()),
                                          Integer.parseInt(teclado.next()));
                    break;
                case 7:
                    listaD.eliminarCabeza();
                    break;
                case 8:
                    listaD.eliminarFinal();
                    break;
                case 9:
                    listaD.eliminar(Integer.parseInt(teclado.next()));
                   break;
            }
        } while (opcion != 11);
        teclado.close();
    }
}
























