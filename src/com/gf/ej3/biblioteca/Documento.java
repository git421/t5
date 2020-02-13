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
public class Documento {
    private int Cod=00000000;
    public static int contDoc;
    protected boolean disponible;

    public Documento() {
        contDoc++;
        this.Cod=contDoc;
        this.disponible=true;
    }

    public int getCod() {
        return Cod;
    }

    public static int getContDoc() {
        return contDoc;
    }

    public void setCod(int Cod) {
        this.Cod = Cod;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    

    public static void setContDoc(int contDoc) {
        Documento.contDoc = contDoc;
    }

    @Override
    public String toString() {
        return "Documento{" + "Cod=" + Cod + '}';
    }
    
    
    
    
    
    
}
