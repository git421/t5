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
public class Calculadora {
    
    public static double sumar(double n1, double n2){
        return n1+n2;
    }
    public static double restar(double n1, double n2){
        return n1-n2;
    }
    public static double multiplicar(double n1, double n2){
        return n1*n2;
    }
    public static double dividir(double n1, double n2) throws Exception{ 
        if(n2==0) throw new Exception ("Error division");
        return n1/n2;
    }
    
    
}
