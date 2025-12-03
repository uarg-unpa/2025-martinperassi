package PracticaEjerciciosRecursividadChatGpt;

public class Main {
    public static void main(String[] args) {

        int [] numeros = new int[5];
        numeros[0] = 3;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        Suma obj1 = new Suma();
        System.out.println("ejercicio 1");
        System.out.println(obj1.suma(numeros, 0));
        System.out.println();

        BuscarNumero obj2 = new BuscarNumero();
        System.out.println("ejercicio 2");
        System.out.println(obj2.buscar(numeros, 50 , 4));
        System.out.println();

        ContadorPares obj3 = new ContadorPares();
        System.out.println("ejercicio 3");
        System.out.println(obj3.contadorPares(numeros, 0));
        System.out.println();

        ProductoImpares obj4 = new ProductoImpares();
        System.out.println("ejercicio 4");
        System.out.println(obj4.ProductoImpares(numeros, 0));
        System.out.println();

        Fibonacci obj5 = new Fibonacci();
        System.out.println("ejercicio 5");
        System.out.println(obj5.secuenciaFibonacci(10));
        System.out.println();

        InvertirString obj6 = new InvertirString();
        System.out.println("ejercicio 6");
        System.out.println(obj6.invertirString("martin"));
        System.out.println();

        ContarNumerosDeUnNumero obj7 = new ContarNumerosDeUnNumero();
        System.out.println("ejercicio 7");
        System.out.println(obj7.contarDigitos(100));
        System.out.println();

        SumaVector obj8 = new SumaVector();
        int[] numeritos = new int[3];
        numeritos[0] = 90;
        numeritos[1] = 80;
        numeritos[2] = 70;
        System.out.println("ejercicio 8");
        System.out.println(obj8.sumaArreglo(numeritos, 0));
        System.out.println();



    }
}
