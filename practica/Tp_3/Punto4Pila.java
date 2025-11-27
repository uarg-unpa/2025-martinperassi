package Tp_3;

public class Punto4Pila {
    //ATRIBUTOS
    private int[] numeros;
    private int max_elementos = 5;

    //CONSTRUCTOR
    Punto4Pila(){
        this.numeros = new int[max_elementos];
    }

    //METODOS
    int i = 0;
    public void meter(int elemento){
        numeros[i] = elemento;
        i++;
    }
}
