/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.obj2;

/**
 *
 * @author cissanal
 */
public class AppFiguras {
    public static void main(String[] args) {
        
        
        
        Circulo c1 = new Circulo(54);
        Circulo c2 = new Circulo(69, new Punto(-5,10));
        System.out.println(c1);
        System.out.println(c2);
        
        c1.moverA(new Punto(7,-1.5));
        System.out.println(c1);
        
        c2.desplazar(1, -1);
        System.out.println(c2);
        
//        System.out.println("Area C1: "+ c1.area());
//        System.out.println("Perimetro C1: "+ c1.perimetro());
        
        Rectangulo r1 = new Rectangulo(20, 15);
        Rectangulo r2 = new Rectangulo(4, 20, new Punto (8,5));
        System.out.println(r1);
        System.out.println(r2);
        
        System.out.println(r1.area());
        System.out.println(r1.perimetro());
        
        
        
    }
}
