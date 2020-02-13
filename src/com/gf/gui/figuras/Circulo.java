/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.gui.figuras;

import com.gf.obj2.*;
import java.awt.Color;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author cissanal
 */
public class Circulo {

    private double radio;
    private Punto centro; //luego hago un metodo en el que los puntos los mete el usuario
    private Color color;
    private boolean fill;
    private int outlineWidth;
    
    private NumberFormat nf;
    
    public Circulo (double radio){
        this.radio=radio;
        nf=NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(2);
        this.centro= new Punto(0,0);
    }

    public Circulo(double radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
        nf=NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(2);
    }

    public Circulo(double radio, Color color, boolean fill, int outlineWidth) {
        this.radio = radio;
        this.color = color;
        this.fill = fill;
        this.outlineWidth = outlineWidth;
        nf=NumberFormat.getInstance(Locale.UK);
        nf.setMaximumFractionDigits(2);
    }
    
    

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public void setNf(NumberFormat nf) {
        this.nf = nf;
    }

    public double getRadio() {
        return radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public NumberFormat getNf() {
        return nf;
    }

    public Color getColor() {
        return color;
    }

    public boolean isFill() {
        return fill;
    }

    public int getOutlineWidth() {
        return outlineWidth;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public void setOutlineWidth(int outlineWidth) {
        this.outlineWidth = outlineWidth;
    }
    
    

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", centro=" + centro + ", color=" + color + ", fill=" + fill + ", outlineWidth=" + outlineWidth + '}';
    }

    

    public double area(){
        return Double.parseDouble(nf.format(Math.PI*Math.pow(this.radio, 2)));
    }
    
    
    public double perimetro(){
        return Double.parseDouble(nf.format(2*Math.PI*this.radio));
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
