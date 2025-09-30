package Tp_2;

public class Televisor {
    //ATRIBUTOS DE TELEVISOR
    String marca;
    int pulgadas;
    String  color;

    //CONSTRUCTOR
    Televisor(String mar, int pul, String col){
        marca = mar;
        pulgadas = pul;
        color = col;
    }

    //METODOS
    public void setmarca(String mar){
        marca = mar;
    }

    public String getmarca(){
        return marca;
    }

    public void setpulgadas(int pul){
        pulgadas = pul;
    }

    public int getpulgadas(){
        return pulgadas;
    }

    public void setcolor(String col){
        color = col;
    }

    public String getcolor(){
        return color;
    }



    //METODO PARA MOSTRAR LOS DATOS DE LOS OBJETOS TELEVISOR
    public void mostrarDatos(){
        System.out.println("marca del televisor: " + marca);
        System.out.println("pulgadas: " + pulgadas);
        System.out.println("color: " + color);
    }

    public static void main(String[] args) {
        //creamos el objeto televisor1
        Televisor televisor1 = new Televisor("Sony", 22, "negro");

        //mostramos los datos del televisor 1
        televisor1.mostrarDatos();
        System.out.println();

        //ahora mostraremos los datos por separado.
        System.out.println("ATRIBUTOS:");
        System.out.println(televisor1.getmarca());
        System.out.println(televisor1.getpulgadas());
        System.out.println(televisor1.getcolor());
        System.out.println();

        //cambiamos los datos del televisor 1 para comprobar que funcionan bien los metodos set
        televisor1.setmarca("TCL");
        televisor1.setpulgadas(29);
        televisor1.setcolor("rosa");
        
        //volvemos a mostrar los datos con el metodo mostrarDatos pero ahora eremos que nuestro objeto tiene los atributos cambiados.
        televisor1.mostrarDatos(); 

    }

}
