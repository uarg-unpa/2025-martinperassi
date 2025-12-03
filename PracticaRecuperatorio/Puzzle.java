package PracticaRecuperatorio;

public class Puzzle {
    
    public int puzzle(int base, int limite){
        if(base > limite){//caso base
            return -1;
        }else{//caso general
            if(base == limite){
                return 1;
            }else{
                return (base * puzzle(base + 1, limite));
            }
        }
    }




}
