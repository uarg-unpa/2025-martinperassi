package Recursividad;

public class SumatoriaPares {
    public int sumatoriaPares(int x){
        if(x < 0){
            return 0;
        }else{
            if(x % 2 != 0){
                return 0;
            }else{
                return x + sumatoriaPares(x - 2);
            }
        }
    }
}
