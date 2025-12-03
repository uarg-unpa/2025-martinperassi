package PracticaPilasRecuperatorio;

public class Auto {
    
    private String modelo;
    private String patente;

    Auto(String modelo, String patente){
        this.modelo = modelo;
        this.patente = patente;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getPatente(){
        return patente;
    }

    public void setPatente(String patente){
        this.patente = patente;
    }

    @Override
    public String toString(){
        return "Modelo: " + this.getModelo() + "\nPatente: " + this.getPatente();
    }

}
