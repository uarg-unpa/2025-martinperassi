/*
Para utilizar Scanner primero debemos importarlo de la siguiente manera: import java.util.Scanner;

Una vez importado Scanner debemos crear un objeto de tipo Scanner para poder utilizarlo en el futuro, podemos darle el nombre que queramos;

Scanner scanner = new Scanner(System.in);

Scanner nos sirve para leer datos del teclado y posteriormente mostrarlos en pantalla, tenemos distintos tipos de Scanner:
1.scanner.nextInt() --> para leer enteros
2.scanner.nextDouble() --> para leer reales
3.scanner.nextLine() --> para leer cadenas
4.scanner.nextChar() --> para leer caracteres 
5.scanner.nextBoolean() --> para leer booleanos(true or false) 
6.scanner.nextFloat() --> para leer flotantes
7.scanner.nextLong() --> para leer long
8.scanner.nextShort() --> para leer short
9.scanner.nextByte() --> para leer byte
10.scanner.next() --> para leer una palabra
11.scanner.nextBigInteger() --> para leer bigInteger
12.scanner.nextBigDecimal() --> para leer bigDecimal
13.scanner.nextLine().charAt(0) --> para leer un caracter (otra forma)

algunos metodos utiles:
1.scanner.close() --> para cerrar el scanner
2.scanner.hasNextInt() --> para verificar si hay un siguiente entero

EJEMPLOS A CONTINUACION(IMPORTAR SCANNER, DECLARACION DE OBJETO DE TIPO SCANNER, uso de scanner y metodo hasNext()):
 * 
 * import java.util.Scanner;

* 
 */

import java.util.Scanner;

public class EjemploHasNextInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        if (scanner.hasNextLine()) {
            String nombre = scanner.nextLine();
            System.out.println("Hola " + nombre);
            scanner.nextLine(); // Limpia el buffer
        } else {
            System.out.println("Ingresa un nombre valido");
        }
        System.out.println("ingrese su edad: ");
        if(scanner.hasNextInt()){
            int edad = scanner.nextInt();
            scanner.close();
            
        }else{
            System.out.println("el valor ingresado no es un numero");
            return;
        }

        scanner.close();
    }
}