/*
 * 5. Ingresar un día de la semana y si se trata de uno de los días de la cátedra resolución escribir “HOY TENGO RESOLUCION”.
 * Identificando a los días de la siguiente manera: ‘L’ para Lunes, ‘M’ para Martes, ‘I’ para Miércoles, ‘J’ para Jueves, ‘V’ para Viernes, ‘S’ para Sábado y ‘D’ para Domingo. 
 * Se puede agregar el caso dónde la letra ingresada no sea alguna de las nombradas anteriormente. 
 */

package Tp_1;
import java.util.Scanner;

public class Punto_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el día de la semana (L, M, I, J, V, S, D): ");
        char dia = scanner.nextLine().toUpperCase().charAt(0);

        // Supongamos que los días de resolución son Lunes, Miércoles y Viernes
        if (dia == 'M' || dia == 'I' || dia == 'J') {
            System.out.println("HOY TENGO RESOLUCION");
        } else if (dia == 'L' || dia == 'V' || dia == 'S' || dia == 'D') {
            System.out.println("Hoy NO tengo resolución");
        } else {
            System.out.println("Día ingresado no válido");
        }
    }

}
