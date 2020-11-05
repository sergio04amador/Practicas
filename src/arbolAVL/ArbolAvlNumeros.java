/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolAVL;
import java.io.*;
/**
 *
 * @author sergi
 */

public class ArbolAvlNumeros {
    static final int TOPEMAX = 999;
    public static void main(String [] a) throws Exception
    {
        ArbolAVL_SMAT avl = new ArbolAVL_SMAT();
        Numero elemento;
        int nm;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            //se crea el arbol avl
            System.out.println("Numeros aleatorios a insertar");
            nm = Integer.parseInt(entrada.readLine());
            while (avl.altura(avl.raizArbol()) < nm) 
            {
                elemento = new Numero ((int)(Math.random()*TOPEMAX*nm) + 1);
                avl.insertar(elemento);
            }
            //operaciones con el arbol
            do {
                System.out.println("\n\n   1.- Mostrar el arbol\n");
                System.out.println("       2.- Eliminar elemento\n");
                System.out.println("       3.- Altura del arbol\n");
                System.out.println("       4.- Cantidad de nodos\n");
                System.out.println("       5.- Raiz del arbol\n");
                System.out.println("       6.- Salir\n           ");
                do 
                    nm = Integer.parseInt(entrada.readLine());
                while (nm < 1 || nm > 5);
                if (nm == 1 )
                {
                    System.out.println("\n\tNumeros \n");
                    avl.inorden(avl.raizArbol());
                }
                else if (nm == 2)
                {
                    int nmt;
                    System.out.println("Numeros: ");
                    nmt = Integer.parseInt(entrada.readLine());
                    try {
                        avl.eliminar(new Numero(nmt));
                    }
                        catch (Exception e)
                                {
                                System.out.println(e);
                                }
                    }
                    else if (nm == 3)
                            {
                            System.out.println("La altura del arbol es: "+avl.altura(avl.raizArbol()));
                            }
                    else if (nm == 4)
                            {
                            System.out.println("\n\n Numero de nodos: "+ avl.numNodos(avl.raizArbol()));
                            }
                } while (nm != 6);
            }
            catch (Exception er)
                    {
                    System.out.println("Error en el proceso del arbol: "+ er);
                    }
        }
    }


























