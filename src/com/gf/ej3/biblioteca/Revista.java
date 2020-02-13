/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.ej3.biblioteca;

/**
 *
 * @author cissanal
 */
public class Revista extends Libro{
    private int volumen;
    private int numero;
    private int mes;
    
    public Revista(String titulo, String autor, String editorial, int ano, int volumen, int numero, int mes) {
        super(titulo, autor, editorial, ano);
        this.volumen=volumen;
        this.numero=numero;
        this.mes=mes;
        
    }

    public int getVolumen() {
        return volumen;
    }

    public int getNumero() {
        return numero;
    }

    public int getMes() {
        return mes;
    }

    public static int getContDoc() {
        return contDoc;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public static void setContDoc(int contDoc) {
        Documento.contDoc = contDoc;
    }

    @Override
    public String toString() {
        return super.toString()+ " Revista{" + "volumen=" + volumen + ", numero=" + numero + ", mes=" + mes + '}';
    }
    
    
    
}
