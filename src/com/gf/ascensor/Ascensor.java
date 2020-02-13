/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.ascensor;

/**
 *
 * @author cissanal
 */
public class Ascensor {

    private int Piso;
    private int Pisos;
    private int Puertas;
    private boolean Alarma;
    private double Capacidad; //kilos max
    private double Ocupacion; //kilos actual

    public Ascensor(int Pisos, double Capacidad) {
        this.Pisos = Pisos;
        this.Capacidad = Capacidad;
        this.Piso = 0;
        this.Puertas = 0;
        this.Alarma = false;
        this.Ocupacion = 0.0;

    }

    public int getPiso() {
        return Piso;
    }

    public int getPisos() {
        return Pisos;
    }

    public int getPuertas() {
        return Puertas;
    }

    public boolean isAlarma() {
        return Alarma;
    }

    public double getCapacidad() {
        return Capacidad;
    }

    public double getOcupacion() {
        return Ocupacion;
    }

    public void setPiso(int Piso) {
        this.Piso = Piso;
    }

    public void setPisos(int Pisos) {
        this.Pisos = Pisos;
    }

    public void setPuertas(int Puertas) {
        this.Puertas = Puertas;
    }

    public void setAlarma(boolean Alarma) {
        this.Alarma = Alarma;
    }

    public void setCapacidad(double Capacidad) {
        this.Capacidad = Capacidad;
    }

    public void setOcupacion(double Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    @Override
    public String toString() {
        return "Ascensor{" + "Piso=" + Piso + ", Pisos=" + Pisos + ", Puertas=" + Puertas + ", Alarma=" + Alarma + ", Capacidad=" + Capacidad + ", Ocupacion=" + Ocupacion + '}';
    }

    public void cambiarPuertas() throws Exception { //0 cerradas, 1 frontal abierta, 2 trasera abierta, 3 todas abiertas, -1 error
        if (isAlarma()) {
            throw new Exception("Alarma Activada, puertas bloqueadas");
        } else {

            if (this.Puertas == 0) {

                if (this.Piso == 0) {
                    this.Puertas = 1;
                } else {
                    this.Puertas = 2;
                }
            } else {
                this.Puertas = 0;
            }
        }
    }

    public void entrarPersona(Persona persona) throws Exception {
        if (this.Puertas >= 1) {
            setOcupacion(Ocupacion + persona.getPeso());

            if (this.Ocupacion >= this.Capacidad) {
                throw new Exception("Error, capacidad superada");
            }
        }
    }

    public void salirPersona(Persona persona) {
        if (this.Puertas >= 1) {
            setOcupacion(Ocupacion - persona.getPeso());
            if (this.Ocupacion <= this.Capacidad) {
                setAlarma(false);
            }

        }
    }

    public void activarAlarma() {
        if (!isAlarma()) {
            setAlarma(true);
            System.err.println("ALARMA");
        } else {
            setAlarma(false);
            System.out.println("Alarma desactivada");
        }
    }

    public void moverPiso(int pisoInp) throws InterruptedException {
        if (pisoInp > 0 && pisoInp <= this.Pisos && !isAlarma()) {

            while (pisoInp != this.Piso) {
                Thread.sleep(1000);
                this.Puertas = 0;
                if (pisoInp > this.Piso) {
                    this.Piso++;
                    System.out.println("Piso: " + this.Piso);
//                    GUI_Ascensor.setSlider1(this.Piso);
                      

                } else {
                    this.Piso--;
                    System.out.println("Piso: " + this.Piso);
                }

            }
            if (this.Piso == 0) {
                this.Puertas = 1;
            }
            if (this.Piso > 0) {
                this.Puertas = 2;
            }
            System.out.println("Ha llegado al piso: " + this.Piso);

        } else {
            throw new InterruptedException("Error, no se puede mover");
        }
    }

}
