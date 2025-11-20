public class Auto {

    //ATRIBUTOS
    private String marca;
    private String modelo;
    private int anio;
    private int velocidadMax;

    //CONSTRUCTOR
    Auto(String marca, String modelo, int anio, int velocidadMax){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadMax = velocidadMax;
    }

    //METODOS
    //-> metodo para saber si el auto es un auto clasico.
    public boolean esAutoCLasico(){
        return this.anio <= 2000;
    }

    @Override
    public String toString(){
        return "Datos del auto\nMarca: " + marca + "\nModelo: " + modelo + "\nAnio: " + anio + "\nVelocidad Maxima: " + velocidadMax;
    }

    //getter 
    public int getVelocidadMaxima(){
        return velocidadMax;
    }


    public String compararVelocidades(Auto auto2, Auto auto3){
        if(this.velocidadMax > auto2.getVelocidadMaxima() && this.velocidadMax > auto3.getVelocidadMaxima()){
            return "Velocidad maxima: " + this.velocidadMax;
        }else if(auto2.getVelocidadMaxima() > this.velocidadMax && auto2.getVelocidadMaxima() > auto3.getVelocidadMaxima()){
            return "Velocidad maxima: " + auto2.velocidadMax;
        }else{
            return "Velocidad maxima: " + auto3.getVelocidadMaxima();
        }
    }

}