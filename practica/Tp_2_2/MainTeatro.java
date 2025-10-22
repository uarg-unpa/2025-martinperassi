package Tp_2_2;

public class MainTeatro {
    public static void main(String[] args) {
        Teatro teatro = new Teatro("COLÓN", 1300);

        System.out.println("UBICACION ACTUAL: ");
        System.out.println(teatro.getNombre());
        System.out.println(teatro.getDireccion());

        Obra obra = new Obra(null, 0);
        obra.cambiarObra();




        
    }
}
