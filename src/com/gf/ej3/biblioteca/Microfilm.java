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
public class Microfilm extends Revista{
    private int codMicrofilm;
    
    public Microfilm(String titulo, String autor, String editorial, int ano, int volumen, int numero, int mes, int codMicrofilm) {
        super(titulo, autor, editorial, ano, volumen, numero, mes);
        this.codMicrofilm=codMicrofilm;
    }

    public int getCodMicrofilm() {
        return codMicrofilm;
    }

    public static int getContDoc() {
        return contDoc;
    }

    public void setCodMicrofilm(int codMicrofilm) {
        this.codMicrofilm = codMicrofilm;
    }

    public static void setContDoc(int contDoc) {
        Documento.contDoc = contDoc;
    }

    @Override
    public String toString() {
        return super.toString()+ " Microfilm{" + "codMicrofilm=" + codMicrofilm + '}';
    }
    
    
    
}
