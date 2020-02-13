/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.ascensor;

/**
 *
 * @author cissanal
 */
public class Persona {
    
            private int idPersona;
            private double peso;
            public static int cont;
            
            public Persona (double peso){
                this.peso=peso;
            }

    public int getIdPersona() {
        return idPersona;
    }

    public double getPeso() {
        return peso;
    }

    public static int getCont() {
        return cont;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static void setCont(int cont) {
        Persona.cont = cont;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", peso=" + peso + '}';
    }
            
            
    
}
