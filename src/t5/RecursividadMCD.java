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
public class RecursividadMCD {

    public static int mcd(int n1, int n2) {
        int resto;
        int aux;
        resto = n1 % n2;
        if (resto != 0) {

            aux = n2;
            n2 = resto;
            n1 = aux;
            return mcd(n1, n2);
        }

        return n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 2 numeros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(mcd(n1, n2));
    }

}
