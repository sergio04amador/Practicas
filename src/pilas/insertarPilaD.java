/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class insertarPilaD {
     public static void main (String[] args) throws Exception{
        int opcion;
        Scanner teclado=new Scanner(System.in);
        PilaLista_SMAT pila = new PilaLista_SMAT();
        System.out.println("Pila Dinamica");
        System.out.println("1.- Insertar");
        System.out.println("2.- Quitar");
        System.out.println("3.- Cima");
        System.out.println("4.- Eliminar pila");
        do
        {
            System.out.println("Elige una opcion");
            opcion = teclado.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Escriba un dato: ");
                    pila.insertar(teclado.next());
                    break;
                case 2:
                    try {
                        System.out.println("Elemento quitado: " + pila.quitar());
                    } catch (Exception e) {
                        System.out.println( e );
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Cima de la pila: " + pila.cimaPilar());
                    } catch (Exception e) {
                        System.out.println( e );
                    }
                    break;
                case 4:
                    pila.limpiarPila();
                    break;
            }
        } while(opcion!=5);
                teclado.close();
     }
}


































































































