package PracticaRecuperatorio;

public class PotenciaYFactorial {
    
    public int potencia(int numero, int potencia){
        if(potencia == 0){
            return 1;
        }else{
            if(potencia == 1){
                return numero;
            }else{
                return (numero * potencia(numero, potencia - 1)); 
            }
        }
    }


    public int factorial(int numero){
        if(numero == 1){
            return 1;
        }else{
            if(numero < 0){
                return 0;
            }else{
                return (numero * factorial(numero - 1));
            }
        }
    }



}
