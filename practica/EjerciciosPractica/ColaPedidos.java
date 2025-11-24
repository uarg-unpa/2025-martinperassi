package EjerciciosPractica;

public class ColaPedidos {

    private Pedido[] elementos;
    private int frente;
    private int fin;
    private int cantidad;
    private int maxElementos = 20;

    public ColaPedidos() {
        elementos = new Pedido[maxElementos];
        frente = 0;
        fin = -1;
        cantidad = 0;
    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    public boolean estaLlena() {
        return cantidad == maxElementos;
    }

    public void agregar(Pedido p) {
        if (!estaLlena()) {
            fin = (fin + 1) % maxElementos;
            elementos[fin] = p;
            cantidad++;
        }
    }

    public Pedido sacar() {
        if (!estaVacia()) {
            Pedido aux = elementos[frente];
            frente = (frente + 1) % maxElementos;
            cantidad--;
            return aux;
        }
        return null;
    }

    // ---------------------------------------------------
    // MÉTODO QUE PIDE EL EJERCICIO
    // ---------------------------------------------------
    public ColaPedidos pedidosMayoresA(double minimo) {

        ColaPedidos aux = new ColaPedidos();      // para restaurar la original
        ColaPedidos resultado = new ColaPedidos(); // cola de pedidos mayores

        // 1. Sacar todos los pedidos, filtrar y guardar temporalmente
        while (!this.estaVacia()) {
            Pedido p = this.sacar();
            aux.agregar(p);

            if (p.getImporte() > minimo) {
                resultado.agregar(p);
            }
        }

        // 2. Restaurar la cola original
        while (!aux.estaVacia()) {
            this.agregar(aux.sacar());
        }

        return resultado;
    }
}
