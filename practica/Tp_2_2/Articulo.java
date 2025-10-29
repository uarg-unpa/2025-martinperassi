package Tp_2_2;

public class Articulo {
    //ATRIBUTOS
    private String nombre;
    private double precio;
    private int codigo;
    private int stock;

    //CONSTRUCTOR
    Articulo(String nombre, double precio, int codigo, int stock){
        this.nombre = nombre;
        this.setPrecio(precio); // Usamos el setter para validar el precio
        this.codigo = codigo;
        this.setStock(stock);   // Usamos el setter para validar el stock
    }

    //GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo. Se asignará 0.");
            this.precio = 0; // Asignamos un valor por defecto seguro
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: El stock no puede ser negativo. Se asignará 0.");
            this.stock = 0; // Asignamos un valor por defecto seguro
        }
    }

    //METODOS
    //Agregar Stock
    public void agregarStock(int cantidad){
        if(cantidad > 0 ){
            stock += cantidad;
            System.out.println("Cantidad ingresada de " + nombre + ": " + cantidad);
            System.out.println("Cantidad total de " + nombre + ": " + stock);
        }
    }
    //Disminuir Stock
    public void disminuirStock(int cantidad){
        if(cantidad > 0 && cantidad <= stock){
            stock -= cantidad;
            System.out.println("Cantidad disminuida de " + nombre + ": " + cantidad);
            System.out.println("Cantidad total de " + nombre + ": " + stock);
        }

    }
    //Mostrar datos del articulo
    public void mostrarDatos(){
        System.out.println("INFORMACION DEL ARTICULO");
        System.out.println("1.Nombre: " + nombre);
        System.out.println("2.Precio: " + precio);
        System.out.println("3.Codigo: " + codigo);
        System.out.println("4.Stock: " + stock);

    }

}
