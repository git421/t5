/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.automovil;

/**
 *
 * @author cissanal
 */
public class Automovil {

    private String Matricula;
    private String Marca;
    private String Modelo;
    private int Potencia;
    private double Deposito; //cantidad actual en l
    private boolean Arrancado;
    private int Velocidad;//kmph
    private int VelocidadMax;
    private int CapacidadDeposito;//capacidad max en l
    private int Capacidad; //gente max
    private int Pasajeros;
    
    public Automovil(String Matricula, int Capacidad, int VelocidadMax, int CapacidadDeposito){
        this.Matricula=Matricula;
        this.Capacidad=Capacidad;
        this.VelocidadMax=VelocidadMax;
        this.CapacidadDeposito=CapacidadDeposito;
        
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setPotencia(int Potencia) {
        this.Potencia = Potencia;
    }

    public void setDeposito(double Deposito) {
        this.Deposito = Deposito;
    }

    public void setArrancado(boolean Arrancado) {
        this.Arrancado = Arrancado;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public void setVelocidadMax(int VelocidadMax) {
        this.VelocidadMax = VelocidadMax;
    }

    public void setCapacidadDeposito(int CapacidadDeposito) {
        this.CapacidadDeposito = CapacidadDeposito;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public void setPasajeros(int Pasajeros) {
        this.Pasajeros = Pasajeros;
    }

    public String getMatricula() {
        return Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getPotencia() {
        return Potencia;
    }

    public double getDeposito() {
        return Deposito;
    }

    public boolean isArrancado() {
        return Arrancado;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public int getVelocidadMax() {
        return VelocidadMax;
    }

    public int getCapacidadDeposito() {
        return CapacidadDeposito;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public int getPasajeros() {
        return Pasajeros;
    }

    @Override
    public String toString() {
        return "Deposito=" + this.Deposito + "\n Velocidad=" + this.Velocidad + "\n Pasajeros=" + this.Pasajeros + '}';
    }

    public void Arrancar(){
        this.Arrancado=true;
    }
    public void Parar(){
        this.Arrancado=false;
        this.Velocidad=0;
    }
    public void Repostar(){
        if(this.Velocidad==0){
        this.Deposito=this.CapacidadDeposito;
        }
    }
    public void Acelerar(){
        if(this.Velocidad < this.VelocidadMax && this.Deposito>0 && this.Pasajeros>=1){
        this.Velocidad=this.Velocidad+10;
        this.Deposito=this.Deposito-0.5;    
        }
        
    }
    public void Decelerar(){
        if(this.Velocidad>0){
        this.Velocidad=this.Velocidad-5;    
        }
        
    }
    public void Entrar(){
        if(this.Velocidad==0){
        if(this.Pasajeros>=this.Capacidad){
            System.err.println("Capacidad maxima alcanzada, no puede entrar nadie mas");
        }else{
            this.Pasajeros=this.Pasajeros+1;
        }
        }
    }
    public void Salir(){
        if(this.Velocidad==0){
        if(this.Pasajeros<=0){
            System.err.println("Capacidad minima alcanzada");
        }else{
            this.Pasajeros=this.Pasajeros-1;
        }
        }
    }
    


    
}
