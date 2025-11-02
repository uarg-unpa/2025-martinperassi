package Tp_3;

public class Punto7Pila {
    //ATRIBUTOS
    private String [] nombres;
    private final int max_nombres = 5;
    private int cima;

    //CONSTRUCTOR
    Punto7Pila(){
        this.nombres = new String[max_nombres];
        this.cima = -1;
    }

    //METODOS
    public boolean estaVacia(){
        return cima == -1;
    }

    public boolean estaLlena(){
        return cima == max_nombres - 1;
    }

    public String meter(String nombre){
        cima++;
        this.nombres[cima] = nombre;
        return nombre;
    }

    public String sacar(){
        String aux;
        aux = nombres[cima];
        cima--;
        return aux;
    }

    
}
