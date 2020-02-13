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
    //programa que realice operaciones aritmeticas basicas
    //con 2 enteros
    //+ - * / 

//Escribe un método llamado toFahrenheit que convierta una temperatura dada en grados
//Celsius a grados Fahrenheit. La fórmula de conversión es:
//F = 9 / 5 C + 32


//Escribe un método que devuelva el divisor más grande de un entero dado (distinto del
//propio entero).



public class ej02 {
    
    public static double toFahrenheit(double c){
        double f=((9.0/5.0)*c)+32;
        return f;
    }
    
    public static int divisorGrande (int num){
        
        
        int num1=num;
        
        int div=0;
        for (int i = num; i != 1; ) {
            i--;
            if(num1%i==0){
                div=i;
                break;
            }
        }
        
        return div;
    }
    
    public static boolean par(int num){
        int numpar=0;
        boolean esPar;
        if(num%2==0){
            esPar=true;
        }else{
            esPar=false;
        }
        return esPar;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca int");
        int n1 = sc.nextInt();
        System.out.println(par(n1));
        
    }
    
    
}
