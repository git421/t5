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
public class Velero extends Barco{
    public Velero(){
        System.out.println("Se ha creado un velero");
    }
    
    @Override
    public void alarma(){
        System.out.println("SOS desde un velero");
    }
    public void metodoVelero(){
        System.out.println("Metodo propio de velero");
    }
    
}
