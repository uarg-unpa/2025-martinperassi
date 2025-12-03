package PracticaEjerciciosRecursividadChatGpt;

public class Suma {
    public int suma(int[] vector, int indice){
        if(indice == vector.length - 1){
            return vector[indice];
        }else{
            return vector[indice] + suma(vector, indice + 1);
        }
    }
}
