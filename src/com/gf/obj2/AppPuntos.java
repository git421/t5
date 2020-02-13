/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.obj2;

/**
 *
 * @author cissanal
 */
public class AppPuntos {

    public static void main(String[] args) {

        Punto p1 = new Punto(0,0);
        p1.setX(3);
        p1.setY(5);

        Punto p2 = new Punto(0,0);
        p2.setX(-5.3);
        p2.setY(50);

        System.out.println(p1.toString()); //(x,y)
        p1.desplazar(5, 7); //p1(8,12)
        System.out.println(p1.toString()); //(x,y)
        p1.mover(-1, 1); //p1(0,0)
        System.out.println(p1.toString()); //(x,y)
        double distancia = p1.calcularDistancia(p2);
        System.out.println(distancia);
        p1.alCentro(); //p1.(xCentral, yCentral)
        System.out.println(p1); //(x,y)
        
        
        //si se hace un system out sin el toString, se asume que se quiere llamar al toString

    }
}
