/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.obj1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author cissanal
 */
public class Persona1 {
    private int idPersona;
    private String nombre;
    private String apellidos;
    private String DNI;
    static String tipo;
    static int cont;
    static int contPropio;

    public Persona1(int idPersona, String nombre, String apellidos, String DNI) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.cont++;
        this.contPropio=this.cont;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona1{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI +" contador "+cont+" "+contPropio+ '}';
    }
    
    public String getNombreCompleto(){
        return this.apellidos+", "+this.nombre;
    }
    public static String getGenero(){
        return "Humano";
    }
    
    
    
}