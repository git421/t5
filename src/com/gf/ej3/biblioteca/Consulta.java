/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.ej3.biblioteca;

import java.time.LocalDate;

/**
 *
 * @author cissanal
 */
public class Consulta {
    private Documento doc;
    private LocalDate fecha;
    private String DNI;

    public Consulta(Documento doc, LocalDate fecha, String DNI) {
        this.doc = doc;
        this.fecha = fecha;
        this.DNI = DNI;
        if(this.doc.isDisponible()){
        reservar(this.doc);    
        }else{
            System.out.println("El documento no esta disponible");
        }
        
    }

    public Documento getDoc() {
        return doc;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDoc(Documento doc) {
        this.doc = doc;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Consulta{" + "doc=" + doc + ", fecha=" + fecha + ", DNI=" + DNI + '}';
    }
    
    public void reservar(Documento doc){
        doc.setDisponible(false);
    }
    
    public void devolver(Documento doc){
        doc.setDisponible(true);
    }
    
    
    
}
