/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gf.racional;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author coby
 */
public class Racional {
    private int num;
    private int den;
    
    
    public Racional(){    
    }
    
    public Racional(int num, int den){
        this.num=num;
        this.den=den;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }
    
    public double toDecimal(){
        NumberFormat nf=NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(2);
        double valor2dec=Double.parseDouble(nf.format(this.num/(double)this.den));
        return valor2dec;
    }
    
    public Racional producto(Racional r){
        int numP= this.num*r.num;
        int denP= this.den*r.den;
        Racional res = new Racional(numP,denP);
        
        return res.simplificar();
    }
    
    private Racional simplificar(){
        return new Racional(this.num/mcd(this.num,this.den), this.den/mcd(this.num,this.den));
    }
    
    private int mcd(int num1, int num2) {
        int a = 0;//es mejor hacer este tipo de comprobaciones
        if (num2 > num1) {//en el main, es la responsabilidad de quien llama al metodo de 
            a = num2;// pasar los valores correctamente
            num2 = num1;
            num1 = a;
        }
        int resto;
        int aux;
        do {
            resto = num1 % num2;
            if (resto != 0) {
                aux = num2;
                num2 = resto;
                num1 = aux;
            }
        } while (resto != 0);

        return num2;
    }
    
    
    
}
