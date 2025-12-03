package PracticaRecuperatorio;

public class Main {
    public static void main(String[] args) {

        Puzzle obj1 = new Puzzle();
        System.out.println("ejercicio 1");
        System.out.println(obj1.puzzle(1, 3));
        System.out.println();

        Concurso obj2 = new Concurso();
        System.out.println("ejercicio 2:");
        System.out.println(obj2.concurso(0, 3));
        System.out.println(obj2.concurso(10, 7));
        System.out.println(obj2.concurso(5, 50));
        System.out.println();

        PotenciaYFactorial obj3 = new PotenciaYFactorial();
        System.out.println("ejercicio 3");
        System.out.println("potencia");
        System.out.println(obj3.potencia(3, 2));
        System.out.println();
        System.out.println("factorial");
        System.out.println(obj3.factorial(3));
        System.out.println();

        Sumatoria1 obj4 = new Sumatoria1();
        System.out.println("ejercicio 4");
        System.out.println("sumatoria");
        System.out.println(obj4.sumatoria(5));
        System.out.println();

        Sumatoria2 obj5 = new Sumatoria2();
        System.out.println("ejercicio 5");
        System.out.println("sumatoria de pares");
        System.out.println(obj5.sumatoria2(6));
        System.out.println();

        Funcion obj6 = new Funcion();
        System.out.println("ejercicio 6");
        System.out.println("funcion");
        System.out.println(obj6.funcion(5,2));
        System.out.println();

        Vocales obj7 = new Vocales();
        System.out.println("ejercicio 7");
        System.out.println("vocales");
        System.out.println(obj7.vocales("martin"));
        System.out.println();

        Ejercicio8 obj8 = new Ejercicio8();
        System.out.println("ejercicio 8");
        System.out.println("sumatoria de los primeros n naturales");
        System.out.println(obj8.sumatoria(5));
        System.out.println();

        int [] vector = new int[4];
        vector[0] = 0;
        vector[1] = 1;
        vector[2] = 2;
        vector[3] = 3;
        Coincidencia obj9 = new Coincidencia();
        System.out.println("ejercicio 9");
        System.out.println("coincidencia");
        System.out.println(obj9.coincidencia(vector, 0, 0));
        System.out.println();


        int [] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 2;
        numeros[2] = 4;
        numeros[3] = 2;
        numeros[4] = 10;
        ProductoPares pares = new ProductoPares();

        System.out.println("ejercicio de parcial recursividad");
        System.out.println("producto de numeros pares de un vector");
        System.out.println(pares.productopares(numeros, 0));
        System.out.println();

        int [] elementos = new int[4];
        elementos[0] = -200002;
        elementos[1] = -1100;
        elementos[2] = -1000000;
        elementos[3] = -100;

        Menor obj10 = new Menor();
        System.out.println("ejercicio 10");
        System.out.println("numero mas bajo dentro del vector");
        System.out.println(obj10.menor(elementos, 0));
        System.out.println();

        int[] ocurrencias = new int[4];
        ocurrencias[0] = 1;
        ocurrencias[1] = 1;
        ocurrencias[2] = 1;
        ocurrencias[3] = 1;

        Ocurencias obj11 = new Ocurencias();
        System.out.println("ejercicio 11");
        System.out.println("numero de ocurrencias en un vector");
        System.out.println(obj11.ocurrencias(ocurrencias, 1, 0));
        System.out.println();


    }
}
