package org.example.practica3;

import org.example.practica2.Fecha;

public interface Cancion {
    String getNombre();
    String getInterprete();
    Integer getDuracion();
    Fecha getFechaLanzamiento();
    String getGenero();
    Integer getNumReproducciones();
    void setNumReproducciones(Integer numReproducciones);
    Double getCalificacion();
    void setCalificacion(Double calificacion);
    Boolean getReproducir();
    void setReproducir(Boolean reproducir);

}
