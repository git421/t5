/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.obj1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cissanal
 */
public class EjemploExcepciones6bis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String tabu = "pepe";

        while (true) {
            try {
                System.out.print("Introduzca palabra: ");
                String palabra = sc.nextLine();
                if (palabra.equals(tabu)) {
                    throw new MiExcepcion("MENSAJE");
                }
            } catch (MiExcepcion ex) {
                System.out.println("tabu"); //metemos el try catch en el bucle y asi no para
            }

        }

    }

}
