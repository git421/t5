/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.ascensor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cissanal
 */
public class AscensorApp {
    
    public static void main(String[] args) {
        Ascensor a1 = new Ascensor(8, 400);
        Persona p1= new Persona(65);
        Persona p2= new Persona(500);
        try {
            a1.cambiarPuertas();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
        try {
            a1.entrarPersona(p1);
        } catch (Exception ex) {
            a1.activarAlarma();
        }
        try {
            a1.moverPiso(7);
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println(a1);
        
        
        
        
    }
}
