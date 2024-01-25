package org.example.practica2;


import org.example.practica3.Cancion;
import org.example.practica3.CancionImp;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Fecha fechaVuelo = new FechaImp(1,1,2024);
//        Fecha fechaNacimiento = new FechaImp(1,1,1990);
        Persona piloto1 = new PersonaImp("Juan", "Ortiz Pérez",  "12345678C",fechaVuelo);
        Vuelo vuelo1 =  new VueloImp("1343b", "Barcelona", 56.4, 150, 89, fechaVuelo, piloto1);
        System.out.println(fechaVuelo);
        System.out.println(piloto1);
        System.out.println(vuelo1);
        System.out.println(vuelo1.getRecaudacion());
        Cancion c = new CancionImp("n","m","fluido",23, 2000,fechaVuelo, 11.0, Boolean.TRUE);

    }
}
