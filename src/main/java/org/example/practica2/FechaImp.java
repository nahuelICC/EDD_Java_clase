package org.example.practica2;

import java.util.Objects;

public class FechaImp implements Fecha{
    private Integer dia, mes,anyo;

    @Override
    public Integer getDia() {
        return dia;
    }

    @Override
    public Integer getMes() {
        return mes;
    }

    @Override
    public Integer getAnyo() {
        return anyo;
    }

    @Override
    public String toString() {
        return this.dia+"/"+this.mes+"/"+this.anyo;
    }

    public FechaImp(Integer dia, Integer mes, Integer anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public FechaImp() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaImp fechaImp = (FechaImp) o;
        return Objects.equals(dia, fechaImp.dia) && Objects.equals(mes, fechaImp.mes) && Objects.equals(anyo, fechaImp.anyo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes, anyo);
    }
}
