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
public class AppBarcos {
    
    public static void naufragio(Barco b){
        b.alarma();//metodo polimorfico (ligadura dinamica)
        if(b instanceof Velero){
            ((Velero)b).metodoVelero();//ligadura dinamica
        }
        if(b instanceof DeVapor){
            ((DeVapor)b).metodoDeVapor();
        }
    }
    
    public static void main(String[] args) {
        
        Velero velero =new Velero();
        DeVapor vapor =new DeVapor();
        
        naufragio(velero);//ligadura estatica
        naufragio(vapor);//ligadura estatica
        
        vapor.metodoDeVapor();
        
        
    }
    
    
}
