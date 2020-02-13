/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.obj1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cissanal
 */
public class EjemploExcepciones4 {
    
    
    public static double dividir(double n1, double n2) throws Exception{
        if(n2==0){
            throw new Exception("Error denominador nulo"); //aqui estamos creando una excepcion
        }
        return n1/n2;
    }
    
    
    public static void main(String[] args) {
        
        try {
            System.out.println(dividir(2,5));
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        
        
    }
    
}
