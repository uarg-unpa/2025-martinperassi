package PracticaRecuperatorio;

public class Funcion {
    
    public int funcion(int x, int y){
        if(x <= y){
            return 1;
        }else{
            return 1 + funcion(x, y + 1);
        }
    }



}
