import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bandera = 0;
        int opcion;

        while (bandera == 0) {
            System.out.println("Elige una opcion:");
            System.out.println("1.CONTROLES");
            System.out.println("2.GRAFICOS");
            System.out.println("3.VOLUMEN");
            System.out.println("4.SALIR");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("accediste a la seccion de controles");
                        break;
                    case 2:
                        System.out.println("accediste a la seccion de graficos");
                        break;
                    case 3:
                        System.out.println("accediste a la seccion de volumen");
                        break;
                    case 4:
                        System.out.println("Saliendo del menu...");
                        return;
                    default:
                        System.out.println("!!!ingresa un numero valido!!!");
                        System.out.println("");
                        break;
                }
            }else{
                System.out.println("ingresa un numero entero valido!");
                bandera++;
            }
        }
    }
}
