package PracticaEjerciciosRecursividadChatGpt;

public class ContarNumerosDeUnNumero {

    public int contarDigitos(int n) {
        // Caso base: si el número es 0, no hay más dígitos
        if (n == 0) {
            return 0;
        } else {
            // Llamada recursiva dividiendo entre 10 y sumando 1 por el dígito actual
            return 1 + contarDigitos(n / 10);
        }
    }
    

}
