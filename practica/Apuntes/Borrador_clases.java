package Apuntes;

public class Borrador_clases {
    
    static public int Suma(int x,int y){
        return x+y;
    }

    static public String Persona(String nombre, String apellido, String edad){
        return nombre + apellido + edad;
    }




    static public void main(String[] args) {
        //Suma(1,2);
        System.out.println("la suma es:" + Suma(1,2));

        //muestra en pantalla nombre y apellido de la persona
        System.out.println("el nombre y apellido de la persona es: " + Persona("martin ","perassi"," y tiene 20 años"));
    }
}
