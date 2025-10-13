package Apuntes;

public class Elector {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int matricula;
    private int clase;
    private String domicilio;

    //CONSTRUCTOR
    Elector(String nombre, String apellido, int matricula, int clase, String domicilio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.clase = clase;
        this.domicilio = domicilio;
    }

    //METODOS
    //GETTER Y SETTER
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getClase(){
        return clase;
    }

    public void setClase(int clase){
        this.clase = clase;
    }

    public String getDomicilio(){
        return domicilio;
    }
    
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }


    //toString()
    @Override
    public String toString(){
        return "Datos Personales\n" + "Nombre: " + nombre + "\nApellido: " + apellido + "\nMatricula: " + matricula + "\nClase: " + clase + "\nDomicilio: " + domicilio;
    }

    
}
