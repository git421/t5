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
public class Test {

    public static void main(String[] args) {
        Documento documento = new Documento();
        Documento documento2 = new Documento();
        System.out.println(documento);
        System.out.println(documento2);
        Libro libro1 = new Libro("asd", "asd", "asd", 1999);
        System.out.println(libro1);
        Revista revista1 = new Revista("ASD", "asd", "asd", 1999, 2, 3, 5);
        System.out.println(revista1);
        Consulta consulta1 = new Consulta(revista1, LocalDate.now(), "ASDF2134");
        Consulta consulta2 = new Consulta(revista1, LocalDate.now(), "ASDF213a4");
        consulta1.devolver();
        Consulta consulta3 = new Consulta(revista1, LocalDate.now(), "ASDF213a4");
        System.out.println(revista1);
        
    }
}
