package Apuntes.Recursividad;

public class Puzzle {
    

    public int puzzle(int base, int limite){
        if(base > limite){
            return -1;
        }else{
            if(base == limite){
                return 0;
            }
            else{
                return (base * puzzle(base + 1, limite));
            }
        }
    }
}
