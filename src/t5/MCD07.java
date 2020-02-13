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
//Escribe un programa llamado MCD que pida al usuario dos números enteros positivos y
//que calcule el máximo común divisor de ambos. Encapsular toda la implementación en un
//método llamado mcd que reciba dos parámetros de tipo entero, el primero de ellos debe
//ser el mayor de los dos números y devuelva un entero correspondiente al MCD. Para el
//cálculo del MCD utilizar el algoritmo de Euclides.
public class MCD07 {

    public int mcd(int num1, int num2) {
        int a = 0;//es mejor hacer este tipo de comprobaciones
        if (num2 > num1) {//en el main, es la responsabilidad de quien llama al metodo de 
            a = num2;// pasar los valores correctamente
            num2 = num1;
            num1 = a;
        }
        int resto;
        int aux;
        do {
            resto = num1 % num2;
            if (resto != 0) {
                aux = num2;
                num2 = resto;
                num1 = aux;
            }
        } while (resto != 0);

        return num2;
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MCD07 mcd =new MCD07();//Si el metodo no es estatico necesitamos crear un objeto de la clase
        System.out.println("Introduzca numero 1:");
        int num1 = sc.nextInt();
        System.out.println("Introduzca numero 2:");
        int num2 = sc.nextInt();
        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + mcd.mcd(num1, num2));//aqui llamamos a ese objeto 
                                                                                               //que acabamos de crear

    }

}
