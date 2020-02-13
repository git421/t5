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
public class Rectangulo {
    private double w;
    private double h;
    private Punto centro; //luego hago un metodo en el que los puntos los mete el usuario
    private NumberFormat nf;
    
    public Rectangulo (double w, double h){
        this.w=w;
        this.h=h;
        nf=NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(2);
        this.centro= new Punto(0,0);
    }

    public Rectangulo(double w, double h, Punto centro) {
        this.w=w;
        this.h=h;
        this.centro = centro;
        nf=NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(2);
    }

    public void setW(double w) {
        this.w = w;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public void setNf(NumberFormat nf) {
        this.nf = nf;
    }

    public double getW() {
        return w;
    }

    public double getH() {
        return h;
    }

    public Punto getCentro() {
        return centro;
    }

    public NumberFormat getNf() {
        return nf;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "w=" + w + ", h=" + h + ", centro=" + centro + '}';
    }

    
    public double area(){
        return Double.parseDouble(nf.format(h*w));
        
    }
    
    public double diagonal(){
        return Double.parseDouble(nf.format(Math.sqrt((this.h*this.h)+(this.w*this.w))));
    }
    
    
    public double perimetro(){
        return Double.parseDouble(nf.format(2*(this.h+this.w)));
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
