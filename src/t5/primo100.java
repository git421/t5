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
//Escribe un programa Primos que muestre por pantalla los 100 primeros números primos.
public class primo100 {

    

    public static void main(String[] args) {
        primo primo =new primo();//si el metodo no es estatico necesitamos crear un objeto de la clase
        int cont = 0;           
        for (int i = 1; cont <= 100; i++) {
            if (primo.esPrimo(i) == true) {
                System.out.println(i);
                cont++;
            }
        }
    }

}
