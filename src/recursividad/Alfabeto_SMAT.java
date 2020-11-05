/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author sergi
 */
public class Alfabeto_SMAT {
    static void metodoA (char c)
    {
        if (c > 'A')
            metodoB(c);
        System.out.println(c);
    }
    
    static void metodoB(char c)
    {
        metodoA(--c);
    }
    
    public static void main(String [] a)
    {
        System.out.println();
        metodoA('z');
        System.out.println();
    }
}





































