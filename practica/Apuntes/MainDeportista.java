package Apuntes;

public class MainDeportista {
    public static void main(String[] args) {

        //--> Creamos a los objetos deportistas.
        Deportista d1 = new Deportista("martin", 23, "voley", 23);
        Deportista d2 = new Deportista("cristina", 21, "voley", 50);

        //--> Mostrar datos.
        System.out.println(d1);
        System.out.println(d2);

        // --> Mostrar si son mayores de edad.
        System.out.println(d1.mayorDeEdad());
        System.out.println(d2.mayorDeEdad());

        //--> Mostrar el mayor puntaje.
        System.out.println(d1.compararPuntos(d2));

    }
}
