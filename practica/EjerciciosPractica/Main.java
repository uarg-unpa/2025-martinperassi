package EjerciciosPractica;

public class Main {
    public static void main(String[] args) {

        PilaLibros pila = new PilaLibros();

        pila.meter(new Libro("El Hobbit", "Tolkien", 310));
        pila.meter(new Libro("Silmarillion", "Tolkien", 420));
        pila.meter(new Libro("Narnia", "Lewis", 250));
        pila.meter(new Libro("El Señor de los Anillos", "Tolkien", 1000));
        pila.meter(new Libro("Mero Cristianismo", "Lewis", 280));

        System.out.println("---- Pila Original ----");
        PilaLibros mostrar = new PilaLibros();
        PilaLibros auxCopy = pila.filtrarPorAutor("NO EXISTE"); // solo para copiar
        // Forma correcta de imprimir sin romper:
        mostrar = pila.filtrarPorAutor("");

        // FILTRAR
        System.out.println("\nLibros de Tolkien:");
        PilaLibros filtrada = pila.filtrarPorAutor("Tolkien");

        while (!filtrada.estaVacia()) {
            System.out.println(filtrada.sacar());
        }

        System.out.println("\n---- Pila ORIGINAL restaurada ----");
        while (!pila.estaVacia()) {
            System.out.println(pila.sacar());
        }


        ColaPedidos cola = new ColaPedidos();

        cola.agregar(new Pedido("Martín", 2000));
        cola.agregar(new Pedido("Lucía", 4500));
        cola.agregar(new Pedido("Diego", 1500));
        cola.agregar(new Pedido("Agus", 7000));
        cola.agregar(new Pedido("Cami", 3200));

        System.out.println("---- Cola ORIGINAL ----");
        ColaPedidos copia = cola.pedidosMayoresA(-1); // truco solo para imprimir
        while (!copia.estaVacia()) {
            System.out.println(copia.sacar());
        }

        System.out.println("\nPedidos mayores a 3000:");
        ColaPedidos filtrada2 = cola.pedidosMayoresA(3000);
        while (!filtrada2.estaVacia()) {
            System.out.println(filtrada2.sacar());
        }

        System.out.println("\n---- Cola ORIGINAL restaurada ----");
        while (!cola.estaVacia()) {
            System.out.println(cola.sacar());
        }


    }
}
