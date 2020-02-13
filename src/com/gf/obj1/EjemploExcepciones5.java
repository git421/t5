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
public class EjemploExcepciones5 {
    
    
    public static void main(String[] args) {
        
        try {
            String s = "hola caracola";
            int position = (int) (30 * Math.random()); //0,29
            System.out.println(s.charAt(position));
            s=null;
            System.out.println(s.length());
        } catch (StringIndexOutOfBoundsException ex) {
            System.err.println("Error de acceso a cadena");
        } catch (Exception ex){
            System.err.println("Error general");
        } finally{//se ejecuta siempre, haya o no excepcion
            System.out.println("Bloque finally ejecutado");
        }
        
        
        
    }
    
}
