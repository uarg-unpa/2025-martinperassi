//2. Implemente en código JAVA, 4 clases de las definidas en el punto 1


package Tp_2;

public class Punto_2 {
    //ATRIBUTOS DE ALUMNO
    private String nombre;
    private String apellido;
    private int edad;

    //CONSTRUCTOR
    Punto_2(String n,String ap,int e){
        nombre = n;
        apellido = ap;
        edad = e;
    }

    //SET Y GET

    public void setnombre(String n){
        nombre = n;
    }

    public String getnombre(){
        return nombre;
    }

    public void setapellido(String ap){
        apellido = ap;
    }

    public String getapellido(){
        return apellido;
    }

    public void setedad(int e){
        edad = e;
    }

    public int getedad(){
        return edad;
    }

    //mostrar datos del alumno
    public void mostrarDatos(){
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("edad: " + edad);
    }

    public static void main(String[] args) {
        Punto_2 alumno1 = new Punto_2("martin", "perassi", 23);

        alumno1.mostrarDatos();
        System.out.println();
        //vamos a cambiar el nombre y la edad para verificar que escribimos bien los set
        alumno1.setnombre("misael");
        alumno1.setedad(20);
        //vamos a mostrar en pantalla solo un atributo del objeto, en este caso el apellido:
        System.out.println(alumno1.getapellido());
        System.out.println();
        //ahora si vamos a mostrar en pantalla todos los atributos del alumno:
        alumno1.mostrarDatos();

    }


}
