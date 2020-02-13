/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.herencia.ej1;

/**
 *modela las caracteristicas comunes de todos los empleados de la aplicacion
 * @author cissanal
 */
public class Empleado {
    protected int numEmpleado;
    protected String nombre;
    protected String apellidos;
    protected double salarioBase;
    protected double irpf;

    public Empleado(){
        System.out.println("Se ha creado un empleado");
        this.salarioBase=950;
        this.irpf=0.02;
    }

    public Empleado(int numEmpleado, String nombre, String apellidos, double salarioBase, double irpf) {
        this.numEmpleado = numEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioBase = salarioBase;
        this.irpf = irpf;
    }
    
    
    
    
    public int getNumEmpleado() {
        return numEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }
    
    
    public String datosEmpleado(){
        String msg="Empleado nº: " + this.numEmpleado + "\n";
        msg+="Apellidos, Nombre: " +this.apellidos + ", "+this.nombre;
        return msg;
    }
    
    public double calcularNomina(){
        return this.salarioBase - this.irpf*this.salarioBase;
    }
    //sobrecargar metodos:
    //incrementa el salario del empleado en una cantidad (int)
    public void subirSalario(int subida){
        this.salarioBase+=subida;
    }
    //metodo que incrementa el salario del empleado en un porcentaje, lo recibimos como 0.05
    public void subirSalario(double porcentaje){
        this.salarioBase=this.salarioBase*(1+porcentaje);
    }
    
    
}
