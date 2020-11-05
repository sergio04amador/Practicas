/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolBinarioOrdenado;
import java.*;
import arbolBinario.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author sergi
 */
public class ArbolEstudiante {
    public static void main(String[] a)
    {
        ArbolBinarioBusqueda_SMAT ab = new ArbolBinarioBusqueda_SMAT();
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        Estudiante el;
        int nm;
        String nom;
        
        try{
            //se crea el arbol de busqueda
            do{
                System.out.println("Numero de matricula(0 -> Fin): ");
                nm = Integer.parseInt(entrada.readLine());
                if (nm > 0)
                {
                    System.out.println("Nombre: ");
                    nom = entrada.readLine();
                    el = new Estudiante(nom, nm);
                    ab.insertar(el);
                }
            } while (nm != 0);
            //operaciones con el arbol
            do {
                System.out.println("          1.- Mostrar el arbol\n");
                System.out.println("          2.- Eliminar un estudiante\n");
                System.out.println("          3.- Altura del arbol\n");
                System.out.println("          4.- Cantidad de alumnos\n"); 
                System.out.println("          5.- Buscar nodo\n         ");
                System.out.println("          6.- Salir\n        "); 
                
                do
                    nm = Integer.parseInt(entrada.readLine());
                while(nm < 1 || nm >5);
                if (nm ==1)
                {
                     System.out.println("\n\tEstudiantes \n");
                     ab.inorden(ab.raizArbol());
                      System.out.println("");
                }
                else if (nm == 2)
                {
                    int nmt;
                     System.out.println("Matricula: ");
                     nmt = Integer.parseInt(entrada.readLine());
                     try{
                         ab.eliminar(new Estudiante(null,nmt));
                     }
                     catch (Exception e)
                     {
                         System.out.println(e);
                     }
                }
                else if (nm == 3)
                {
                    System.out.println("La altura del arbol es: "+ab.altura(ab.raizArbol()));
                }
                else if (nm == 4)
                {
                    System.out.println("Se encuentran "+ab.numNodos(ab.raizArbol())+ " alumnos matriculados");
                }
                else if (nm ==5)
                {
                    try{
                        int nmt;
                        System.out.println("Matricula: ");
                        nmt = Integer.parseInt(entrada.readLine());
                        Nodo dato;
                        dato =  ab.buscar(new Estudiante (null, nmt));
                        dato.visitar();
                        System.out.println("\n");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            } while (nm != 6);
        }
        catch (Exception er)
        {
            System.out.println("Error en el proceso del arbol: " + er);
        }
    }
}
















