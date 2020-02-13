/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.obj1;

import java.util.Scanner;

/**
 *
 * @author cissanal
 */
public class EjemploExcepciones2 {
    
    
    
    
    
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero");
        double n1 = Double.parseDouble(sc.nextLine());    
        }catch(NumberFormatException ex){
            System.err.println(ex.getMessage());
        }
    }
    
}
