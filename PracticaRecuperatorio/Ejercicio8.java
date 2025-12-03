package PracticaRecuperatorio;

public class Ejercicio8 {
    
    public int sumatoria(int n){
        if(n == 0){
            return 0;
        }else{
            if(n < 0){
                return 0;
            }else{
                return n + sumatoria(n - 1);
            }
        }
    }

}
