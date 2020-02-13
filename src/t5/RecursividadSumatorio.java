/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5;

import java.util.Scanner;

/**
 *
 * @author cissanal
 */
public class RecursividadSumatorio {

    public static int sumatorio(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumatorio(--n);
    }

    public static int sumatorioCutre(int n) {
        for (int i = n - 1; i > 0; i--) {
            n = n + i;
        }
        return n;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();

        int s = sumatorio(n);
        System.out.println("sumatorio recursividad " + s);

        System.out.println("sumatorio cutre " + sumatorioCutre(n));
    }

}
