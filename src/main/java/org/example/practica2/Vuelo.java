package org.example.practica2;

public interface Vuelo {
    String getDestino();
    Double getPrecio();
    void setPrecio(Double precio);
    Integer getNumPlazas();
    Integer getNumPasajeros();
    void setNumPasajeros(Integer numPasajeros);
    Fecha getFechaSalida();
    Persona getPiloto();
    void setPiloto(Persona piloto);
    Double getRecaudacion();

}
