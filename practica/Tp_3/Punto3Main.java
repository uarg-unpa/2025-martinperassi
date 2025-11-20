package Tp_3;

public class Punto3Main {
    public static void main(String[] args) {
        Punto3Pila pila1 = new Punto3Pila();

        String nombre = "soledad";

        char x;
        for(int i = 0; i < nombre.length(); i++){
            pila1.meter(nombre.charAt(i));
        }

        System.out.print("nombre: ");
        while(!pila1.estaVacia()){
            x = pila1.sacar();
            System.out.print(x + " ");
        }

    }
}
