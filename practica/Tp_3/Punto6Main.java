package Tp_3;

public class Punto6Main {
    public static void main(String[] args) {
        Punto6Pila pila1 = new Punto6Pila();

        //llenamos la pila
        pila1.meter(12);
        pila1.meter(3);
        pila1.meter(43);
        pila1.meter(2);
        pila1.meter(190);
        pila1.meter(33);
        pila1.meter(1);
        pila1.meter(100);
        pila1.meter(43);
        pila1.meter(72);

        // a) Asignar a X el segundo elemento desde la parte superior de la pila, dejando la pila sin sus dos elementos 
        // de la parte superior. 
        System.out.print("Elemento sacado: ");
        System.out.println(pila1.sacar());

        int x;
        System.out.print("valor de x: ");
        System.out.println(x = pila1.sacar());

        // b) Asignar a X el segundo elemento desde la parte superior de la pila, sin modificarla. 
        // --> creamos 2 variables auxiliares para que cuando saquemos los elementos de la pila no desaparezcan
        int aux1,aux2;
        aux1 = pila1.sacar();
        aux2 = pila1.sacar();

        //--> asignamos a x el segundo elemento de la pila
        System.out.print("x: ");
        System.out.println(x = aux2);
        //--> volvemos a ingresar los 2 elementos que quitamos anteriormente para que la pila quede igual.
        pila1.meter(aux2);
        pila1.meter(aux1);
        
        //--> uso este while para un seguimiento de que la pila este bien ordenada.
        // System.out.println("ver elementos de la pila");
        // while(!pila1.estaVacia()){
        //     int aux = pila1.sacar();
        //     System.out.println(aux);
        // }


        //c) Desde un entero positivo N, asignar a X el N-ésimo elemento desde la parte superior de la pila, dejando 
        // la pila sin sus N elementos de la parte superior.
        int n = 3;

        for(int i = 0; i < n; i++){
            if(i == n-1){
                x = pila1.sacar();
            }
            else{
                x = pila1.sacar();
            }
        }

        System.out.println("x: " + x);

        


        






        




    }
}
