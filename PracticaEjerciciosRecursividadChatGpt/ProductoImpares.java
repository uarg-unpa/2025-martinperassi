package PracticaEjerciciosRecursividadChatGpt;

public class ProductoImpares {
    
        public int ProductoImpares(int[] vector, int indice){
        if(indice == vector.length){
            return 1;
        }else{
            if(vector[indice] % 2 == 0){
                return ProductoImpares(vector, indice + 1);
            }else{
                return  vector[indice] * ProductoImpares(vector, indice + 1);
            }
        }
    }
}
