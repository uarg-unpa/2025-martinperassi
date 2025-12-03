package PracticaRecuperatorio;

public class Coincidencia {
    
    public boolean coincidencia(int[] vector, int n, int indice){

        if(indice == vector.length){
            return false;
        }else{
            if(vector[indice] == n){
                return true;
            }else{
                return coincidencia(vector, n, indice + 1);
            }
        }
    }


}
