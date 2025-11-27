package Recursividad;

public class Vocales{


    public int vocales(String cd){
    // Caso base: si la cadena está vacía, no hay vocales
    if(cd.length() == 0){
        return 0;
    }

    // Tomamos el primer carácter
    char c = cd.charAt(0);
    int suma = 0;

    // Verificamos si es vocal
    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
       c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
        suma = 1;
    }

    // Llamada recursiva con el resto de la cadena
    return suma + vocales(cd.substring(1));
}


}