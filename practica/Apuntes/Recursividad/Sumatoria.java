package Apuntes.Recursividad;

public class Sumatoria {
    public int sumatoria(int x){
        if(x <= 0){
            return 0;
        }else{
            return x + sumatoria(x - 1);
        }
    }
}
