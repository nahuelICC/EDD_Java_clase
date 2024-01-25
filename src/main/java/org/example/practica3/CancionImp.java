package org.example.practica3;

import org.example.practica2.Fecha;

import java.util.Objects;

public class CancionImp implements Cancion{
    private String nombre, interprete, genero;
    private Integer duracion, numReproducciones;
    private Fecha fechaLanzamiento;
    private Double calificacion;
    private Boolean reproducir;

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getInterprete() {
        return interprete;
    }

    @Override
    public String getGenero() {
        return genero;
    }

    @Override
    public Integer getDuracion() {
        return duracion;
    }

    @Override
    public Integer getNumReproducciones() {
        return numReproducciones;
    }

    @Override
    public Fecha getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    @Override
    public Double getCalificacion() {
        return calificacion;
    }

    @Override
    public Boolean getReproducir() {
        return reproducir;
    }

    @Override
    public void setNumReproducciones(Integer numReproducciones) {
        this.numReproducciones = numReproducciones;
    }

    @Override
    public void setCalificacion(Double calificacion) {
        if(0.0<= calificacion && calificacion <= 10.0) {
            this.calificacion = calificacion;}
        else {
            throw new IllegalArgumentException("Calificaión no valida");
        }
    }

    @Override
    public void setReproducir(Boolean reproducir) {
        this.reproducir = reproducir;
    }

    @Override
    public String toString() {
        return "["+ this.nombre+","+this.interprete+"]";
    }

    public CancionImp(String nombre, String interprete, String genero, Integer duracion, Integer numReproducciones, Fecha fechaLanzamiento, Double calificacion, Boolean reproducir) {

        this.nombre = nombre;
        this.interprete = interprete;
        this.genero = genero;
        this.duracion = duracion;
        this.numReproducciones = numReproducciones;
        this.fechaLanzamiento = fechaLanzamiento;
        setCalificacion(calificacion);
        this.reproducir = reproducir;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CancionImp that = (CancionImp) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(interprete, that.interprete) && Objects.equals(genero, that.genero) && Objects.equals(duracion, that.duracion) && Objects.equals(numReproducciones, that.numReproducciones) && Objects.equals(fechaLanzamiento, that.fechaLanzamiento) && Objects.equals(calificacion, that.calificacion) && Objects.equals(reproducir, that.reproducir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, interprete, genero, duracion, numReproducciones, fechaLanzamiento, calificacion, reproducir);
    }
}
