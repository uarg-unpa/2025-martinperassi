// //CONSIGNA
// Una empresa desea un progrmaa que permita comparar los sueldos de sus empleados. Cada empleado tiene los siguientes atributos:
// 1.nombre
// 2.legajo
// 3.sueldo

// Se pide:
// --> Definir la clase empleado, implementando:
// --> Atributos privados para cada dato.
// --> Metodos que considere y un metodo llamado:
// public boolean ganaMasQue(Empleado otro), que devuelva true si el empleado gana mas que el empleado que pasa por parametro.

// En el metodo Main (de una clase llama, por ejemplo Empresa):

// --> crear 3 empleados con todos los datos.
// --> Mostrar la informacion de cada uno.
// --> Comparar 2 de ellos usando el metodo ganaMasQue.
// --> Mostrar por consola un mensaje indicando que empleado gana mas.


package ClasesYObjetos;
public class Empleado{

    //ATRIBUTOS
    private String nombre;
    private int legajo;
    private double sueldo;

    //CONSTRUCTOR
    Empleado(String nombre, int legajo, double sueldo){
        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    //METODOS
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public int getLegajo(){
        return legajo;
    }

    public void setLegajo(int nuevoLegajo){
        this.legajo = nuevoLegajo;
    }

    public double getSueldo(){
        return sueldo;
    }

    public void setSueldo(double nuevoSueldo){
        this.sueldo = nuevoSueldo;
    }

    // --> Metodo toString para mostrar los datos del empleado.
    @Override
    public String toString(){
        return "Datos del empleado\nNombre: " + nombre + "\nLegajo: " + legajo + "\nSueldo: " + sueldo + "\n";

    }


    public boolean ganaMasQue(Empleado otroEmpleado){
        return this.sueldo > otroEmpleado.getSueldo();
    }
}