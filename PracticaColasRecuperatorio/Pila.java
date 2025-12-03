package PracticaColasRecuperatorio;

public class Pila {
    private int [] numeros;
    private int max_elementos = 5;
    private int cima;

    Pila(){
        this.numeros = new int[max_elementos];
        this.cima = -1;
    }

    public boolean estaVacia(){
        return cima == -1;
    }

    public boolean estaLlena(){
        return cima == max_elementos - 1;
    }

    public int meter(int elemento){
        if(!estaLlena()){
            cima++;
            numeros[cima] = elemento;
            return elemento;
        }else{
            return -1;
        }
    }

    public int sacar(){
        if(!estaVacia()){
            int aux = numeros[cima];
            cima--;
            return aux;
        }else{
            return -1;
        }
    }


}
