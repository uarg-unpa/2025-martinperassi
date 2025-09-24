package Tp_1;
import java.util.Scanner;

/*6. Leer tres números enteros dentro de las variables NUM1, NUM2 y NUM3 respectivamente y calcular e imprimir el producto y la suma de ellos. 
Repita la operación anterior, pero esta vez, para los tres valores utilizar una sola variable (NUM). 
 * 
 */


public class Punto_6 {
    public static void main(String[] args){
        int num;
        int contador_suma = 0;
        int suma = 0;
        int producto = 1;
        int contador_producto = 0;
        Scanner scanner = new Scanner(System.in);

        while(contador_suma < 3){
            System.out.print("ingresa un numero: ");
            num = scanner.nextInt();
            suma = suma + num;
            contador_suma++;
        }
        System.out.print("suma de los 3 numeros es: " + suma);
        System.out.println();

        while(contador_producto < 3){
            System.out.print("ingresa un numero: ");
            num = scanner.nextInt();
            producto = producto * num;
            contador_producto++;
        }
        scanner.close();
        System.out.print("producto de los 3 numeros es: " + producto);

    }
}
