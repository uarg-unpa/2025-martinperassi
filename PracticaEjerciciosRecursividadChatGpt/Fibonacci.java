package PracticaEjerciciosRecursividadChatGpt;

public class Fibonacci {
    
    public int secuenciaFibonacci(int n){
        if(n == 0){
            return 0;
        }else{
            return n + secuenciaFibonacci(n - 1);
        }
    }


}
