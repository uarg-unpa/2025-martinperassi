package Colas;

public class ApuntesCola {
    //ATRIBUTOS
    private int ultimo; //indica ultima posicion ocupada.
    private int [] elementos; //vector donde almacenamos elementos de la cola
    private int maxcola = 5; //tamaño maximo.

    //CONSTRUCTOR
    ApuntesCola(){
        ultimo = -1;
        elementos = new int[maxcola];
    }

    //Explicacion:
    // se crea un arreglo de 5 posiciones
    // ultimo = -1 significa que la cola esta vacia(no hay elementos aun)
    //NOTA: ultimo se puede interpretar como cima tambien.

    //METODOS
    public boolean estaVacia(){
        return(ultimo == -1);
    } // si ultimo = -1 --> no hay elementos en la cola.
    
    public boolean estaLlena(){
        return(ultimo == maxcola - 1);
    } //como las posiciones van de 0 a 4, cuando ultimo = -4 la cola estara llena.

    //meter elemento
    public int meter(int elem){
        if(!this.estaLlena()){
            ultimo++;
            elementos[ultimo] = elem;
            return elem;
        }else{
            System.out.println("Cola llena, no se puede meter el elemento " + elem + ".");
            return -1;
        }
    }

    //



}
