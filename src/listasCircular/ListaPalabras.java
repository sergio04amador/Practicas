/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasCircular;
import java.io.*;
/**
 *
 * @author sergi
 */
public class ListaPalabras {
    public static void main(String [] a) throws IOException
    {
        String palabra;
        ListaCircular_SMAT listaCp;
        int opc;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        listaCp = new ListaCircular_SMAT();
        System.out.println("\n Entrada de Nombres. Termina con ^Z.\n");
        while ((palabra = entrada.readLine())!= null)
        {
            String nueva;
            nueva = new String(palabra);
            listaCp.insertar(nueva);
        }
        System.out.println("\t\t Lista circular de palabras");
        listaCp.visualizar();
        System.out.println("\n\t Opciones para manejar la lista");
        do
        {
            System.out.println("1.- Eliminar una palabra. \n");
            System.out.println("2.= Mostrar la lista completa. \n");
            System.out.println("3.- Salir y eliminar la lista. \n");
            do{
                opc = Integer.parseInt(entrada.readLine());
            } while (opc<1 || opc>3);
            
            switch (opc){
                case 1:
                    System.out.println("Palabra a eliminar: ");
                    palabra = entrada.readLine();
                    listaCp.eliminar(palabra);
                    break;
                case 2:
                    System.out.println("Palabra en la lista: \n");
                    listaCp.visualizar();
                    break;
                case 3:
                    System.out.println("Eliminacion de la lista: ");
                    listaCp.borrarLista();
            }
        } while (opc != 3);
    }
    
}




















