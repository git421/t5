/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.moto;

import com.gf.automovil.*;

/**
 *
 * @author cissanal
 */
public class MotoPruebas {
    public static void main(String[] args) {
        
         Moto a1 = new Moto("12345678A", 300, 200);
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
