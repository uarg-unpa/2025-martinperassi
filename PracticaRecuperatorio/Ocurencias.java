package PracticaRecuperatorio;

public class Ocurencias {
    public int ocurrencias(int[] vector, int n, int indice){

        if(indice == vector.length){
            return 0;
        }else{
            if( n == vector[indice]){
                return 1 + ocurrencias(vector, n, indice + 1);
            }else{
                return ocurrencias(vector, n, indice + 1);
            }
        }
    }
}
