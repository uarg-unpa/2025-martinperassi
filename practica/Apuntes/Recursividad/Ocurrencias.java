package Recursividad;

public class Ocurrencias {

    public int ocurrencias(int[] vector, int n, int indice){

        // Caso base, recorrimos todo el vector
        if(indice == vector.length){
            return 0;
        }

        // Si coincide, sumamos 1
        if(vector[indice] == n){
            return 1 + ocurrencias(vector, n, indice + 1);
        }

        // Si NO coincide, sumamos 0
        return ocurrencias(vector, n, indice + 1);
    }
}
