package Apuntes;
import java.util.Scanner;

public class Vehiculo {
    //ATRIBUTOS
    private String tipo;
    private int velocidadMaxima;
    private double precio;
    //CONSTRUCTOR

    Vehiculo(String tipo, int velocidadMaxima, double precio){
        this.tipo = tipo;
        this.velocidadMaxima = velocidadMaxima;
        this.precio = precio;
    }
    //GETTERS Y SETTERS

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    //METODOS
    public void aplicarDescuento(double porcentaje){
        System.out.println("precio inicial: $" + precio);
        double descuento = precio * porcentaje / 100;
        System.out.println("descuento: " + porcentaje + "% o: " + "$" + descuento);
        precio = precio - descuento;
        System.out.println("precio final: $" + precio);
    }

    public void aumentarVelocidadMaxima(int incremento){
        System.out.println("velocidad inicial: " + velocidadMaxima);
        velocidadMaxima = velocidadMaxima + incremento;
        System.out.println("velocidad final: " + velocidadMaxima);
    }

    public static int velocidadMaxima(int v1, int v2){
        if(v1 > v2){
            System.out.println("la velocidad maxima es: ");
            return v1;
        }else if(v1 == v2){
            System.out.println("las velocidaddes son iguales");
            return v1;
        }else{
            System.out.println("la velocidad maxima es: ");
            return v2;
        }
    }

    //MAIN  
    public static void main(String[] args){
        //PUNTO1.
        Vehiculo auto = new Vehiculo("auto", 150, 10000);
        Vehiculo moto = new Vehiculo("moto", 100, 5000);

        //PUNTO 2.
        auto.aplicarDescuento(20);
        System.out.println();
        moto.aplicarDescuento(50);

        //PUNTO 3.
        System.out.println();
        auto.aumentarVelocidadMaxima(5);

        //PUNTO4.
        System.out.println();
        System.out.println("velocidad maxima del auto: " + auto.getVelocidadMaxima());
        System.out.println("velocidad maxima de la moto: " + moto.getVelocidadMaxima());

        System.out.print(velocidadMaxima(auto.velocidadMaxima, moto.velocidadMaxima));

    }

}
