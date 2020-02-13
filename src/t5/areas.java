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
//Escribe un programa Areas que permita al usuario elegir el cálculo del área de cualquiera
//de las siguientes figuras geométricas: círculo, cuadrado, rectángulo o triángulo, mediante
//métodos. Para ello muestra al usuario un menú.
public class areas {

    public static String menu() {
        //muestra por consola las operaciones disponibles
        String ops = "FIGURAS DISPONIBLES: "
                + "\r\n 1. Circulo"
                + "\r\n 2. Cuadrado"
                + "\r\n 3. Rectangulo"
                + "\r\n 4. Triangulo ";
        return ops;
    }

    public static int select() {
        Scanner sc = new Scanner(System.in);
        int selectNum = sc.nextInt();
        return selectNum;
    }

    public static double circulo(double num1) {
        NumberFormat nf=NumberFormat.getInstance(Locale.US);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        double pi = Math.PI;
        
        double area = pi * (num1 * num1);//se pueden simplificar todos a eg; return Math.PI*(num1*num1)
        
        return Double.parseDouble(nf.format(area));
    }

    public static double cuadrado(double num1) {
        double area = (num1 * num1);
        return area;
    }

    public static double rectangulo(double num1, double num2) {
        double area = (num1 * num2);
        return area;
    }

    public static double triangulo(double num1, double num2) {
        NumberFormat nf=NumberFormat.getInstance(Locale.US);
        nf.setMinimumFractionDigits(2);
        double area = (num1 * num2) / 2;
        return Double.parseDouble(nf.format(area));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(menu());
        switch (select()) {
            case 1:
                System.out.println("Introduzca el radio del circulo");
                double rad = sc.nextDouble();
                System.out.println("Area del circulo: " + circulo(rad));
                break;
            case 2:
                System.out.println("Introduzca el lado del cuadrado");
                double lado = sc.nextDouble();
                System.out.println("Area del cuadrado: " + cuadrado(lado));
                break;
            case 3:
                System.out.println("Introduzca el primer lado del rectangulo");
                double lado1 = sc.nextDouble();
                System.out.println("Introduzca el segundo lado del rectangulo");
                double lado2 = sc.nextDouble();
                System.out.println("Area del rectangulo: " + rectangulo(lado1, lado2));
                break;
            case 4:
                System.out.println("Introduzca la base del triangulo");
                double base = sc.nextDouble();
                System.out.println("Introduzca la altura del triangulo");
                double altura = sc.nextDouble();
                System.out.println("Area del triangulo: " + triangulo(base, altura));
                break;
            default:
                System.out.println("Error, numero no valido");
        }

    }

}
