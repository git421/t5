/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cissanal
 */
//Escribe un programa Coordenadas que utilice métodos para convertir coordenadas
//polares en rectangulares.
//
//Donde O es el origen de coordenadas, r es la distancia de O al punto P (dado por las
//coordenadas x e y) y ө es el ángulo formado por el vector que apunta a P y el eje X (en
//radianes).
//La conversión de coordenadas se hace mediante las fórmulas:
//x = r cos ө  esta o rara es el angulo
//y = r sen ө  aqui el angulo se hace en radianes, hay que pasarlo de grados a radianes
//Se recibirá por teclado la distancia al punto (r) y el ángulo en grados.
public class Coordenadas {

    public static double polToRectX(double r, double rad) {
        return r * Math.cos(rad);
    }

    public static double polToRectY(double r, double rad) {
        return r * Math.sin(rad);
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        NumberFormat formateadorNum = NumberFormat.getInstance();
        formateadorNum.setMaximumFractionDigits(2);

        System.out.println("Introduzca la distancia al punto: ");
        double r = sc.nextDouble();
        System.out.println("Introduzca el angulo en grados:  ");
        double grad = sc.nextDouble();
        double rad = Math.toRadians(grad);
        System.out.println("Las coordenadas son: (" + formateadorNum.format(polToRectX(r, rad)) +
                "," + formateadorNum.format(polToRectY(r, rad)) + ")");
    }

}
