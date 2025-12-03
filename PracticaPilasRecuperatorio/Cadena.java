package PracticaPilasRecuperatorio;

public class Cadena {
    
    private String texto;

    // Constructor
    public Cadena(String texto){
        this.texto = texto;
    }

    public String getTexto(){
        return texto;
    }


    // Método para verificar si es palíndromo
    public boolean esPalindromo(){
        // 1) quitamos espacios y pasar a mayúsculas
        String limpio = texto.replace(" ", "").toUpperCase();

        int i = 0;
        int j = limpio.length() - 1;

        // 2) Comparar de ambos lados
        while(i < j){
            if(limpio.charAt(i) != limpio.charAt(j)){
                return false; // si un caracter difiere, no es palíndromo
            }
            i++;
            j--;
        }

        return true; // Si nunca falló, sí es palíndromo
    }

}
