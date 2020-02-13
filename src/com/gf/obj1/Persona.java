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
public class Persona {

    //atributos
    private String dni;
    private String nombre;
    private String apellidos;
    private char sexo;
    private LocalDate fechaNac;
    private int edad; //yrs
    private int altura; //cm
    private double peso; //kilos
    private boolean casado;

    //constructor por defecto
    
    
    //mi constructor por defecto
    
    public Persona(){//no devuelve nada, publico, mismo nombre que la clase, puede tener o no parametros
        System.out.println("Se ha creado un objeto Persona");
        dni="";
        nombre=apellidos="";
        setFechaNac(LocalDate.now());
    }
    
    public Persona(String dni){
        this.dni=dni;
        nombre=apellidos="";
        setFechaNac(LocalDate.now());
    }//diferentes posibilidades de construccion
    
    //constructor parametrizado
    public Persona(String dni, String nombre, String apellidos){
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        setFechaNac(LocalDate.now());
        this.altura=0;
        this.peso=0;
        this.casado=false;
    }
    
    
    
    //metodos
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
        //calcular la edad y asignarla al atributo edad de la clase
        calcularEdad();
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public char getSexo() {
        return sexo;
    }

    public String getFechaNac() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuu");
        return dtf.format(fechaNac);
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isCasado() {
        return casado;
    }

    
    @Override //reprograma toString
    public String toString() {
        String datos = "DNI: " + this.dni + "\n";
        datos += "Nombre: " + this.nombre + " Apellidos: " + this.apellidos + "\n";
        datos += "Edad: " + this.edad + " anos \n";
        datos += "Altura: " + this.altura + " Fecha Nacimiento: "+ this.getFechaNac()+ "\n";
        return datos;
    }

    public char letraDni() {
        String a = this.dni.substring(0, 8);
        int b = Integer.parseInt(a);
        int c = b % 23;
        char letraDni = letra(c);
        return letraDni;

    }

    private char letra(int i) {
        char c = '\0';
        switch (c) {
            case 1:
                return 'R';
            case 2:
                return 'W';
            case 3:
                return 'A';
            case 4:
                return 'G';
            case 5:
                return 'M';
            case 6:
                return 'Y';
            case 7:
                return 'F';
            case 8:
                return 'P';
            case 9:
                return 'D';
            case 10:
                return 'X';
            case 11:
                return 'B';
            case 12:
                return 'N';
            case 13:
                return 'J';
            case 14:
                return 'Z';
            case 15:
                return 'S';
            case 16:
                return 'Q';
            case 17:
                return 'V';
            case 18:
                return 'H';
            case 19:
                return 'L';
            case 20:
                return 'C';
            case 21:
                return 'K';
            case 22:
                return 'E';
            default:
                return ' ';
        }
    }

    public boolean isMayorDeEdad() {
        return this.edad >= 18;
    }

    private void calcularEdad() {

        if (LocalDate.now().getDayOfYear() < fechaNac.getDayOfYear()) {
            this.edad = LocalDate.now().getYear() - fechaNac.getYear() - 1;
        } else {
            this.edad = LocalDate.now().getYear() - fechaNac.getYear();
        }
    }

    public int pesoIdeal() {
        if (0.75 * (this.altura - 150) + 50 < this.peso) {
            return 1;
        } else if (0.75 * (this.altura - 150) + 50 > this.peso) {
            return -1;
        } else {
            return 0;
        }
    }

}
