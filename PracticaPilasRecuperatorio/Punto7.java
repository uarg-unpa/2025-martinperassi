package PracticaPilasRecuperatorio;

public class Punto7 {
    
    //atributos
    private int max_elementos = 5;
    private int elementos[];
    private int cima;

    //constructor
    Punto7(){
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

    public Punto7 copiarPila(){

        Punto7 pilaAux = new Punto7();
        Punto7 pilaCopia = new Punto7();

        //Pasamos primero a la pila auxiliar
        while(!this.estaVacia()){
            pilaAux.meter(this.sacar());
        }

        //Pasamos a la Pila Copia y estauramos la Pila Original
        while(!pilaAux.estaVacia()){
            int x = pilaAux.sacar();
                this.meter(x);
                pilaCopia.meter(x);
        }

        //Retornamos la copia
        return pilaCopia;
    }


    public void mostrar(){
        for(int i = 0; i < elementos.length; i++){
            System.out.println(this.elementos[i]);
        }
    }
}
