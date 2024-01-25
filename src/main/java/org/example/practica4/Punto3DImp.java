package org.example.practica4;

import org.example.practica1.Punto;

import java.util.Objects;

public class Punto3DImp implements Punto3D{
    private Double x,y,z;

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        if (x==null){
            throw new IllegalArgumentException("Valor nulo");
        }
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        if (y==null){
            throw new IllegalArgumentException("Valor nulo");
        }
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        if (z==null){
            throw new IllegalArgumentException("Valor nulo");
        }
        this.z = z;
    }
    public Double distanciaADosPuntos3D(Punto3D p){
        return Math.sqrt(Math.pow((p.getX()- getX()), 2) + Math.pow((p.getY()-getY()), 2) + Math.pow((p.getZ()-getZ()), 2));
    }


    public Punto3DImp(Double x, Double y, Double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public Punto3DImp() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Punto3DImp that = (Punto3DImp) o;
        return Objects.equals(x, that.x) && Objects.equals(y, that.y) && Objects.equals(z, that.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "Punto3DImp{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
