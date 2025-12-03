package ParcialRecuperatorio;

public class MainPila {
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.meter(2);
        pila.meter(2);
        pila.meter(3);
        pila.meter(4);
        pila.meter(5);
        pila.meter(5);

        pila.eliminarDuplicados();

        while(!pila.estaVacia()){
            int aux = pila.sacar();
            System.out.println(aux);
        }


    }
}
