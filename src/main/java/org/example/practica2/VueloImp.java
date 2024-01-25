package org.example.practica2;

import java.util.Objects;

public class VueloImp implements Vuelo{
    private String codVuelo, destino;
    private Double precio;
    private Integer numPlazas, numPasajeros;
    private Fecha fechaSalida;
    private Persona piloto;

    public String getCodVuelo() {
        return codVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getNumPlazas() {
        return numPlazas;
    }

    public Integer getNumPasajeros() {
        return numPasajeros;
    }

    public Fecha getFechaSalida() {
        return fechaSalida;
    }

    public Persona getPiloto() {
        return piloto;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setNumPasajeros(Integer numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public void setPiloto(Persona piloto) {
        this.piloto = piloto;
    }

    public Double getRecaudacion(){
        return this.precio * this.numPasajeros;
    }

    public VueloImp(String codVuelo, String destino, Double precio, Integer numPlazas, Integer numPasajeros, Fecha fechaSalida, Persona piloto) {
        this.codVuelo = codVuelo;
        this.destino = destino;
        this.precio = precio;
        this.numPlazas = numPlazas;
        this.numPasajeros = numPasajeros;
        this.fechaSalida = fechaSalida;
        this.piloto = piloto;
    }

    public VueloImp() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VueloImp vueloImp = (VueloImp) o;
        return Objects.equals(codVuelo, vueloImp.codVuelo) && Objects.equals(destino, vueloImp.destino) && Objects.equals(precio, vueloImp.precio) && Objects.equals(numPlazas, vueloImp.numPlazas) && Objects.equals(numPasajeros, vueloImp.numPasajeros) && Objects.equals(fechaSalida, vueloImp.fechaSalida) && Objects.equals(piloto, vueloImp.piloto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codVuelo, destino, precio, numPlazas, numPasajeros, fechaSalida, piloto);
    }

    @Override
    public String toString() {
        return this.codVuelo + " - " + this.piloto.toString() + " - " + this.fechaSalida;
    }
}
