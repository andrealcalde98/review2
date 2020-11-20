/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.generics.collections;

import java.util.Objects;

/**
 *
 * @author pep
 * 
 * Comparable proporciona el orden natural de una clase
 * 
 */
public class Alumno implements Comparable<Alumno> {
    
    private String nombre;
    private int Edad;

    public Alumno(String nombre, int Edad) {
        this.nombre = nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return Edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", Edad=" + Edad + '}';
    }

    /*@Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + this.Edad;
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
        final Alumno other = (Alumno) obj;
        if (this.Edad != other.Edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }*/

    @Override
    public int compareTo(Alumno alumno) {
        return nombre.compareTo(alumno.nombre);
   
    }
    
}
