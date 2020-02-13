/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.abstraccion.figuras;

/**
 *
 * @author cissanal
 */
public class AppFiguras {
    
    public static void calcularArea(Figura figura){
        System.out.println("Area de la figura ("+figura.getClass().getSimpleName()+")");
        System.out.println(figura.calcularArea());//metodo polimorfico, ligadura dinamica
    }
    
    public static void dibujar(Figura figura){
        figura.dibujar();//metodo polimorfico, ligadura dinamica
    }
    
    public static void desplazarFigura(Figura figura, double a, double b){
        System.out.println("Antes desplazamiento: "+figura.toString());
        figura.desplazar(a, b);
        System.out.println("Despues desplazamiento: "+figura.toString());
    }
    
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(5, new Punto1(0,0));
        Cuadrado cuadrado = new Cuadrado(10, new Punto1(-1.2,25));
        Rectangulo rectangulo = new Rectangulo(2,3, new Punto1(0,0));
        
        calcularArea(circulo);
        calcularArea(cuadrado);
        calcularArea(rectangulo);
        
        dibujar(circulo);
        
        desplazarFigura(circulo,5,8);
        desplazarFigura(cuadrado,4,20);
        desplazarFigura(rectangulo,6,9);
    }
    
    
}
