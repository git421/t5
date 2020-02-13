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
//Escribe un programa Primo que muestre si un número dado por el usuario es primo o no.
//Crea para ello un método llamado esPrimo
public class primo {

    public  boolean esPrimo(int num) {

        //primera comprobacion de divisible
        for (int i = num - 1; i > 1; i--) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Introduzca un numero");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        primo primo =new primo();//al ser estatico necesito crear un objeto de la clase
        if (primo.esPrimo(n1)) {//para poder llamar a un metodo no estatico
            System.out.println("El numero introducido es primo");
        } else {
            System.out.println("El numero introducido no es primo");
        }

    }

}
