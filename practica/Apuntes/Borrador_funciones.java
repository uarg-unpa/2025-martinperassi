package Apuntes;
import java.util.Scanner;

public class Borrador_funciones {
    
    static public int Suma(int x,int y){
        return x+y;
    }

    static public String Persona(String nombre, String apellido, String edad){
        return nombre + apellido + edad;
    }

    //FUNCION QUE CALCULA EL CUBO DE UN NUMERO ENTERO
    public static int Cubo(int x){
        int resultado = x * x *x;
        return resultado;
    }
    //DETERMINAR ENTRE 2 CARACTERES SI EL PRIMERO ES MENOR QUE EL SEGUNDO
    boolean Menor(char letra_1, char letra_2){
        boolean esMenor;
        if(letra_1 < letra_2){
            esMenor = true;
        }else{
            esMenor = false;
        }return esMenor;
    }

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        //Suma(1,2);
        System.out.println("la suma es:" + Suma(1,2));

        //muestra en pantalla nombre y apellido de la persona
        System.out.println("el nombre y apellido de la persona es: " + Persona("martin ","perassi"," y tiene 20 años"));

        //muestra en pantalla el cubo de cualquier numero entero
        System.out.print("ingresa un numero: ");
        num = scanner.nextInt();
        System.out.println("el cubo de " + num + " es: " + Cubo(num));



    }
}
