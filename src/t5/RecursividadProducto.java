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
public class RecursividadProducto {

    public static int producto(int n1, int n2) {
        if (n2 == 1) return n1;
        return n1 + producto(n1,--n2) ;
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 2 numeros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(producto(n1,n2));
    }

}
