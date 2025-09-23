/*1. Contestar las siguientes consignas referentes a las operaciones de casting. 
 * Dadas las siguientes declaraciones de variables: 
 * int A, B, R1; 
 * double C, D, R2; 
 * Dadas las siguientes asignaciones:
 * A = 5
 * B = 3
 * C = 2.5
 * D = 2.0
 * 
 * Indicar que resultado tendrán las siguientes operaciones: 
 * R1 = A/B;
 * R2 = A/C;
 * R2 = A * D;
 * R1 = A *(int) D;
 * R1 = (int)(C*D);
 * R1 = A*(int)D;
 * A++;
 * B = A++;
 */
public class Punto_1 {
    public static void main(String[]args){
        int A,B,R1;
        double C,D,R2;

        A = 5;
        B = 2;
        C = 2.5;
        D = 2.0;

        R1 = A/B;
        System.out.println(R1);

        R2 = A/C;
        System.out.println(R2);

        R2 = A * D;
        System.out.println(R2);

        R1 = A *(int) D;
        System.out.println(R1);

        R1 = (int)(C*D);
        System.out.println(R1);

        R1 = A*(int)D;
        System.out.println(R1);

        A++;
        System.out.println(A);

        B = A++;
        System.out.println(B);

    }
}
