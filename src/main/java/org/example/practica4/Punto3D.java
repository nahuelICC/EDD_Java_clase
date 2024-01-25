package org.example.practica4;

import org.example.practica1.Punto;

public interface Punto3D {
    Double getX();
    void setX(Double x);
    Double getY();
    void setY(Double y);
    Double getZ();
    void setZ(Double z);
    Double distanciaADosPuntos3D(Punto3D p);
}
