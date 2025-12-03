package Tp_2_2;
import java.util.Scanner;

public class Teatro {
    /*
     * CONSIGNA:
     * 3. Un teatro se caracteriza por su nombre y su dirección y en él se realizan 3 obras teatrales al día. Cada obra tiene un nombre y un precio. 
     * Realice el diseño de clases e indique qué métodos tendría cada clase, teniendo en cuenta que se pueda cambiar el nombre del teatro y el nombre y precio de las obras. Implemente dichas clases. 
     */

    //ATRIBUTOS
    private String nombre;
    private int direccion;
    private int precio;

    //CONSTRUCTOR TEATRO
    Teatro(String nombre,int direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //GETTERS Y SETTERS
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getDireccion(){
        return direccion;
    }

    public void setDireccion(int direccion){
        this.direccion = direccion;
    }

}

