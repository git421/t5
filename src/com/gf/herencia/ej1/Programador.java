/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.herencia.ej1;

/**
 *modela las caracteristicas concretas de los empleados que son programadores
 * @author cissanal
 */
public class Programador extends Empleado{  //hereda de la clase empleado
    
    
    private double horas;
    private double precioHora;
    
    public Programador(){
        System.out.println("Se ha creado un programador");
    }

    public Programador(int numEmpleado, String nombre, String apellidos, double salarioBase, double irpf) {
        super(numEmpleado, nombre, apellidos, salarioBase, irpf);
        this.precioHora=10;
    }
    //con super podemos llamar al padre, aqui llamamos al constructor del padre
    //la primera linea de un constructor hijo debe ser la llamada al del padre

    public Programador(double horas, double precioHora, int numEmpleado, String nombre, String apellidos, double salarioBase, double irpf) {
        super(numEmpleado, nombre, apellidos, salarioBase, irpf);
        this.horas = horas;
        this.precioHora = precioHora;
    }
    //aqui es igual pero incorporamos los valores nuestros (horas precioHora)
    //los del padre se los damos con el super y luego le podemos dar otros aparte
    
    

    public double getHoras() {
        return horas;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    
    //en una clase hija podemos modificar un metodo de la clase de la que hereda
    //nueva implementacion del metodo heredado
    //aka override
    //
    
    @Override
    public double calcularNomina(){
        double base=super.calcularNomina(); //se puede usar la primera implementacion 
        return base + (this.horas*this.precioHora);
        
    }
    
    //sobreescritura del metodo heredado datosEmpleado
    
    @Override
    public String datosEmpleado(){
        String datosPersonales=super.datosEmpleado();
        datosPersonales+= "Horas trabajadas: " + this.horas + "( a" + this.precioHora+"€ \n";
        return datosPersonales;
    }
    
    
    //sobrecarga del metodo heredado subirSalario
    public void subirSalario(int newHoras, double newPrecioHora){
        this.salarioBase=this.salarioBase+(newHoras * newPrecioHora);
    }
    
    
}
