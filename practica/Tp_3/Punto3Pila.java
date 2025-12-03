package Tp_3;

public class Punto3Pila {
    //ATRIBUTOS
    private char[] caracteres;
    private int max_elementos = 10;
    private int cima;

    //CONSTRUCTOR
    Punto3Pila(){
        this.caracteres = new char[max_elementos];
        this.cima = -1;
    }

    //METODOS
    //METODOS
    //1 meter
    public String meter(char letra){
        cima++;
        caracteres[cima] = letra;
        return ("Elemento ingresado: " + letra);
    }

    //2 sacar
    char aux;
    public char sacar(){
        aux = caracteres[cima];
        cima--;
        return aux;
    }

    //3 estaLlena
    public boolean estaLlena(){
        return (cima == max_elementos - 1);
    }

    //4 estaVacia
    public boolean estaVacia(){
        return cima == -1;
    }
}
