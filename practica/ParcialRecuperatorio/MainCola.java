package ParcialRecuperatorio;

public class MainCola {
    public static void main(String[] args) {
        Cola cola = new Cola();

        System.out.println("Cargando elementos en la cola: ");
        cola.meter(5);
        cola.meter(10);
        cola.meter(15);
        cola.meter(20);

        cola.rotar(2);
        System.out.println("Elementos de la cola después de rotar:");
        while(!cola.estaVacia()){
            int aux = cola.sacar();
            System.out.println(aux);
        }
    }
}
