package PracticaColasRecuperatorio;

public class ColaCircular {
    private int[] elementos;
    private int frente;
    private int ultimo;
    private int cantidad;
    private final int MAX = 10;

    public ColaCircular() {
        elementos = new int[MAX];
        frente = 0;
        ultimo = 0;
        cantidad = 0;
    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    public boolean estaLlena() {
        return cantidad == MAX;
    }

    public void meter(int elem) {
        
            elementos[ultimo] = elem;
            ultimo = (ultimo + 1) % MAX;
            cantidad++;
        
    }

    public int sacar() {
      
            int aux = elementos[frente];
            frente = (frente + 1) % MAX;
            cantidad--;
            return aux;
        
    }

    public int getCantidad() {
        return cantidad;
    }

    public int verFrente() {
        return elementos[frente];
    }


}
