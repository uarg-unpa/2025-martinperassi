package EjerciciosPractica;

public class Pedido {
    String cliente;
    double importe;

    public Pedido(String cliente, double importe) {
        this.cliente = cliente;
        this.importe = importe;
    }

    public double getImporte() {
        return importe;
    }

    @Override
    public String toString() {
        return cliente + " - $" + importe;
    }
}
