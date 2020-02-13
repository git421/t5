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
public class Recursividad17 {

    public static double comb(double m, double n) {
        if ((n == 0) || (n == m)) {
            return 1.0;
        } else if ((n == 1) || (n == (m - 1.0))) {
            return m;
        } else {
            return (comb(m - 1.0, n - 1.0) + comb(m - 1.0, n));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        Double m = sc.nextDouble();
        System.out.println("Introduzca el segundo numero");
        Double n = sc.nextDouble();
        System.out.println(comb(m, n));

    }

}
