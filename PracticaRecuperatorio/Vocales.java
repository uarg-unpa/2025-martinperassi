package PracticaRecuperatorio;

public class Vocales {
    
        public int vocales(String cadena){

        if(cadena.length() == 0){
            return 0;
        }else{
            if(cadena.charAt(0) == 'a' || cadena.charAt(0) == 'e'|| cadena.charAt(0) == 'i'|| cadena.charAt(0) == 'o'|| cadena.charAt(0) == 'u'){
                return 1 + vocales(cadena.substring(1));
            }else{
                return vocales(cadena.substring(1));
            }
        }
    }
}
