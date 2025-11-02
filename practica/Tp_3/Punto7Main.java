package Tp_3;

public class Punto7Main {
    public static void main(String[] args) {
        Punto7Pila pila = new Punto7Pila();

        pila.meter("martin");
        pila.meter("cristina");
        pila.meter("ezequiel");
        pila.meter("daniel");
        pila.meter("cristobal");

        Punto7Pila pila_aux = new Punto7Pila();
        while(!pila.estaVacia()){
            String aux = pila.sacar();
            pila_aux.meter(aux);
        }


        Punto7Pila pila_copia = new Punto7Pila();

        while(!pila_aux.estaVacia()){
            String aux;
            aux = pila_aux.sacar();
            pila.meter(aux);
            pila_copia.meter(aux);
        }

        

        




    }
}
