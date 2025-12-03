package PracticaEjerciciosRecursividadChatGpt;

public class InvertirString {
    public static String invertirString(String str) {
        // Caso base: si el String está vacío o tiene un solo carácter
        if (str == null || str.length() <= 1) {
            return str;
        } else {
            // Tomo el primer carácter y llamo recursivamente al resto del String
            return invertirString(str.substring(1)) + str.charAt(0);
        }
    }

}
