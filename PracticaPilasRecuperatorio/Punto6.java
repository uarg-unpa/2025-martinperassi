package PracticaPilasRecuperatorio;

public class Punto6 {
    
//atributos
    private int max_elementos = 7;
    private int elementos[];
    private int cima;

    //constructor
    Punto6(){
        this.elementos = new int [max_elementos];
        this.cima = -1;
    }

    //metodos
    
    public boolean estaVacia(){
        return this.cima == -1;
    }

    public boolean estaLlena(){
        return this.cima == max_elementos - 1;
    }

    public int meter(int n){
        if(!this.estaLlena()){
            cima++;
            elementos[cima] = n;
            return n;
        }else{
            return -1;
        }
    }

    public int sacar(){
        if(!this.estaVacia()){
            int aux;
            aux = elementos[cima];
            cima--;
            return aux;
        }else{
            return -1;
        }
    }

}
