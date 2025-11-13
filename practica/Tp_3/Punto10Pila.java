package Tp_3;

import java.util.Scanner;

public class Punto10Pila {
    // ATRIBUTOS
    private String[] autos;
    private int max_elementos = 10;
    private int cima;

    // CONSTRUCTOR
    public Punto10Pila() {
        autos = new String[max_elementos];
        cima = -1;
    }

    // MÉTODOS
    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == max_elementos - 1;
    }

    // Meter auto desde teclado
    public void meter() {
        if (estaLlena()) {
            System.out.println("La pila está llena, no se puede agregar más autos.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Patente: ");
        String patente = scanner.nextLine();

        cima++;
        autos[cima] = marca + " " + patente;
    }

    // Sobrecarga de meter para insertar String directamente (para pila auxiliar)
    public void meter(String auto) {
        if (estaLlena()) {
            System.out.println("La pila está llena, no se puede agregar más autos.");
            return;
        }
        cima++;
        autos[cima] = auto;
    }

    // Sacar auto de la pila
    public String sacar() {
        if (!estaVacia()) {
            String aux = autos[cima];
            cima--;
            return aux;
        } else {
            return null; // retornamos null si está vacía
        }
    }

    // MENU INTERACTIVO
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean prendido = true;

        while (prendido) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ingresar autos");
            System.out.println("2. Buscar y eliminar patente");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            int eleccion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (eleccion) {
                case 1:
                    System.out.print("¿Cuántos autos quieres ingresar? (máx 10): ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); // limpiar buffer
                    if (cantidad > 0 && cantidad <= max_elementos) {
                        for (int i = 0; i < cantidad; i++) {
                            meter();
                        }
                    } else {
                        System.out.println("Número no válido o mayor que 10.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese la patente que quiere buscar: ");
                    String buscar_patente = scanner.nextLine();

                    Punto10Pila aux = new Punto10Pila(); // pila auxiliar
                    String encontrado = null;

                    // Sacamos elementos hasta encontrar la patente
                    while (!estaVacia()) {
                        String actual = sacar();
                        if (actual.contains(buscar_patente)) {
                            encontrado = actual; // lo encontramos y no lo devolvemos
                            break;
                        } else {
                            aux.meter(actual); // lo guardamos temporalmente
                        }
                    }

                    // Restauramos la pila original
                    while (!aux.estaVacia()) {
                        meter(aux.sacar());
                    }

                    if (encontrado != null) {
                        System.out.println("Patente encontrada y eliminada: " + encontrado);
                    } else {
                        System.out.println("No se encontró la patente.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del menú...");
                    prendido = false;
                    break;

                default:
                    System.out.println("Opción no válida. Debe ser 1, 2 o 3.");
                    break;
            }
        }
    }
}
