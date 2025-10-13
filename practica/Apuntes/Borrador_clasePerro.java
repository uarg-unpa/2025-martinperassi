package Apuntes;

public class Borrador_clasePerro {
    //ATRIBUTOS
    private String raza;
    private String sexo;
    private String color;
    private int edad;

    //CONSTRUCTOR
    Borrador_clasePerro(String raza,String sexo, String color, int edad){
        this.raza = raza;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }

    //METODOS
    public String getraza(){
        return raza;
    }

    public void setraza(String raza){
        this.raza = raza;
    }

    public String getsexo(){
        return sexo;
    }

    public void setsexo(String sexo){
        this.sexo = sexo;
    }

    public String getcolor(){
        return color;
    }

    public void setcolor(String color){
        this.color = color;
    }

    public int getedad(){
        return edad;
    }

    public void setedad(int edad){
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("raza: " + raza);
        System.out.println("sexo: " + sexo);
        System.out.println("color: " + color);
        System.out.println("edad: " + edad);
    }


    //MAIN
    public static void main(String[] args){
        Borrador_clasePerro perro1 = new Borrador_clasePerro("labrador", "macho", "negro", 3);
        Borrador_clasePerro perro2 = new Borrador_clasePerro("caniche", "hembra", "marron", 2);
        perro1.mostrarDatos();
        perro2.mostrarDatos();

        perro1.setcolor("celeste");
        perro1.mostrarDatos();

    }




}
