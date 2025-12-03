package PracticaEjerciciosRecursividadChatGpt;

public class BuscarNumero {
    
    public boolean buscar(int[] vector ,int n, int indice){

        if(indice == vector.length){
            return false;
        }else{
            if(n == vector[indice]){
                return true;
            }else{
                return buscar(vector, n , indice + 1);
            }
        }
    }
}
