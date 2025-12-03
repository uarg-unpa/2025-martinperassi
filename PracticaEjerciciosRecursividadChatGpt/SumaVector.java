package PracticaEjerciciosRecursividadChatGpt;

public class SumaVector {
    
    public int sumaArreglo(int[] arr, int indice) {
        // Caso base: si llegamos al final del arreglo
        if (indice == arr.length) {
            return 0;
        } else {
            // Sumo el elemento actual y llamo recursivamente al siguiente
            return arr[indice] + sumaArreglo(arr, indice + 1);
        }
    }
    
}
