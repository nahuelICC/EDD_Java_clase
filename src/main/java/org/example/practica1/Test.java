package org.example.practica1;

public class Test {
    public static void main(String[] args) {
        //nombre interfaz n = new nombreClase(parametros)
        PuntoImp p1 = new PuntoImp(5.1, 2.4);
        Punto p2 = new PuntoImp(2.4, 5.1);
//        System.out.println(p1);
//        p1.setX(2.4);
//        p1.setY(5.1);
//        System.out.printf("El valor de x es: "+p1.getX()+"\n");
//        System.out.println("El valor de y es: "+p1.getY());
        System.out.println(p1.distanciaADosPuntos(p2));
        System.out.println(PuntoImp.distanciaADosPuntos2(p1,p2));
        System.out.println(p1.distanciaADosPuntos3(p2));


    }
}
