/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.herencia.barcos;

/**
 *
 * @author cissanal
 */
public class DeVapor extends Barco{
    public DeVapor(){
        System.out.println("Se ha creado un barco de vapor");
    }
    @Override
    public void alarma(){
        System.out.println("SOS desde un barco de vapor");
    }
    
    public void metodoDeVapor(){
        System.out.println("Metodo propio de vapor");
    }
    
}
