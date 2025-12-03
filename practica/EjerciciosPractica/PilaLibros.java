package EjerciciosPractica;

public class PilaLibros {

    private Libro[] elementos;
    private int cima;
    private int maxElementos = 20;

    public PilaLibros() {
        elementos = new Libro[maxElementos];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == maxElementos - 1;
    }

    public void meter(Libro libro) {
        if (!estaLlena()) {
            cima++;
            elementos[cima] = libro;
        }
    }

    public Libro sacar() {
        if (!estaVacia()) {
            Libro aux = elementos[cima];
            cima--;
            return aux;
        }
        return null;
    }

    // MÉTODO QUE PIDE EL EJERCICIO

    public PilaLibros filtrarPorAutor(String autorBuscado) {

        PilaLibros aux = new PilaLibros();      // para extraer sin perder orden
        PilaLibros resultado = new PilaLibros(); // pila final con los filtrados

        // 1. Pasar pila original a auxiliar
        while (!this.estaVacia()) {
            aux.meter(this.sacar());
        }

        // 2. Volver a la original y filtrar
        while (!aux.estaVacia()) {
            Libro libro = aux.sacar();

            // restauramos ORIGINAL
            this.meter(libro);

            // filtramos
            if (libro.getAutor().equals(autorBuscado)) {
                resultado.meter(libro);
            }
        }

        return resultado;
    }
}
