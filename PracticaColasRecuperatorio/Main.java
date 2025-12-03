package PracticaColasRecuperatorio;

public class Main {
    public static void main(String[] args) {
        
        ColaTradicional obj1 = new ColaTradicional();
        // int x = 0;
        // int y = 1;
        // obj1.meter(x);
        // obj1.meter(y);
        // y = obj1.sacar();
        // int z = y + 5;
        // while(!obj1.estaVacia()){
        //     z = obj1.sacar();
        //     System.out.println(z);
        // }

        Pila pila = new Pila();
        int x = 0;
        int y = 1;
        int z = x + y;
        while(z < 10){
            if(z % 2 == 0){
                pila.meter(z);
            }else{
                obj1.meter(z);
            }
            x = y;
            y = z;
            z = x + y;
        }
        System.out.println("la pila contiene: ");
        while(!pila.estaVacia()){
            z = pila.sacar();
            System.out.println(z);
        }

        System.out.println("la cola contiene:");
        while(!obj1.estaVacia()){
            z = obj1.sacar();
            System.out.println(z);
        }

        obj1.meter(2);
        obj1.meter(3);
        obj1.meter(5);
        obj1.meter(8);
        obj1.meter(2);
        obj1.meter(3);

        System.out.print("cantidad de elementos en la cola: ");
        System.out.println(obj1.contar());
        System.out.println();

        System.out.println("eliminando repetidos...");
        obj1.eliminarRepetidos();
        System.out.println("mostrando cola sin repetidos...");
        while(!obj1.estaVacia()){
            int aux = obj1.sacar();
            System.out.println(aux);
        }

        ColaTradicional obj2 = new ColaTradicional();
        obj2.meter(2);
        obj2.meter(3);
        obj2.meter(5);
        obj2.meter(8);
        obj2.meter(2);
        obj2.meter(3);
        obj2.meter(6);


        System.out.println("Analizando si las colas son iguales en tamaño y elementos...");
        System.out.println(obj1.sonIguales(obj2));
        System.out.println();

        Pila pilaAux = new Pila();
        while(!pila.estaVacia()){

            int aux = pila.sacar();

            if(aux % 2 == 0){
                obj1.meter(aux);
            }else{
                pilaAux.meter(aux);
            }
        }

        //volvemos los elementos que no fueron colocados en la cola a la pila original
        while(!pilaAux.estaVacia()){
            pila.meter(pilaAux.sacar());
        }

        while(!obj1.estaVacia()){
            int aux = obj1.sacar();
            System.out.println(aux);
        }

        ColaTradicional COLA = new ColaTradicional();
        COLA.meter(10);
        COLA.meter(20);
        COLA.meter(30);
        COLA.meter(40);
        COLA.meter(50);

        COLA.rotar(1);

        while(!COLA.estaVacia()){
            System.out.println(COLA.sacar());
        }

    }
}
