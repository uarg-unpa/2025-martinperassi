package PracticaEjerciciosRecursividadChatGpt;

public class ContadorPares {
    
    public int contadorPares(int[] vector, int indice){
        if(indice == vector.length){
            return 0;
        }else{
            if(vector[indice] % 2 == 0){
                return 1 + contadorPares(vector, indice + 1);
            }else{
                return contadorPares(vector, indice + 1);
            }
        }
    }


}
