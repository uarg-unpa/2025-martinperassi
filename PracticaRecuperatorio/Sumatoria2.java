package PracticaRecuperatorio;

public class Sumatoria2 {
    
    public int sumatoria2(int n){
        if(n <= 0){
            return 0;
        }else{
            if(n % 2 != 0){
                return 0;
            }else{
               return n + sumatoria2(n - 2); 
            }
        }
    }
}
