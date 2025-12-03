package ParcialRecuperatorio;

public class Pila {
    //ATRIBUTOS
    private int maxElementos = 7;
    private int [] elementos;
    private int cima;
    //CONSTRUCTOR
    Pila(){
        this.elementos = new int[7];
        this.cima = -1;
    }
    //METODOS
    public boolean estaVacia(){
        return this.cima == -1;
    }
    public boolean estaLlena(){
        return this.cima == this.maxElementos -1;
    }
    public int meter(int elem){
        if(!this.estaLlena()){
            this.cima++;
            this.elementos[cima] = elem;
            return elem;
        }
        return -1;
    }

    public int sacar(){
        if(!this.estaVacia()){
            int aux = this.elementos[cima];
            this.cima--;
            return aux;
        }
        return -1;
    }

    public int verCima() {
        if (!this.estaVacia()) {
            return this.elementos[cima];
        }
        return -1; 
    }

    //-> metodo para eliminar duplicados consecutivos.
    public void eliminarDuplicados(){
        Pila pilaAux = new Pila();

        // 1. Pasamos elementos de la pila original a pilaAux.
        // eliminadmos duplicaadoos en caso de encontrar.
        while(!this.estaVacia()){
            int elementoActual = this.sacar();
            
            if(pilaAux.estaVacia() || elementoActual != pilaAux.verCima()){
                pilaAux.meter(elementoActual);
            } else {
                pilaAux.sacar();
            }
        }

        // 2. Devolvemos los elementos de pilaAux a la pila original.
        while(!pilaAux.estaVacia()){
            this.meter(pilaAux.sacar());
        }
    }

}
