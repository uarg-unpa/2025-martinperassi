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



    }
}
