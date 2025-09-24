/*
 * 4. Dado tres números, escribir el mayor de ellos. Asumir que los tres números son distintos. 
 */

package Tp_1;
import java.util.Scanner;

public class Punto_4 {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, num_mayor;

        System.out.println("ingrese un numero:");
        if(scanner.hasNextInt()){
            num1 = scanner.nextInt();
        }else{
            System.out.println("ingrese un numero entero");
            return;
        }
        System.out.println("ingrese un numero:");
            if(scanner.hasNextInt()){
                num2 = scanner.nextInt();
        }else{
            System.out.println("ingrese un numero entero");
            return;
        }
        System.out.println("ingrese un numero:");
            if(scanner.hasNextInt()){
                num3 = scanner.nextInt();
        }else{
            System.out.println("ingrese un numero entero");
            return;
        }

        if(num1 >= num2 && num1 >= num3){
            num_mayor = num1;
        }
        else if(num2 >= num1 && num2 >= num3){
            num_mayor = num2;
        }else{
            num_mayor = num3;
        }

        scanner.close();
        System.out.println("el numero mayor es: " + num_mayor);
    }
}