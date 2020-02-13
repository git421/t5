/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author cissanal
 */
public class RecursividadGeo {
static BufferedReader teclado;
    public static double p(double n) {
       if(n==1){
           return 1.0;
       }
       return (1.0 /n)* p(n-1);
    }

   

    public static void main(String[] args) throws IOException {
        teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca un numero");
        int n = Integer.parseInt(teclado.readLine());
        System.out.println("S(" +n+ ")=" + p(n));
        

        
    }

}
