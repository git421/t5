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
public class AppPersonas {
    public static void main(String[] args) {
        
//        Persona p1=new Persona();
//        p1.setDni("12345678A");
//        System.out.println("Letra DNI: "+ p1.letraDni());
//        p1.setNombre("pepe");
//        p1.setApellidos("soplillo");
//        p1.setEdad(25);
//        p1.setPeso(50);
//        p1.setCasado(false);
//        p1.setSexo('H');
//        p1.setFechaNac(LocalDate.of(1994,8,15));
//        p1.setAltura(170);
//        
//        
//        
//        //vemos el estado de la persona creada
//        System.out.println("Nombre: "+p1.getNombre());
//        System.out.println("Apellidos: "+p1.getApellidos());
//        System.out.println("Edad: "+p1.getEdad());
//        System.out.println("Fecha Nacimiento: "+p1.getFechaNac());
//        String estado = p1.isCasado()? "Casado" : "Soltero";
//        System.out.println(estado);
//        
//        
//        System.out.println(p1.datosPersona());
//        System.out.println(p1.letraDni());
//        System.out.println("Mayor de edad?: " + p1.isMayorDeEdad());


          Persona pepe = new Persona();
          System.out.println(pepe.toString());
          
          Persona maria=new Persona("12345678","Maria","Gomez");
          System.out.println(maria.toString());
          
          Persona pepega = new Persona("12345678");
          System.out.println(pepega.toString());
          
        
    }
    
    
   
    
    
}
