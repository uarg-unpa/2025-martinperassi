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
    public void eliminarDuplicados() {
        Pila pilaAux = new Pila();

        while (!this.estaVacia()) {
            int actual = this.sacar();

            if (pilaAux.estaVacia()) {
                pilaAux.meter(actual);
            } else {
                // Sacamos el elemento superior de la pila auxiliar para comparar
                int aux = pilaAux.sacar();

                if (aux != actual) {
                    // Si no son iguales, volvemos a meter ambos
                    pilaAux.meter(aux);
                    pilaAux.meter(actual);
                }
                // si son iguales, no metemos ninguno → duplicado eliminado
            }
        }

        // Reconstruimos la pila original en el mismo orden
        Pila pilaFinal = new Pila();
        while (!pilaAux.estaVacia()) {
            pilaFinal.meter(pilaAux.sacar());
        }
        while (!pilaFinal.estaVacia()) {
            this.meter(pilaFinal.sacar());
        }
    }




}
