/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.banco;

import java.util.Objects;

/**
 *
 * @author cissanal
 */
public class Cliente {
    private int Cod=0;
    private String DNI;
    private String NombreApellidos;
    private String Direccion;
    private int Telefono;
    private CuentaBancaria CuentaBancaria;
    public static int contCli;
    
    public Cliente(String DNI, String NombreApellidos)throws Exception{
        if(DNI.isEmpty()||NombreApellidos.isEmpty()){
            throw new Exception("Error al crear cliente");//creamos una excepcion generica y pasamos como parametro un mensaje
        }else{
            contCli++;
            this.Cod=contCli;
            this.DNI = DNI;
            this.NombreApellidos = NombreApellidos;
            this.Direccion="";
            this.Telefono=0;
        }
    }
    
    
    
    
    

    public void setCuentaBancaria(CuentaBancaria CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }

    public CuentaBancaria getCuentaBancaria() {
        return CuentaBancaria;
    }

    public int getCod() {
        return Cod;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombreApellidos() {
        return NombreApellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setCod(int Cod) {
        this.Cod = Cod;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombreApellidos(String NombreApellidos) {
        this.NombreApellidos = NombreApellidos;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Cod=" + Cod + ", DNI=" + DNI + ", NombreApellidos=" + NombreApellidos + ", Direccion=" + Direccion + ", Telefono=" + Telefono +  '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.Cod;
        hash = 79 * hash + Objects.hashCode(this.DNI);
        hash = 79 * hash + Objects.hashCode(this.NombreApellidos);
        hash = 79 * hash + Objects.hashCode(this.Direccion);
        hash = 79 * hash + this.Telefono;
        hash = 79 * hash + Objects.hashCode(this.CuentaBancaria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        
        if (!Objects.equals(this.DNI, other.DNI)) {
            return false;
        }
        
        return true;
    }

    
    
    
    
    
}
