/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.automovil;

/**
 *
 * @author cissanal
 */
public class AutomovilPruebas {
    public static void main(String[] args) {
        
         Automovil a1 = new Automovil("12345678A", 5, 300, 200);
        System.out.println(a1);
        a1.Repostar();
        System.out.println(a1);
        a1.Entrar();
        a1.Arrancar();
        a1.Acelerar();
        a1.Acelerar();
        a1.Acelerar();
        System.out.println(a1);
        
        
        
        
        
    }
}
