/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;
import java.io.*;
/**
 *
 * @author sergi
 */
public class Palindromo_SMAT {
    public static void main(String [] a)
    {
        PilaLista_SMAT pilaChar;
        boolean esPal;
        String pal;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            pilaChar = new PilaLista_SMAT(); //crea la pila vacia
            System.out.print("Teclea la palabra a verificar si es palindromo: ");
            pal = entrada.readLine();
            //se crea la pila caracter por caracter de la palabra
            for (int i = 0; i < pal.length();   )
            {
                Character c;
                c = Character.valueOf(pal.charAt(i++));
                pilaChar.insertar(c);
            }
            //se comprueba si es palindromo comparando caracter por caracter
            esPal = true;
             for (int j = 0; esPal && !pilaChar.pilaVacia(); )
             {
                 Character c;
                 c = (Character)pilaChar.quitar();
                 esPal = pal.charAt(j++) == c.charValue();
             }
             pilaChar.limpiarPila();
             if (esPal)
                 System.out.println("La palabra "+pal+ " es un palindromo \n");
             else
                 System.out.println("La palabra "+pal+ " no es un palindromo \n");
        }
        catch (Exception er)
        {
            System.out.println("Exception: "+er);
        }
    }
}


















