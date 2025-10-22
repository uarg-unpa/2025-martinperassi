/*
 * 5. Una hora se compone de 3 elementos: hora, minutos y segundos. Codificar la clase Hora con los siguientes métodos: 
a)  Cuando  se  crea  el  objeto  de  la  clase  Hora,  los  valores  de  hora,  minutos  y  segundos  deben  ser 
válidos (es decir, una hora correcta en Argentina). Si alguno es inválido, generar la hora 00:00:00. 
b) Permitir cambiar la hora, los minutos y los segundos por separado. 
c) Devolver la hora en minutos. 
d) Mostrar la hora de la siguiente forma: hh:mm:ss. 
e) Crear dos objetos de la clase Hora, y probar los métodos correspondientes.
*/

package Tp_2;

import java.util.Scanner;

public class Hora {

    // ATRIBUTOS
    private int hora = 00;
    private int minutos = 00;
    private int segundos = 00;

    // CONSTRUCTOR
    Hora(int h, int m, int s) {
        hora = h;
        minutos = m;
        segundos = s;
    }

    // GET Y SET
    public int gethora() {
        return hora;
    }

    public void sethora(int h) {
        hora = h;
    }

    public int getminutos() {
        return minutos;
    }

    public void setminutos(int m) {
        minutos = m;
    }

    public int getsegundos() {
        return segundos;
    }

    public void setsegundos(int s) {
        segundos = s;
    }

    // METODOS
    // mostrar datos
    public void mostrarDatos() {
        System.out.print("(hh:" + hora);
        System.out.print(" mm:" + minutos);
        System.out.print(" ss:" + segundos + ")");
    }

    // MAIN
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bandera = 0;
        int eleccion1, eleccion2;
        int nuevaHora,nuevosMinutos,nuevosSegundos;
        int cambiarHora, cambiarMinutos, cambiarSegundos;

        Hora hora1 = new Hora(00, 00, 00);
        hora1.mostrarDatos();
        Hora hora2 = new Hora(00, 00, 00);

        System.out.println();

        while (bandera == 0) {
            System.out.print("¿Quieres modificar el horario? 1 para si y 2 para no: ");
            if (scanner.hasNextInt()) {
                eleccion1 = scanner.nextInt();
                if (eleccion1 == 2) {
                    System.out.println("saliendo programa...");
                    bandera++;
                } else if (eleccion1 == 1) {
                    System.out.println("¿que quieres modificar?");
                    System.out.println("1. HORA");
                    System.out.println("2. MINUTOS");
                    System.out.println("3. SEGUNDOS");
                    System.out.println("4. SALIR");
                    eleccion2 = scanner.nextInt();
                    switch (eleccion2) {
                        case 1:
                            System.out.println("ingresa la nueva hora: ");
                            cambiarHora = scanner.nextInt();
                            if(cambiarHora >= 0 && cambiarHora <=23){
                                nuevaHora = cambiarHora;
                                System.out.println("la nueva hora es: " + nuevaHora);
                                hora2.sethora(nuevaHora);
                            }else{
                                System.out.println("tiene que ingresar un numero entre el 0 y el 23: ");
                                scanner.next();
                            }
                            break;
                        case 2:
                            System.out.println("ingresa los nuevos minutos: ");
                            cambiarMinutos = scanner.nextInt();
                            if(cambiarMinutos >= 0 && cambiarMinutos <= 59){
                                nuevosMinutos = cambiarMinutos;
                                System.out.println("nuevos minutos: " + nuevosMinutos);
                                hora2.setminutos(nuevosMinutos);
                            }else{
                                System.out.println("tienes que ingresar un numero entre el 0 y el 59");
                                scanner.next();
                            }
                            break;
                        case 3:
                            System.out.println("ingresa los nuevos segundos: ");
                            cambiarSegundos = scanner.nextInt();
                            if(cambiarSegundos >= 0 && cambiarSegundos <= 59){
                                nuevosSegundos = cambiarSegundos;
                                System.out.print("Nuevos segundos: " + nuevosSegundos);
                                hora2.setsegundos(nuevosSegundos);
                            }else{
                                System.out.println("ingresa un numero entre 0 y 59");
                                scanner.next();
                            }
                            break;
                        case 4:
                            System.out.println("saliendo del menu...");
                            bandera++;
                            break;
                        default:
                            System.out.println("caracter incorrecto");
                            break;
                    }
                } else{
                    System.out.println("CARACTER NO VALIDO!!! INGRESA 1 o 2: ");
                }
            } else {
                System.out.println("¡¡¡CARACTER NO VALIDO!!! INGRESA 1 o 2: ");
                scanner.next();
            }
        }
        scanner.close();

        System.out.println("Horario sin modificar: ");
        hora1.mostrarDatos();
        System.out.println();

        System.out.println("Horario modificado: ");
        hora2.mostrarDatos();

    }

}
