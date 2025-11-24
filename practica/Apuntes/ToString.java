

public class ToString {
    //ATRIBUTOS
    private String nombre;
    private int numero;

    //CONSTRUCTOR
    ToString(String nombre, int numero){
        this.nombre = nombre;
        this.numero = numero;
    }


    //toString()
    
    @Override
    public String toString(){
        return "[Nombre: " + nombre + ", Numero: " + numero + "]";
    }


    public static void main(String[] args) {
        ToString p1 = new ToString("Martin", 12);

        System.out.println(p1);
        
    }
}
