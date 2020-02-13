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
//Escribe un programa llamado MayorDe3 que pida al usuario tres números y muestre por
//pantalla el mayor de ellos. La comparación entre los tres números debe basarse en la
//utilización de un método llamado elMayor de tres argumentos que a su vez base su
//funcionamiento en un método llamado elMayor de dos argumentos.
public class ej08MayorDe3 {

    //se pueden hacer 2 metodos con el mismo nombre, con diferentes parametros, para dar la posibilidad
    //de usar el mismo metodo de diferentes formas
    public static int elMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static int elMayor(int num1, int num2, int num3) {
        if (elMayor(num1, num2) > num3) {//aqui uso el valor que devuelve elMayor (la version con 2 argumentos)
            return elMayor(num1, num2);  
        } else {
            return num3;
        }
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca numero 1: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca numero 2: ");
        int num2 = sc.nextInt();
        System.out.println("Introduzca numero 3: ");
        int num3 = sc.nextInt();
        System.out.println("El mayor es: " + elMayor(num1, num2, num3));
    }

}
