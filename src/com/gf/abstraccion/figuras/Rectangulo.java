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
public class Rectangulo extends Cuadrilatero{
    
    public Rectangulo(double base, double altura, Punto1 centro){
        super(base,altura,centro);
    }

    @Override
    public void dibujar() {
        System.out.println("Se ha dibujado un rectangulo de lados: " + this.lado1 +" --- "+this.lado2);
    }
    
    @Override
    public String toString(){
        return "Lado 1: " + this.lado1+ " Lado 2: "+ this.lado2 +super.toString();
    }
    
}
