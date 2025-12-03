package PracticaRecuperatorio;

public class Menor {
    
    public int menor(int[] vector, int indice){

        if(indice == vector.length - 1){
            return vector[indice];
        }else{
            int menor = menor(vector, indice +1);

            if(vector[indice] < menor){

                return vector[indice];

            }else{

                return menor;

            }


        }
    }
}
