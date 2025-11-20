//5. Agregar a la clase Pila el método elementoCima() que retorne el elemento cima sin cambiar la pila. Nota: 
// no olvidar que si bien la pila se implementa como un arreglo, no debería manejarse como tal.



package Tp_3;

public class Punto5Pila {
    //ATRIBUTOS
    private int[] numeros;
    private int max_elementos = 6;
    private int cima;

    //CONSTRUCTOR
    Punto5Pila(){
        this.numeros = new int[max_elementos];
        this.cima = -1;
    }

    //METODOS
    public boolean estaLlena(){
        return(cima == max_elementos - 1);
    }

    public boolean estaVacia(){
        return(cima == -1);
    }

    public void meter(int numero){
        cima++;
        numeros[cima] = numero;
    }


    public int sacar(){
        int aux;
        aux = numeros[cima];
        cima--;
        return aux;
    }


    public int elemento_cima(){
        return numeros[cima];
    }

}
