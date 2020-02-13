/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.herencia.ej1;

/**
 *
 * @author cissanal
 */
public class AppEmpleados {
    
    public static void main(String[] args) {
        
        Empleado vendedor1 = new Empleado();
        vendedor1.setNumEmpleado(1);
        vendedor1.setNombre("Pepe");
        vendedor1.setApellidos("Ga");
        vendedor1.setSalarioBase(1000);
        vendedor1.setIrpf(0.02);
        vendedor1.subirSalario(20);
        vendedor1.subirSalario(0.02);
        System.out.println(vendedor1.datosEmpleado());
        System.out.println("Nomina vendedor: " + vendedor1.calcularNomina());
        
        
        Programador prog1=new Programador();
        prog1.setNumEmpleado(2);
        prog1.setNombre("Pepega");
        prog1.setApellidos("Hands");
        prog1.setSalarioBase(1337);
        prog1.setIrpf(0.1);
        prog1.setHoras(15);
        prog1.setPrecioHora(10);
        System.out.println(prog1.datosEmpleado());
        System.out.println("Nomina programador: " + prog1.calcularNomina());
        prog1.subirSalario(20);
        prog1.subirSalario(0.05);
        prog1.subirSalario(0, 0);
    }
    
    
}
