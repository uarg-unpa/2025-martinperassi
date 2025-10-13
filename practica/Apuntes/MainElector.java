package Apuntes;
public class MainElector {
    public static void main(String[] args) {
        Elector p1 = new Elector("carlos", "diaz", 12, 23, "antonio rodriguez 1297");
        System.out.println(p1);

        Elector p2 = new Elector(null, null, 0, 0, null);
        p2.pedirDatos();
        System.out.println(p2);

        Elector p3 = new Elector(null, null, 0, 0, null);
        p3.pedirDatos();
        System.out.println(p3);

        Elector p4 = new Elector(null, null, 0, 0, null);
        p4.pedirDatos();
        System.out.println(p4);

        Elector p5 = new Elector(null, null, 0, 0, null);
        p5.pedirDatos();
        System.out.println(p5);

        Elector p6 = new Elector(null, null, 0, 0, null);
        p6.pedirDatos();
        System.out.println(p6);


        System.out.println("ATRIBUTOS SIN MODIFICAR DE p2:");
        System.out.println(p2);
        System.out.println("ATRIBUTOS MODIFICADOS DE p2: ");
        p2.setNombre("kevin");
        p2.setApellido("alvarez");
        p2.setDomicilio("kirchner 2890");
        p2.setMatricula(2323431);
        p2.setClase(10);
        System.out.println(p2);


    }
}
