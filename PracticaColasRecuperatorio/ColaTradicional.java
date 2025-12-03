package PracticaColasRecuperatorio;

public class ColaTradicional {
    
    //Atributos
    private int [] vector;
    private int max_elementos = 10;
    private int ultimo;
    private int frente;

    //constructor
    ColaTradicional(){
        this.vector = new int[max_elementos];
        this.ultimo = -1;
        this.frente = 0;
    }

    //metodos
    public boolean estaVacia(){
        return ultimo == -1;
    }

    public boolean estaLlena(){
        return ultimo == max_elementos - 1;
    }

    public int meter(int elemento){
        if(!estaLlena()){
            ultimo++;
            vector[ultimo] = elemento;
            return elemento;
        }else{
            return -1;
        }
    }

    public int sacar(){
        if(!estaVacia()){
            int aux = vector[0];
                for(int i = 0; i < ultimo; i++){
                    vector[i] = vector[i + 1];
                }
                ultimo--;
                return aux;
        }else{
            return -1;
        }
    }

    //consigna 4
    public int contar(){
        return ultimo + 1;
    }

    //consigna 5
    public void eliminarRepetidos() {
        ColaTradicional auxiliar = new ColaTradicional(); 
        int[] vistos = new int[max_elementos]; 
        int indiceVistos = 0;

        while (!estaVacia()) {
            int elemento = sacar();
            boolean esRepetido = false;
            for (int i = 0; i < indiceVistos; i++) {
                if (vistos[i] == elemento) {
                    esRepetido = true;
                    break;
                }
            }
            if (!esRepetido) {
                vistos[indiceVistos++] = elemento; 
                auxiliar.meter(elemento);
            }
        }

        while (!auxiliar.estaVacia()) {
            meter(auxiliar.sacar());
        }
    }

    //consigna 6
    public boolean sonIguales(ColaTradicional cola){

        if(this.ultimo != cola.ultimo){
            return false;
        }

        ColaTradicional colaAux1 = new ColaTradicional();
        ColaTradicional colaAux2 = new ColaTradicional();

        boolean iguales = true;

        while(!this.estaVacia()){
            int aux1 = this.sacar();
            int aux2 = cola.sacar();

            if(aux1 != aux2){
               iguales = false; 
            }

        colaAux1.meter(aux1);
        colaAux2.meter(aux2);
        }

        //reconstruimos las colas

        while(!this.estaVacia()){
            this.meter(colaAux1.sacar());
            cola.meter(colaAux2.sacar());
        }

        //finalmente mretornamos si las colas son iguales tanto en tamaño como en elementos
        return iguales;
    }

    public void rotar(int n){
        if(n <= 0){
            System.out.println("error, n debe ser un numero mayor que 0");
        }else{
            for(int i = 0; i < n; i++){
            this.meter(this.sacar());
        }

        }
    }
}
