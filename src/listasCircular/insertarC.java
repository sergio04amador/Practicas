/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasCircular;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class insertarC {
    public static void main(String [] args){
        ListaCircular_SMAT listaC=new ListaCircular_SMAT();
        int opcion;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Lista Enlazada Circular");
        System.out.println("1.- Insertar");
        System.out.println("2.- Mostrar");
        System.out.println("3.- Eliminar primero");
        System.out.println("4.- Eliminar especifico");
        System.out.println("5.- Eliminar lista");
        do
        {
            System.out.println("Elige una opcion");
            opcion=teclado.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Escriba un dato: ");
                    listaC.insertar(String.valueOf(teclado.next()));
                    break;
                case 2:
                    System.out.println("Elementos de la lista: ");
                    listaC.visualizar();
                    System.out.println("");
                    break;
                case 3:
                    listaC.eliminarLc();
                    break;
                case 4:
                    listaC.eliminar(String.valueOf(teclado.next()));
                    break;
                case 5:
                    listaC.borrarLista();
                    break;
            }
        } while(opcion !=6);
        teclado.close();
    }
}




















