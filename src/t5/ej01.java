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
public class ej01 {
    
    public static int pedirNums(int i){
        //recoge la seleccion del usuario desde el teclado
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca numero "+i+": ");
        int num1 = sc.nextInt();
        return num1;
        
    }
    
    public static String menu(){
        //muestra por consola las operaciones disponibles
        String ops = "OPERACIONES DISPONIBLES: "
                + "\r\n 1. Suma: +"
                + "\r\n 2. Resta: -"
                + "\r\n 3. Multiplicacion: *"
                + "\r\n 4. Division: / "
                + "\r\n 5. Enter para Salir:";
        return ops;
        
    }
    public static String pedirOpcion(String op1){
        //recoge la seleccion del usuario desde el teclado
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la opción: ");
        op1 = sc.nextLine();
        
        return op1;
        
    }
    
    //metodo para sumar
    public static int sumar(int a, int b) {
        int resultado = a+b;
        return resultado;
    }
    //metodo para restar
    public static int restar(int a, int b) {
        int resultado = a-b;
        return resultado;
    }
    //metodo para dividir
    public static double dividir(double a, double b) {
        NumberFormat nf= NumberFormat.getInstance(Locale.ENGLISH);
        nf.setMaximumFractionDigits(2);
        double resultado = a/b;
        if(b==0){
            return Double.MIN_VALUE;//indicador de error
        }
        return Double.parseDouble(nf.format(a / b));
    }
    //metodo para multiplicar
    public static int multiplicar(int a, int b) {
        int resultado = a*b;
        return resultado;
    }
    
    
    public static void main(String[] args) {
    
        
        
        
        
//        int result=sumar(13,37);
//        System.out.println(result);
//        System.out.println(sumar(4,20));
//        System.out.println(dividir(66,6));
//        double resultado = dividir(66,0);
//        if(resultado==Double.MIN_VALUE){
//            System.out.println("Error al dividir");
//        }else{
//            System.out.println(resultado);
//        }
        
        System.out.println(menu());
        
        String op1 ="";
        int num1;
        int num2;
        do{
            
        
        switch(pedirOpcion(op1)){
            case "+":
                num1=pedirNums(1);
                num2=pedirNums(2);
                System.out.println(sumar(num1, num2));
                break;
            case "-":
                num1=pedirNums(1);
                num2=pedirNums(2);
                System.out.println(restar(num1, num2));
                break;
            case "*":
                num1=pedirNums(1);
                num2=pedirNums(2);
                System.out.println(multiplicar(num1, num2));
                break;
            case "/": 
                num1=pedirNums(1);
                num2=pedirNums(2);
                System.out.println(dividir(num1, num2));
                break;
            
                
            default: 
                System.out.println("Opcion incorrecta");
        }
        }while(op1 != " ");
    }
    
}
