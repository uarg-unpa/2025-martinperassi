package ParcialRecuperatorio;

public class MainPila {
    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.meter(5);
        pila.meter(2);
        pila.meter(2);
        pila.meter(4);
        pila.meter(8);
        pila.meter(8);
        pila.meter(10);

        System.out.println("Eliminando elementos duplicados...");

        pila.eliminarDuplicados();

        System.out.println("Pila sin duplicados:");
        while(!pila.estaVacia()){
            System.out.println(pila.sacar());
        }

    }
}
