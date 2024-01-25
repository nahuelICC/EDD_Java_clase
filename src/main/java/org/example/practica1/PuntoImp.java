package org.example.practica1;

public class PuntoImp implements Punto{
    //1º Varibles
    private Double x;
    private Double y;
    //2º Contructor
    public PuntoImp(Double x, Double y){
        this.x=x;
        this.y=y;
    }
    //3º getters setters
    public Double getX() {
        return x;
    }
    public void setX(Double x){
        this.x=x;
    }
    public Double getY(){
        return y;
    }
    public void setY(Double y) {
        this.y = y;
    }
    //4º toSting
    public String toString(){
        return "("+getX()+","+getY()+")";
    }
    //5º métodos
    public Double distanciaADosPuntos(Punto p){
        return Math.sqrt(Math.pow((p.getX()- getX()), 2) + Math.pow((p.getY()-getY()), 2));
    }
    public static Double distanciaADosPuntos2(Punto p1, Punto p2){
        return Math.sqrt(Math.pow((p2.getX()- p1.getX()), 2) + Math.pow((p2.getY()-p1.getY()), 2));
    }
    public Double distanciaADosPuntos3(Punto p){
        return Math.sqrt(Math.pow((p.getX()- getX()), 2) + Math.pow((p.getY()-getY()), 2));
    }

}
