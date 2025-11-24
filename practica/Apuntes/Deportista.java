

public class Deportista {
    //ATRIBUTOS
    private String nombre;
    private int edad;
    private String deporte;
    private int puntos;

    //CONSTUCTOR
    Deportista(String nombre, int edad, String deporte,int puntos){
    this.nombre = nombre;
    this.edad = edad;
    this.deporte = deporte;
    this.puntos = puntos;        
    }

    public int getEdad(){
        return edad;
    }

    public int getPuntos(){
        return puntos;
    }

    //METODOS
    //-> Comprobar si son mayores de edad 
    public String mayorDeEdad(){
        if(this.edad >= 18){
            return "El/La deportista " + this.nombre + " es mayor de edad.";
        }else{
            return "El/La deportista " + this.nombre + " no es mayor de edad.";
        }
    }

    //-> toString
    @Override
    public String toString(){
        return "Datos del/la Deportista\nNombre: " + nombre + "\nEdad: " + edad + "\nDeporte: " + deporte + "\nPuntos: " + puntos + "\n"; 
    }

    //-> Verificar mayor puntaje
    public String compararPuntos(Deportista otroDeportista){
        if(this.puntos > otroDeportista.getPuntos()){
            return "El/La deportista con mayor puntaje es " + this.nombre + " con " + this.puntos + " puntos.";
        }else if(otroDeportista.getPuntos() > this.puntos){
            return "El/La deportista con mayor puntaje es " + otroDeportista.nombre + " con " + otroDeportista.getPuntos() + " puntos.";
        }else{
            return "Ambos deportistas tienen el mismo puntaje: " + this.puntos + " puntos.";
        }
    } 



}
