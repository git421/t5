/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.obj2;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author cissanal
 */
public class Cuadrado {
     
    private double l;
    private Punto centro; //luego hago un metodo en el que los puntos los mete el usuario
    private NumberFormat nf;
    
    public Cuadrado (double l){
        this.l=l;
        nf=NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(2);
        this.centro= new Punto(0,0);
    }

    public Cuadrado(double l, Punto centro) {
        this.l=l;
        this.centro = centro;
        nf=NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(2);
    }

    public void setL(double l) {
        this.l = l;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public void setNf(NumberFormat nf) {
        this.nf = nf;
    }

    public double getL() {
        return l;
    }

    public Punto getCentro() {
        return centro;
    }

    public NumberFormat getNf() {
        return nf;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "l=" + l + ", centro=" + centro + '}';
    }

    

    
    public double area(){
        return Double.parseDouble(nf.format(l*l));
        
    }
    
    public double diagonal(){
        return Double.parseDouble(nf.format(Math.sqrt((this.l*this.l)+(this.l*this.l))));
    }
    
    
    public double perimetro(){
        return Double.parseDouble(nf.format(2*(this.l+this.l)));
    }
    
    
    public void desplazar(int dX, int dY){
//        this.centro.setX(this.centro.getX()+dX);
//        this.centro.setY(this.centro.getY()+dY);
        //otra posibilidad
        this.centro.desplazar(dX, dY);
    }
    
    public void moverA(Punto destino){
        this.centro=destino;
    }
    
    
    
}
