package ColaChatGpt;

public class Main {
    public static void main(String[] args) {
        
        Cola cola = new Cola();

        cola.meter(10);
        cola.meter(20);
        cola.meter(30);
        cola.meter(40);
        cola.meter(50);

        System.out.print("mayor elemento de la cola: ");
        System.out.println(cola.obtenerMayor(cola));

        System.out.print("menor elemento de la cola: ");
        System.out.println(cola.obtenerMenor(cola));

        System.out.println("buscar elemento dentro de la cola");
        System.out.println(cola.buscarElemento(30));

        System.out.print("suma de los elementos de la cola:");
        System.out.println(cola.sumaElementos());

        cola.meter(34);
        cola.meter(22);
        cola.meter(54);
        cola.meter(2);

        System.out.println("creando copia de la cola:");
        cola.copiarCola();


    }
}
