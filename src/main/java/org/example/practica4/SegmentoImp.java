package org.example.practica4;

import java.util.Objects;

public class SegmentoImp {
    private Punto3D punto3D1, punto3D2;

    public Punto3D getPunto3D1() {
        return punto3D1;
    }

    public void setPunto3D1(Punto3D punto3D1) {
        if (punto3D1 == null){
            throw new IllegalArgumentException("El punto3D no puede ser nulo");
        }else this.punto3D1 = punto3D1;

    }

    public Punto3D getPunto3D2() {
        return punto3D2;
    }

    public void setPunto3D2(Punto3D punto3D2) {
        if (punto3D2 == null){
            throw new IllegalArgumentException("El punto3D no puede ser nulo");
        }else this.punto3D2 = punto3D1;
    }
    public Double getLongitud(){
        return punto3D1.distanciaADosPuntos3D(punto3D2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SegmentoImp that = (SegmentoImp) o;
        return Objects.equals(punto3D1, that.punto3D1) && Objects.equals(punto3D2, that.punto3D2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(punto3D1, punto3D2);
    }

    public SegmentoImp(Punto3D punto3D1, Punto3D punto3D2) {
        setPunto3D1(punto3D1);
        setPunto3D2(punto3D2);
    }

    public SegmentoImp() {
    }

    @Override
    public String toString() {
        return "["+this.punto3D1 + "," + this.punto3D2 + "]";
    }
}
