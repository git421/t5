/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.herencia.barcos;

/**
 *
 * @author cissanal
 * clase que modela las caracteristicas comunes de todos los barcos de la aplicacion
 */
public class Barco {
    public Barco(){
        System.out.println("Se ha creado un barco");
    }
    
    public void alarma(){
        System.out.println("SOS desde un barco");
    }
   
}
