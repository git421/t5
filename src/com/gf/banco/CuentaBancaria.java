/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.banco;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Objects;

/**
 *
 * @author cissanal
 */
public class CuentaBancaria {

    private String NumCuenta;
    private double Saldo;
    private LocalDate FechaApertura;
    private Cliente Cliente;
    private DateTimeFormatter dtf;

    public CuentaBancaria(String NumCuenta, Cliente c) throws Exception {
        if (c == null || NumCuenta.isEmpty()) {
            throw new Exception("Error al crear cuenta");
        } else {
            this.NumCuenta = NumCuenta;
            this.Saldo = 0.0;
            this.FechaApertura = LocalDate.now();
            this.Cliente = c;
            dtf=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        }
    }

    public CuentaBancaria(String NumCuenta, double Saldo, String FechaApertura, Cliente c) {
        this.NumCuenta = NumCuenta;
        this.Saldo = Saldo;
        this.FechaApertura = LocalDate.parse(FechaApertura);//2007-12-03 formato por defecto
        this.Cliente = c;
    }

    public String getNumCuenta() {
        return NumCuenta;
    }

    public DateTimeFormatter getDtf() {
        return dtf;
    }

    public void setDtf(DateTimeFormatter dtf) {
        this.dtf = dtf;
    }

    public double getSaldo() {
        return Saldo;
    }

    public LocalDate getFechaApertura() {
        return FechaApertura;
    }

    public void setNumCuenta(String NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public void setFechaApertura(LocalDate FechaApertura) {
        this.FechaApertura = FechaApertura;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "NumCuenta=" + NumCuenta + ", Saldo=" + Saldo + ", FechaApertura=" + FechaApertura + ", Cliente=" + Cliente.getNombreApellidos() + '}';
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
        final CuentaBancaria other = (CuentaBancaria) obj;
        if (this.NumCuenta != other.NumCuenta) {
            return false;
        }
        if (Double.doubleToLongBits(this.Saldo) != Double.doubleToLongBits(other.Saldo)) {
            return false;
        }
        if (!Objects.equals(this.FechaApertura, other.FechaApertura)) {
            return false;
        }
        if (!Objects.equals(this.Cliente, other.Cliente)) {
            return false;
        }
        return true;
    }

    public void Ingresar(double ingreso) {
        if (ingreso > 0) {
            this.Saldo = this.Saldo + ingreso;
        } else {
            System.err.println("La cantidad introducida no es valida");
        }
    }

    public void Reintegrar(double reintegro) {
        if (reintegro > 0) {
            if (this.Saldo - reintegro >= 0) {

                this.Saldo = this.Saldo - reintegro;
            } else {
                System.err.println("La cantidad introducida no es valida");
            }
        }
    }

    public void Intereses() {
        this.Saldo = this.Saldo * 1.02;
    }
}
