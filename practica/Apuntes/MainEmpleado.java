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

// En el metodo Main (de una calse llama, por ejemplo Empresa):

// --> crear 3 empleados con todos los datos.
// --> Mostrar la informacion de cada uno.
// --> Comparar 2 de ellos usando el metodo ganaMasQue.
// --> Mostrar por consola un mensaje indicando que empleado gana mas.



package Apuntes;

public class MainEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Martin", 1, 159456);
        Empleado e2 = new Empleado("cristina", 2, 2300450);
        Empleado e3 = new Empleado("maria", 3, 580333);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println(e3.ganaMasQue(e1));

        Empleado mayorSueldo;

        if(e1.getSueldo() > e2.getSueldo() && e1.getSueldo() > e3.getSueldo()){
            mayorSueldo = e1;
            System.out.println();
        }
        else if(e2.getSueldo() > e1.getSueldo() && e2.getSueldo() > e3.getSueldo()){
            mayorSueldo = e2;
            System.out.println();
        }
        else{
            mayorSueldo = e3;
            System.out.println();
        }

        System.out.println("El sueldo mas alto es de " + mayorSueldo.getNombre() + ", con un sueldo de: " + mayorSueldo.getSueldo());

    }
}
