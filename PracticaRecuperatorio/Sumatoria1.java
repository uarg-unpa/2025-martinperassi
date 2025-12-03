package PracticaRecuperatorio;

public class Sumatoria1 {
    public int sumatoria(int n){
        if(n > 0){
            return n + sumatoria(n - 1);
        }else{
            return 0;
        }
    }
}
