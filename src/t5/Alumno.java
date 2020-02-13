/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5;

import java.util.Objects;

/**
 *
 * @author cissanal
 */
public class Alumno {
    //atributos
    private int numMatricula; //los atributos tienen que ser privados, si queremos trabajar con sus datos desde fuera 
    private String nombre;  //tenemos que hacer un metodo publico
    private int edad;
    private double nota;
    
    
    public Alumno(int numMatricula, String nombre) {
        this.numMatricula = numMatricula;
        this.nombre = nombre;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numMatricula=" + numMatricula + ", nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.numMatricula;
        hash = 97 * hash + Objects.hashCode(this.nombre);
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
        //suponiendo que no es ha entrado antes
        //entonces tenemos 2 obj alumno distintos
        final Alumno other = (Alumno) obj;
        if (this.numMatricula != other.numMatricula) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if(this.edad!=other.edad) return false;
        if(this.nota!=other.nota) return false;
        
        return true;
    }

    
    
    
    
    
    
}
