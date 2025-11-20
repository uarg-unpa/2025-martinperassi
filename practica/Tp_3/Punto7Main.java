package Tp_3;

public class Punto7Main {
    public static void main(String[] args) {
        // --> CREAMOS LA PILA ORIGINAL Y LE CARGAMOS SUS ELEMENTOS
        Punto7Pila pila = new Punto7Pila();

        pila.meter("martin");
        pila.meter("cristina");
        pila.meter("ezequiel");
        pila.meter("daniel");
        pila.meter("cristobal");

        // --> CREAMOS UNA PILA AUXILIAR Y POSTERIORMENTE UNA PILA COPIA, SIENDO LA PRIMERA PARA ALMACENAR LOS ELEMENTOS TEMPORALMENTE Y LA 2DA PARA REALIZAR LO QUE 
        //     NOS DICE EL ENUNCIADO.

        // --> AUXILIAR
        Punto7Pila pila_aux = new Punto7Pila();

        while(!pila.estaVacia()){
            String aux = pila.sacar();
            pila_aux.meter(aux);
        }

        // --> COPIA
        Punto7Pila pila_copia = new Punto7Pila();

        //PASAMOS LOS ELEMENTOS DE LA PILA AUXILIAR A LA PILA ORIGINAL Y A LA COPIA AL MISMO TIEMPO.
        while(!pila_aux.estaVacia()){
            String aux;
            aux = pila_aux.sacar();
            pila.meter(aux);
            pila_copia.meter(aux);
        }

    }
}
