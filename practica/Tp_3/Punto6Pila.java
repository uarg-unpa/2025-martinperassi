package Tp_3;

public class Punto6Pila {

    //ATRIBUTOS
    private int[] numeros;
    private final int max_elementos = 10;
    private int cima;

    //CONSTRUCTOR
    Punto6Pila(){
        this.numeros = new int[max_elementos];
        this.cima = -1;
    }

    //METODOS
    public boolean estaVacia(){
        return(cima == -1);
    }

    public boolean estaLlena(){
        return(cima == max_elementos - 1);
    }

    public void meter(int numero){
        cima++;
        numeros[cima] = numero; 
        System.out.println("elemeto ingresado: " + numero);
    }

    int aux = 0;
    public int sacar(){
        aux = numeros[cima];
        cima--;
        return aux;
    }

}
