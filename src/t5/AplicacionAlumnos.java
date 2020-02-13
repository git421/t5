/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5;

/**
 *
 * @author cissanal
 */
public class AplicacionAlumnos {
    
    public static void subirNota(Alumno al, int puntos){ //al=al1
//        al.nota=al.nota+puntos;
        //aqui no se trabaja con una copia
        //trabajo con referencias al objeto
        //con lo que se esta modificando 
        
    }
    
    public static void main(String[] args) {
        Alumno a1=new Alumno(1, "pepe");
        Alumno a2=new Alumno(2, "maria");
        Alumno a3=new Alumno(1, "pepe");
        
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
       
        System.out.println(a1.equals(a3));//es falso porque esta comparando las referencias
        //a1=a3; //aqui hacemos que a1 tenga la misma referencia que a3 y ahora daria true
        System.out.println(a1.equals(a3));
        a3.setEdad(25);
        System.out.println(a1.equals(a3));
        
        
    }
    
    
    
}
