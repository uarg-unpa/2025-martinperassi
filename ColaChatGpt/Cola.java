package ColaChatGpt;

public class Cola {
    
    private int[] vector;
    private int max_elementos = 10;
    private int frente;
    private int ultimo;

    Cola(){
        this.vector = new int[max_elementos];
        this.frente = 0;
        this.ultimo = -1;
    }

    public boolean estaVacia(){
        return ultimo == -1;
    }

    public boolean estaLlena(){
        return ultimo == max_elementos - 1;
    }

    public int meter(int elem){
        if(!this.estaLlena()){
            ultimo++;
            vector[ultimo] = elem;
            return elem;
        }else{
            return -1;
        }

    }

    public int sacar(){
        if(!this.estaVacia()){
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



public int obtenerMayor(Cola cola) {
    if (cola.estaVacia()) {
        return -1; // o tirar excepción
    }

    Cola aux = new Cola();
    int mayor;

    // Sacamos el primer elemento
    int primero = cola.sacar();
    mayor = primero;
    aux.meter(primero);

    // Procesamos el resto
    while (!cola.estaVacia()) {
        int actual = cola.sacar();
        if (actual > mayor) {
            mayor = actual;
        }
        aux.meter(actual);
    }

    // Restauramos la cola original:
    while (!aux.estaVacia()) {
        cola.meter(aux.sacar());
    }

    return mayor;
}

public int obtenerMenor(Cola cola){
    //caso en que la cola este vacia
    if(cola.ultimo == -1){
        return -1;
    }

    Cola colaAux = new Cola();
    int menor;

    int primero = cola.sacar();
    menor = primero;
    colaAux.meter(menor);

    while(!cola.estaVacia()){
        int aux = cola.sacar();
        if(aux < menor){
            menor = aux;
        }
        colaAux.meter(aux);
    }

    //reconstruimos la cola original
    while(!colaAux.estaVacia()){
        int aux = colaAux.sacar();
        cola.meter(aux);
    }

    return menor;
}

public boolean buscarElemento(int n){
    if(this.estaVacia()){
       return false; 
    }

    Cola colaAux = new Cola();

    boolean resultado = false;

    while(!this.estaVacia()){
        int aux = this.sacar();

        if(aux == n){
            resultado = true;
        }
        colaAux.meter(aux);
    }

    //reconstruimos la cola
    while(!colaAux.estaVacia()){
        this.meter(colaAux.sacar());
    }

    return resultado;
}

//suma de elementos de la cola

public int sumaElementos(){

    int suma = 0;
    Cola colaAux = new Cola();
    while(!this.estaVacia()){
        int aux = this.sacar();
        colaAux.meter(aux);
        suma = suma + aux;
    }
    //reconstruimos la cola
    while(!colaAux.estaVacia()){
        int aux = colaAux.sacar();
        this.meter(aux);
    }
    return suma;
}

public void copiarCola(){

    Cola colaAux = new Cola();
    Cola colaCopia = new Cola();

    //vaciamos la cola original
    while(!this.estaVacia()){
        colaAux.meter(this.sacar());
    }
    //volvemos a llenar la cola original y al mismo tiempo llenamos la copia 

    while(!this.estaLlena()){
        int aux = colaAux.sacar();
        this.meter(aux);
        colaCopia.meter(aux);
    }

    System.out.println("COLA ORIGINAL");
    while(!this.estaVacia()){
        int aux = this.sacar();
        System.out.println(aux);
    }

    System.out.println("COPIA DE LA COLA");
    while(!colaCopia.estaVacia()){
        int aux = colaCopia.sacar();
        System.out.println(aux);
    }

}

}
