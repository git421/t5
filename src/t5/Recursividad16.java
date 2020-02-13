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
public class Recursividad16 {
public static long potencia (int base, int exponente){
    if(exponente==0){
        return 1;
    }
    return base*potencia(base, exponente);
    
}
    
**********************
   

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base de la potencia");
        int base = sc.nextInt();
        System.out.println("Introduzca el exponente de la potencia");
        int exponente =sc.nextInt();
        System.out.println(potencia(base,exponente));
        
        

        
    }

}
