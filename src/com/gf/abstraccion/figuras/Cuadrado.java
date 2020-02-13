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
public class Cuadrado extends Cuadrilatero{

    public Cuadrado(double lado, Punto1 centro) {
        super(lado,lado, centro);
    }

    
    
    
    @Override
    public void dibujar() {
        System.out.println("Se ha dibujado un cuadrado");
    }
    
    @Override
    public String toString(){
        return "Lado: " + this.lado1+super.toString();
    }
    
    
}
