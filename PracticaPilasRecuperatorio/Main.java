package PracticaPilasRecuperatorio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        int x = 3;
        int y = 5;
        int z = 2;

        Punto1 obj1 = new Punto1();
        System.out.println("Punto 1 a.");
        System.out.println(obj1.meter(x));
        System.out.println(obj1.meter(4));
        System.out.println(x = obj1.sacar());
        System.out.println(obj1.meter(y));
        System.out.println(obj1.meter(3));
        System.out.println(obj1.meter(z));
        System.out.println(x = obj1.sacar());
        System.out.println(obj1.meter(2));
        System.out.println(obj1.meter(x));

        // -> sacamos y mostramos los elementos de la pila
        while(!obj1.estaVacia()){
            int aux = obj1.sacar();
            System.out.println(aux);    
        }

        System.out.println("Punto 3:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();
        for(int i = palabra.length() - 1; i >= 0; i--){
            System.out.print(palabra.charAt(i));
        }
        System.out.println();


        System.out.println("Punto 4:");
        Punto4 obj4 = new Punto4();
        obj4.meter(3);
        obj4.meter(3);
        obj4.meter(3);
        obj4.meter(3);
        obj4.meter(3);
        obj4.meter(3); // --> Desbordamiento
        System.out.println();

        Punto5 obj5 = new Punto5();
        obj5.meter(2);
        System.out.println("Punto 5");
        System.out.print("Elemento ubicado en la cima de la Pila: ");
        System.out.println(obj5.verCima());

        Punto6 obj6 = new Punto6();
        obj6.meter(10);
        obj6.meter(20);
        obj6.meter(30);
        obj6.meter(40);
        obj6.meter(50);
        obj6.meter(60);
        obj6.meter(70);
        System.out.println("Punto 6");
        //consigna a. asignar a x el 2do elemento de la pila comenzando por la cima, dejando a la pila sin sus 2 ultimos ultimos elementos
        System.out.println(obj6.sacar());
        System.out.println(x = obj6.sacar());
        //consigna b. asignar a x el 2do elemento de la pila comenzando por la cima, sin modificar la pila.
        int aux;
        System.out.println(aux = obj6.sacar());
        System.out.println(x = obj6.sacar());
        obj6.meter(x);
        obj6.meter(aux);
        //consigna c. Desde un entero positivo N, asignar a X el N-ésimo elemento desde la parte superior de la pila, dejando la pila sin sus N elementos de la parte superior.
        int n = 2;
        aux = obj6.sacar();
        x = obj6.sacar();
        //consigna d. d) Dado un entero positivo N, asignar a X el N-ésimo elemento desde la parte superior de pila, sin modificarla.
        System.out.println(aux = obj6.sacar());
        System.out.println(x = obj6.sacar());
        obj6.meter(x);
        obj6.meter(aux);

        Punto7 obj7 = new Punto7();
        obj7.meter(40);
        obj7.meter(2);
        obj7.meter(11);
        obj7.meter(450);
        obj7.meter(555);
        System.out.println("ejercicio 7");

        Punto7 copia = obj7.copiarPila();
        
        System.out.println("Pila Original:");
        obj7.mostrar();
        System.out.println();

        System.out.println("Pila Copia");
        copia.mostrar();
        System.out.println();

        System.out.println("ejercicio 8");
        Cadena cadena = new Cadena("ororo");
        System.out.println("Palabra a analizar: " + cadena.getTexto() + ", si es Palindromo devolvera True y si no lo es devolvera False...");
        System.out.println(cadena.esPalindromo());

        System.out.println("ejercicio 10:");
        Pila pilaAutos = new Pila();//creamos la pila

        Auto auto1 = new Auto("peugeot", "abc123");
        pilaAutos.meter(auto1);

        Auto auto2 = new Auto("ferrari", "fff321");
        pilaAutos.meter(auto2);        

        Auto auto3 = new Auto("lamborghini", "aaa673");
        pilaAutos.meter(auto3);

        Auto auto4 = new Auto("bmw", "ssd343");
        pilaAutos.meter(auto4);

        Auto auto5 = new Auto("audi", "zzz999");
        pilaAutos.meter(auto5);


        String eleccionModelo, eleccionPatente;

        System.out.println("Ingrese un auto:");
        System.out.print("Modelo:");
        eleccionModelo = scanner.nextLine();
        System.out.print("Patente:");
        eleccionPatente = scanner.nextLine();
        Auto auto6 = new Auto(eleccionModelo, eleccionPatente);
        pilaAutos.meter(auto6);
        System.out.println();

        System.out.println("Ingrese un auto:");
        System.out.print("Modelo:");
        eleccionModelo = scanner.nextLine();
        System.out.print("Patente:");
        eleccionPatente = scanner.nextLine();        
        Auto auto7 = new Auto(eleccionModelo, eleccionPatente);
        pilaAutos.meter(auto7);
        System.out.println();

        System.out.println("Ingrese un auto:");
        System.out.print("Modelo :");
        eleccionModelo = scanner.nextLine();
        System.out.print("Patente");
        eleccionPatente = scanner.nextLine();
        Auto auto8 = new Auto(eleccionModelo, eleccionPatente);
        pilaAutos.meter(auto8);
        System.out.println();
        
        System.out.println("Ingrese un auto:");
        System.out.print("Modelo:");
        eleccionModelo = scanner.nextLine();
        System.out.print("Patente:");
        eleccionPatente = scanner.nextLine();
        Auto auto9 = new Auto(eleccionModelo, eleccionPatente);
        pilaAutos.meter(auto9);
        System.out.println();

        System.out.println("Ingrese un auto:");
        System.out.print("Modelo:");
        eleccionModelo = scanner.nextLine();
        System.out.print("Patente:");
        eleccionPatente = scanner.nextLine();
        Auto auto10 = new Auto(eleccionModelo, eleccionPatente);
        pilaAutos.meter(auto10);



    }
}
