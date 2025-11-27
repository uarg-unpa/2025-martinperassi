package Recursividad;

public class Main {
    public static void main(String [] args){
        Factorial obj1 = new Factorial();

        System.out.print("calculando el factorial: ");
        System.out.println(obj1.factorial(5));
        System.out.println();

        Puzzle obj2 = new Puzzle();
        System.out.println("puzzle: ");
        System.out.print("caso 1: ");
        System.out.println(obj2.puzzle(14, 10));
        System.out.print("caso 2: ");
        System.out.println(obj2.puzzle(4, 7));
        System.out.print("caso 3: ");
        System.out.println(obj2.puzzle(0, 0));
        System.out.println();


        int x, y,z;
        Concurso obj3 = new Concurso();
        System.out.print("caso 1: ");
        System.out.println( x = obj3.concurso(0, 3));
        System.out.print("caso 2: ");
        System.out.println( y = obj3.concurso(10, 7));
        System.out.print("caso 3: ");
        System.out.println(z = obj3.concurso(5, 50));
        System.out.println();

        Potencia obj4 = new Potencia();
        System.out.println(obj4.potencia(3, 2));

        Sumatoria obj5 = new Sumatoria();

        System.out.println(obj5.sumatoria(5));

        System.out.println("Sumatoria de numeros pares ");
        SumatoriaPares obj6 = new SumatoriaPares();
        System.out.println(obj6.sumatoriaPares(10));
        System.out.println();

        Funcion obj7 = new Funcion();
        System.out.println("funcion: ");
        System.out.println(obj7.funcion(8, 6));
        System.out.println(obj7.funcion(100, 10));
        System.out.println();

        Vocales obj8 = new Vocales();
        System.out.println("vocales");
        System.out.println(obj8.vocales("martin"));
        System.out.println();

        Sumatoria2 obj9 = new Sumatoria2();
        System.out.print("sumatoria: ");
        System.out.println(obj9.sumatoria(5));
        System.out.println();

        int[] vector = new int[5];
        vector[0] = 0;
        vector[1] = 4;
        vector[2] = 2;
        vector[3] = 3;
        vector[4] = 4;

        Busqueda obj10 = new Busqueda();
        System.out.println("Buscando coincidencias...");
        System.out.println(obj10.determinarNum(2, vector, 2));
        System.out.println();


        Menor obj11 = new Menor();
        System.out.println("minimo");
        System.out.println(obj11.menor(vector, 0));
        System.out.println();

        Ocurrencias obj12 = new Ocurrencias();
        System.out.println("contador de ocurrencias: ");
        System.out.println(obj12.ocurrencias(vector, 4, 0));


    }
}
