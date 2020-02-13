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
public abstract class Cuadrilatero extends Figura{
    protected double lado1;
    protected double lado2;
    
    

    public Cuadrilatero(double lado1, double lado2, Punto1 centro) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.centro = centro;
    }

    //implementamos metodo heredado
    @Override
    public double calcularArea() {
        return this.lado1*this.lado2;
    }
//dejamos el metodo dibujar abstracto 
    
    
    
    
}
