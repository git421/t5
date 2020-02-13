/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.abstraccion.figuras;

import com.gf.gui.figuras.*;
import com.gf.obj2.*;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author cissanal
 */
public class Punto1 {

    private double x;
    private double y;
    
    //constructores        
    public Punto1(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        String coord = "(" + this.x + "," + this.y + ")";
        return coord;
    }

    public void desplazar(double x1, double y1) {
        this.x = this.x + x1;
        this.y = this.y + y1;
    }

    public void mover(double x1, double y1) {
        this.x = x1;
        this.y = y1;
    }

    public double calcularDistancia(Punto1 p) {
        double dist = Math.sqrt(((p.x - this.x) * (p.x - this.x)) + ((p.y - this.y) * (p.y - this.y)));
        return dist;
    }

    public void alCentro() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double w = screenSize.getWidth();
        double h = screenSize.getHeight();
        this.x=w/2;
        this.y=h/2;
    }

}
