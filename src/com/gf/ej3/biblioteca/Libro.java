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
public class Libro extends Documento{
    private String titulo;
    private String autor;
    private String editorial;
    private int ano;
    

    public Libro(String titulo, String autor, String editorial, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
    public String getEditorial() {
        return editorial;
    }

    public int getAno() {
        return ano;
    }

    public static int getContDoc() {
        return contDoc;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static void setContDoc(int contDoc) {
        Documento.contDoc = contDoc;
    }

    @Override
    public String toString() {
        return super.toString()+
         " Libro{" + "titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", ano=" + ano + '}';
    }
    
    
    
    
    
}
