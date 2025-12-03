package PracticaRecuperatorio;

public class ProductoPares {
    
    public int productopares(int[] vector, int indice){
        if(indice == vector.length){
            return 1; // -> caso base, cuando
        }else{
            if(vector[indice] % 2 != 0){
                return productopares(vector, indice + 1); //-> en caso de encontrar un numero impar.
            }else{
                return vector[indice] * productopares(vector, indice + 1); //caso general: --> en caso de encontrar un numero par.
            }
        }
    }
}
