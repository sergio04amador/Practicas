/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;
import pilas.PilaEstatica_SMAT;
import java.io.*;
/**
 *
 * @author sergi
 */
public class Capicua_SMAT {
    private static boolean valido(String numero)
    {
        boolean sw = true;
        int i =0;
        while (sw && (i < numero.length()))
        {
            char c;
            c = numero.charAt(i++);
            sw = (c >= '0' && c <= '9');
        }
        return sw;
    }
    
    public static void main(String [] a)
    {
        boolean capicua;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String numero;
        PilaEstatica_SMAT pila = new PilaEstatica_SMAT();
        ColaCircular_SMAT q = new ColaCircular_SMAT();
        try {
            capicua = false;
            while (!capicua)
            {
                do {
                    System.out.println("\n Teclee el numero: ");
                    numero = entrada.readLine();
                } while (! valido(numero)); //todos los digitos
                //pone en la cola y en la pila cada digito
                for (int i = 0; i < numero.length(); i++)
                {
                    Character c;
                    c = Character.valueOf(numero.charAt(i++));
                    q.insertar(c);
                    pila.insertar(c);
                }
                //se quita de la cola y la pila para comparar
                do {
                    Character d;
                    d = (Character) q.quitar();
                    capicua = d.equals(pila.quitar()); //compara por igualdad
                } while (capicua && !q.colaVacia());
                if (capicua)
                    System.out.println(numero + " es capicua. ");
                else
                {
                     System.out.println(numero + " no es capicua. ");
                      System.out.println(" Intente otro. ");
                }
                // se vacia la cola y la pila
                q.borrarCola();
                pila.limpiarPila();
            }
        }
        catch (Exception er)
        {
             System.out.println("Error Exception en el proceso: " + er);
        }
    }
}


























