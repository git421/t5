/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.banco;

/**
 *
 * @author cissanal
 */
public class Test1 {

    public static void main(String[] args) {
        try {

            Cliente c1 = new Cliente("13131313A", "ASDFG Pepe");
//        Cliente c2=new Cliente("", "Pedro Sanchez");
            CuentaBancaria cuenta1 = new CuentaBancaria("493545", c1);
            c1.setCuentaBancaria(cuenta1);
            System.out.println(c1);
            System.out.println(cuenta1);
            cuenta1.Ingresar(420);
            cuenta1.Reintegrar(50);
            System.out.println(cuenta1);
            cuenta1.Intereses();
            System.out.println(cuenta1);
            cuenta1.Reintegrar(377.5);
            System.out.println(cuenta1);
//            System.out.println(c2);

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
