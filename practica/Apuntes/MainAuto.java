package Apuntes;

public class MainAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Peugeot", "208", 2005, 160);
        Auto auto2 = new Auto("Renault", "fluence", 2015, 200);
        Auto auto3 = new Auto("Volswagen", "gol", 2013, 135);

        System.out.println(auto1);
        System.out.println(auto1.esAutoCLasico());

        System.out.println(auto1.compararVelocidades(auto2, auto3));


    }
}
