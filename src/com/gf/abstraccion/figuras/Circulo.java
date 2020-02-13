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
public class Circulo extends Figura{
    private double radio;
    

    public Circulo(double radio, Punto1 centro) {
        this.radio = radio;
        this.centro=centro;
    }

    @Override
    public double calcularArea() {
        return Math.PI+Math.pow(this.radio,2);
    }

    @Override
    public void dibujar() {
        System.out.println("Se ha dibujado un circulo de radio");
    }

    @Override
    public String toString() {
        return "Radio:" + this.radio +super.toString();
    }

    
    
    
    
    
}
