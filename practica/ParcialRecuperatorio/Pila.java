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
        Pila pilaRepetidos = new Pila();

        while(!this.estaVacia()){

            int aux1 = this.sacar();
            int aux2 = this.sacar();

            pilaAux.meter(aux1);
            pilaAux.meter(aux2);

            if(aux1 == aux2){
                pilaRepetidos.meter(pilaAux.sacar());
                pilaRepetidos.meter(pilaAux.sacar());
            }
        }

        //reconstruimos la pila original sin los repetidos consecutivos
        while(!pilaAux.estaVacia()){
            int aux = pilaAux.sacar();
            this.meter(aux);
        }
    }

}
