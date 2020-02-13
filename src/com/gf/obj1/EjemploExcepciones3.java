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
public class EjemploExcepciones3 {
    public static void abrirFichero(String path) throws FileNotFoundException{
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream(new File(path)));
    }
    
    
    
    
    public static void main(String[] args) {
        
        try {
            abrirFichero("asd.exe");
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        
        
    }
    
}
