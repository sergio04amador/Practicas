/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author sergi
 */
public class insertarColaL {
     public static void main (final String[] args) throws Exception{
         ColaLista_SMAT colaL=new ColaLista_SMAT();
         System.out.println("Cola dinamica");
         //insertar
         try {
             colaL.insertar("Elemento");
         } catch (Exception e) {
             System.out.println(e);
         }
         //quitar
         try {
             System.out.println(colaL.quitar());
         } catch (Exception e) {
             System.out.println(e);
         }
         //frente
         try {
             System.out.println(colaL.frenteCola());
         } catch (Exception e) {
             System.out.println(e);
         }
         colaL.borrarCola();
     }
}




















