package Tp_3;

public class Punto1Pila {
    //ATRIBUTOS
    private int[] numeros;
    private final int maxnumeros = 5;
    private int cima;

    //CONSTRUCTOR
    Punto1Pila(){
        this.numeros = new int[maxnumeros];
        this.cima = -1;
    }

    //METODOS
    //1 meter
    public String meter(int elemento){
        cima++;
        numeros[cima] = elemento;
        return ("Elemento ingresado: " + elemento);
    }

    //2 sacar
    int aux = 0;
    public int sacar(){
        aux = numeros[cima];
        cima--;
        return aux;
    }

    //3 estaLlena
    public boolean estaLlena(){
        return (cima == maxnumeros - 1);
    }

    //4 estaVacia
    public boolean estaVacia(){
        return cima == -1;
    }

}
