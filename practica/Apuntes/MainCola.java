package Apuntes;

public class MainCola {
    public static void main(String[] args) {
        ApuntesCola cola = new ApuntesCola();

        while (!cola.estaLlena()) {
            cola.meter(1);
            cola.meter(2);
            cola.meter(3);
            cola.meter(4);
            cola.meter(5);
            cola.meter(6);
        }

        
    }
}
