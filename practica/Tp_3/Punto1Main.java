package Tp_3;

public class Punto1Main {
    public static void main(String[] args) {
        Punto1Pila pila1 = new Punto1Pila();

        // System.out.println(pila1.meter(1));
        // System.out.println(pila1.meter(2));
        // System.out.println(pila1.meter(3));
        // System.out.println(pila1.meter(4));
        // System.out.println(pila1.meter(5));

        // int x = 3;
        // int y = 5;
        // int z = 2;

        // pila1.meter(x);
        // pila1.meter(4);
        // x = pila1.sacar();
        // pila1.meter(y);
        // pila1.meter(3);
        // pila1.meter(z);
        // x = pila1.sacar();
        // pila1.meter(2);
        // pila1.meter(x);


        // while(!pila1.estaVacia()){
        //     x = pila1.sacar();
        //     System.out.println(x);
        // }

        //PUNTO 1.B
        int y = 1;
        pila1.meter(5);
        pila1.meter(7);
        int x = pila1.sacar();
        x+= y;
        pila1.meter(x);
        pila1.meter(y);
        pila1.meter(2);
        y = pila1.sacar();
        x = pila1.sacar();
        while(!pila1.estaVacia()){
            y = pila1.sacar();
            System.out.println(y);
        }

        System.out.println("X: " + x);
        System.out.println("Y: " + y);



        pila1.estaLlena();
        pila1.estaVacia();


    }
}
