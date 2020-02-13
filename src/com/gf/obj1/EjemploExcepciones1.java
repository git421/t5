/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.obj1;

/**
 *
 * @author cissanal
 */
public class EjemploExcepciones1 {
    
    static public void metodo111(){
        
        String s =null;
        System.out.println("Longitud de la cadena: " + s.length());
            System.out.println("Despues del length");
        
        System.out.println("Finaliza la ejecucion del 111");
    }
    
    static public void metodo11(){
        try{
            metodo111();
        }catch(NullPointerException ex){
            System.out.println("Excepcion controlada en 11");
            System.err.println(ex.toString());
        }
        
    }
    
    static public void metodo1(){
        metodo11();
    }
    
    public static void main(String[] args) {
        System.out.println("Antes de la llamada al metodo 1");
        metodo1();
        System.out.println("despues de la llamada al metodo 1");
    }
    
}
