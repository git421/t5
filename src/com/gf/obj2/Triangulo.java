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
public class Triangulo {
    private double a;
    private double b;
    private double c; //base
    private double h;
    private Punto centro;
    private NumberFormat nf;
    
    
    public Triangulo(double a, double b, double c, double h) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;
        
        nf=NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(2);
        this.centro= new Punto(0,0);
        
        
    }
    
    public Triangulo(double a, double b, double c, double h, Punto centro) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;
        this.centro = centro;
        nf=NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(2);
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
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

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
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
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", h=" + h + ", centro=" + centro + '}';
    }

    public double area(){
        return Double.parseDouble(nf.format(this.c*this.h/2));
        
    }
    
    
    public double perimetro(){
        return Double.parseDouble(nf.format(this.a+this.b+this.c));
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
