/*2. Resolver el siguiente ejercicio de igual manera que el punto anterior. 
Dadas las siguientes declaraciones de variables:  
int A, B, X; 
double C, D, Y; 
Dadas las siguientes asignaciones: 
A = 5; 
B = 3;
C = 7.5;
D = 2.0;

a) Indicar el valor de X e Y que resultado tendrán las siguientes operaciones: 
X = A / B 
X = (int) (A * D) / (int) (C / A) 
Y = A / B 
Y = (double) (A / B) 
Y = (double) A * D / (int) C 
Y = (double) A * D 
Y = (double) (A * D) / ( C * (int) D) 
Y = A * (int) D 
Y = (int) (A * (int) D) 
 */

package Tp_1;

public class Punto_2 {
    public static void main(String[] args) {
        int A, B, X; 
        double C, D, Y;

        A = 5; 
        B = 3;
        C = 7.5;
        D = 2.0;

        X = A / B;
        System.out.println(X);

        X = (int) (A * D) / (int) (C / A); 
        System.out.println(X);

        Y = A / B;
        System.out.println(Y);

        Y = (double) (A / B);
        System.out.println(Y); 

        Y = (double) A * D / (int) C;
        System.out.println(Y);

        Y = (double) A * D;
        System.out.println(Y);

        Y = (double) (A * D) / ( C * (int) D);
        System.out.println(Y);

        Y = A * (int) D;
        System.out.println(Y);

        Y = (int) (A * (int) D);
        System.out.println(Y);

        
    }    
}
