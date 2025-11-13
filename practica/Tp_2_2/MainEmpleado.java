package Tp_2_2;

public class MainEmpleado {
    public static void main(String[] args) {
        Empleado martin = new Empleado(43892935, 320534, 15000, 2, "casado", 0);

        martin.mostrarDatos();
        System.out.println();
        martin.pagarHorasExtras();
        System.out.println();
        martin.calcularSueldoBruto();
        System.out.println();
        martin.calcularRetenciones();

    }
}
