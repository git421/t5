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
public class CD extends Libro{
    private String formato;
    private String licenciaTipo;
    
    
    public CD(String titulo, String autor, String editorial, int ano, String formato, String licenciaTipo) {
        super(titulo, autor, editorial, ano);
        this.formato=formato;
        this.licenciaTipo=licenciaTipo;
    }

    public String getFormato() {
        return formato;
    }

    public String getLicenciaTipo() {
        return licenciaTipo;
    }

    public static int getContDoc() {
        return contDoc;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setLicenciaTipo(String licenciaTipo) {
        this.licenciaTipo = licenciaTipo;
    }

    public static void setContDoc(int contDoc) {
        Documento.contDoc = contDoc;
    }

    @Override
    public String toString() {
        return super.toString()+ " CD{" + "formato=" + formato + ", licenciaTipo=" + licenciaTipo + '}';
    }
    
    
    
}
