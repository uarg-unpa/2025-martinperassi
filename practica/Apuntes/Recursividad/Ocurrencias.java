package Recursividad;

public class Ocurrencias {

    public int ocurrencias(int[] vector, int n, int indice){

        // Caso base, recorrimos todo el vector
        if(indice == vector.length){
            return 0;
        }else{
            // Si coincide, sumamos 1
            if(vector[indice] == n){
                return 1 + ocurrencias(vector, n, indice + 1);
            }else{
            // Si NO coincide, sumamos 0
            return 0 + ocurrencias(vector, n, indice + 1);
            }
        }
    }
}
