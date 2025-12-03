package Tp_2_2;
import java.util.Scanner;

public class Obra {
    //CLASE OBRA
        //ATRIBUTOS
        private String nombre;
        private double precio;
        Scanner scanner = new Scanner(System.in);

        //CONSTRUCTOR
        Obra(String nombre, double precio){
            this.nombre = nombre;
            this.precio = precio;
        }
        //GETTER y SETTER
        public String getNombre(){
            return nombre;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        
        public double getPrecio(){
            return precio;
        }

        public void setPrecio(double precio){
            this.precio = precio;
        }

        //METODOS
        //Mostrar obras
        public void mostrarObras(){
            System.out.println("OBRAS DISPONIBLES");
            System.out.println("1. La bella y la bestia");
            System.out.println("2. Blancanieves y los 7 enanitos");
            System.out.println("3. Rapunzel");
        }

        public void cambiarObra(){
            boolean seguir = true;
            while(seguir){
                System.out.println("Bienvenido! ¿Que quieres hacer?");
                System.out.println("");
                System.out.println("OBRAS DISPONIBLES");
                System.out.println("1. Ver La bella y la bestia");
                System.out.println("2. Ver Blancanieves y los 7 enanitos");
                System.out.println("3. Ver Rapunzel");
                System.out.println("4. Salir");
                System.out.print("Eleccion: ");
                if(scanner.hasNextInt()){
                    int eleccion = scanner.nextInt();
                        switch(eleccion){
                            case 1:
                                System.out.println("estas viendo la bella y la bestia, que lo disfrutes!");
                                seguir = false;
                                break;
                            case 2:
                                System.out.println("estas viendo Blancanieves y los 7 enanitos, que lo difrutes!");
                                seguir = false;
                                break;
                            case 3:
                                System.out.println("estas viendo Rapunzel, que lo disfrutes!");
                                seguir = false;
                                break;
                            case 4:
                                System.out.println("Entendido! Saliendo del sistema...");
                                seguir = false;
                                break;
                            default:
                            System.out.println("caracter no valido! ingresa un numero entre 1 y 4.");
                            System.out.print("Eleccion: ");
                            scanner.next();
                                break;
                        }
                }else{
                    System.out.println("caracter no valido! ingresa un numero entre 1 y 4.");
                    System.out.print("Eleccion: ");
                    scanner.next();
                }
            }
            scanner.close();
        }

}
