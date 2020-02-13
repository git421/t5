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
public abstract class Figura {
    public abstract double calcularArea();
    public abstract void dibujar();
    protected Punto1 centro;

    public void desplazar(double x, double y){
        centro.desplazar(x, y);
    }
    
    @Override
    public String toString(){
        return "Centro: "+centro.toString();
    }
    
    
}
