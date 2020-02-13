/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.racional;

/**
 *
 * @author coby
 */
public class RacionalApp {
    public static void main(String[] args) {
        
        Racional r1 = new Racional(1,2);
        System.out.println(r1);
        Racional r2 =new Racional(2,6);
        System.out.println(r2);
        System.out.println(r2.toDecimal());
        Racional resultado=r1.producto(r2);
        System.out.println(resultado);
//        Racional resultado2=r1.dividir(r2);
//        System.out.println(resultado2);
        
    }
    
    
}
