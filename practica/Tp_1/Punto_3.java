/* 3. Se tienen 3 variables A, B y C enteras. Escribir un algoritmo que intercambie entre si sus valores, para que queden finalmente de la siguiente forma:      
- B y C toman el valor de A. 
- A toma el valor original de C 

Ejemplo: 
Si A tiene el valor 1, B tiene el valor 2, y C tiene el valor 3, entonces debería quedar B con 1, C con 1 y A con 3.
Nota: sólo se debe utilizar una variable auxiliar como ayuda. 
 * 
 */

package Tp_1;
public class Punto_3 {
    public static void main(String[] args) {
        int A,B,C,AUX;

        A = 1;
        B = 2;
        C = 3;
        AUX = A;

        A = C;
        B = AUX;
        C = AUX;

        System.out.println("VALOR DE 'A': " + A);
        System.out.println("VALOR DE 'B': " + B);
        System.out.println("VALOR DE 'C': " + C);        
    }
}
