/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class insertarColaC {
    public static void main (String[] args) throws Exception{
        int opcion;
        Scanner teclado=new Scanner(System.in);
        ColaCircular_SMAT colaC = new ColaCircular_SMAT();
        System.out.println("Cola Circular");
        System.out.println("1.- Insertar");
        System.out.println("2.- Quitar");
        System.out.println("3.- Frente cola");
        System.out.println("4.- Eliminar cola");
        do
        {
            System.out.println("Elige una opcion");
            opcion = teclado.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Escriba un dato: ");
                    try{
                        colaC.insertar(teclado.next());
                    } catch (Exception e) {
                        System.out.println( e );
                    }
                    break;
                case 2:
                    try{
                        System.out.println("Elemento quitado: " + colaC.quitar());
                    } catch ( Exception e) {
                        System.out.println( e );
                    }
                    break;
                case 3:
                    try{
                        System.out.println("Frente de la cola: : " + colaC.frenteCola());
                    } catch ( Exception e) {
                        System.out.println( e );
                    }
                    break;
                case 4:
                    colaC.borrarCola();
                    break;
            }
        } while(opcion !=5);
        teclado.close();
    }
     }

























