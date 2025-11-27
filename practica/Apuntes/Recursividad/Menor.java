package Recursividad;

public class Menor{

    public int menor(int[] arr, int i) {

        if(i == arr.length - 1){
            return arr[i];
        }

        int minResto = menor(arr, i + 1);

        if(arr[i] < minResto){
            return arr[i];
        } else {
            return minResto;
        }
    }
}