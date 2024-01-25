package org.example.practica2;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Objects;

public class PersonaImp implements  Persona{
    private String nombre, apellidos, dni;
    private Fecha edad;

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public Integer getEdad() {

        return Period.between(LocalDate.of(this.edad.getAnyo(), this.edad.getMes(), this.edad.getDia()), LocalDate.now()).getYears();
    }

    @Override

    public String toString(){
        return nombre+ " "+ apellidos+", " + dni + ", " + edad + " años";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaImp that = (PersonaImp) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellidos, that.apellidos) && Objects.equals(dni, that.dni) && Objects.equals(edad, that.edad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, dni, edad);
    }

    public PersonaImp(String nombre, String apellidos, String dni, Fecha edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    public PersonaImp() {
    }

}
