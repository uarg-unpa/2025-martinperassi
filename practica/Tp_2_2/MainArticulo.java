package Tp_2_2;

public class MainArticulo {
    public static void main(String[] args) {
        Articulo a1 = new Articulo("MANZANA", -12, 12345, 122);

        a1.agregarStock(23);
        a1.disminuirStock(23);

        System.out.println(a1.getPrecio());

        a1.mostrarDatos();


    }
}
