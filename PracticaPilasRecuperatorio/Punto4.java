package PracticaPilasRecuperatorio;

public class Punto4 {
    
    //atributos
    private int [] vector;
    private int max_elementos = 5;

    //constructor
    Punto4(){
        this.vector = new int[max_elementos];
    }

    int i = 0;
    public void meter(int n){
        if(i < vector.length){
            vector[i] = n;
            i++;
            System.out.println("numero ingresado: " + n + ", faltan " + (max_elementos - i) + " numeros para completar el vector...");
        }else{
            System.out.println("no puedes ingresar mas numeros");
        }
    }
}
