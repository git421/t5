/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.obj1;

import java.time.LocalDate;

/**
 *
 * @author cissanal
 */
public class AppPersonas1 {
    public static void main(String[] args) {
        
        Persona1.tipo="Humano"; //static, atributo compartido por todos los objetos 
        
        Persona1 p1=new Persona1(1,"pepe", "soplillo", "12345678A");
        p1.setNombre("otro nombre");
        p1.tipo="otro tipo"; 
        System.out.println(p1);
        Persona1 p2=new Persona1(2,"maria", "dominguez", "12345878X");
        System.out.println(p2.tipo);  
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(Persona1.getGenero());//los metodos estaticos, que son iguales para todos los objetos
                                                 //pueden ser accedidos sin tener que crear un objeto
                                                 //solo guarda 1 en memoria, mejor uso
        
        
    }
    
    
   
    
    
}
