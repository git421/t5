/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.obj1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cissanal
 */
public class AppCalculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULADORA");
        System.out.println("-----------");
        System.out.println("Numero1: ");
        double n1 = sc.nextDouble();
        System.out.println("Numero2: ");
        double n2 = sc.nextDouble();
        System.out.print("Operacion (+,-,x,/)");
        char operacion = sc.nextLine().charAt(0);
        double res = 0;
        switch (operacion) {
            case '+':
                res=Calculadora.sumar(n1, n2);
                System.out.println(res);
                break;
            case '-':
                res=Calculadora.restar(n1, n2);
                System.out.println(res);
                break;
            case '*':
                res=Calculadora.multiplicar(n1, n2);
                System.out.println(res);
                break;
            case '/':
            {
                try {
                    res=Calculadora.dividir(n1, n2);
                } catch (Exception ex) {
                    System.err.println(ex.getMessage());
                }
            }
                System.out.println(res);
                break;

            default:
                System.out.println("Operacion no contemplada");

        }

    }

}
