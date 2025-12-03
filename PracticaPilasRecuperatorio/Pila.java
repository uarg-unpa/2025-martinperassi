package PracticaPilasRecuperatorio;

public class Pila {
    
    //atributos
    private Auto[] autos;
    private int max_elementos = 10;
    private int cima;

    //Constructor
    Pila(){
        this.autos = new Auto[max_elementos];
        cima = -1;
    }

    //metodos
    public boolean estaVacia(){
        return cima == -1;
    }

    public boolean estaLlena(){
        return cima == max_elementos - 1;
    }

    public void meter(Auto auto){
        if(!this.estaLlena()){
            cima++;
            autos[cima] = auto;
        }else{
            System.out.println("la pila esta llena");
        }
    }

    public Auto sacar(){
        if(!estaVacia()){
            Auto aux = autos[cima];
            cima--;
            return aux;
        }else{
            System.out.println("La pila está vacía.");
            return null;
        }
    }
}
