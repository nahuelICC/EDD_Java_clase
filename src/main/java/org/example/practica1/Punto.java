package org.example.practica1;

public interface Punto {
    //Contrato de métodos a implementar.
    //1º Consultables y modificables.
    //getters consulta setters modificación
    Double getX();
    void setX(Double x1);
    Double getY();
    void setY(Double y1);
    //métodos
    Double distanciaADosPuntos(Punto p);
}
