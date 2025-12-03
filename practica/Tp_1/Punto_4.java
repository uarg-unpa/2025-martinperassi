/*
 * 4. Dado tres números, escribir el mayor de ellos. Asumir que los tres números son distintos. 
 */

package Tp_1;
import java.util.Scanner;

public class Punto_4 {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int num;
        int numMayor = Integer.MIN_VALUE; // Asegura que cualquier número ingresado será mayor

        while(contador < 3){
            System.out.println("ingrese un numero");
            if(scanner.hasNextInt()){
                num = scanner.nextInt();
                    if(num > numMayor){
                            numMayor = num; 
                    }
                    contador++;
            }else{
                System.out.println("ingresa un valor valido");
                scanner.next();
            }
        }
        System.out.println("el numero mayor es: " + numMayor);
        scanner.close();
    }
}