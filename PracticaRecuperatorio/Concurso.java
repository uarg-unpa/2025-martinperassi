package PracticaRecuperatorio;

public class Concurso {
    
    public int concurso(int base, int limite) {
        if(base == limite){
            return 1; 
        }else{
            if(base > limite){
                return 0;
            }else{
                return(base + concurso(base + 1, limite));
            }
        }
    }
}
