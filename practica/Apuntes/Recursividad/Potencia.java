package Apuntes.Recursividad;

public class Potencia {
    public int potencia(int m, int n){
        if(n == 0){
            return 1;
        }else{
            return (m * potencia(m, n - 1));
        }
    }
}
