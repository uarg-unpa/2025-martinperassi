package Tp_3;

public class Punto5Main {
    public static void main(String[] args) {
        Punto5Pila pila = new Punto5Pila();
        pila.meter(23);
        pila.meter(12);
        pila.meter(4);

        // -> while para sacar los elementos y mostrarlos en pantalla.
        int x;
        while(!pila.estaVacia()){
            x = pila.sacar();
            System.out.println(x);
        }

        // -> mostrar el elemento cima.
        System.out.print("elemento cima:");
        pila.elemento_cima();

        //Pruebas para ver si los metodos estaLlena y estaVacia funcionan
        System.out.println(pila.estaLlena());
        System.out.println(pila.estaVacia());
    }


}
