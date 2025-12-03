package Recursividad;

public class Busqueda{

    public boolean determinarNum (int n, int [] num, int indice){
        if (indice == num.length)
            return false;
        else
            if (num [indice] == n)
                return true;
            else
                return determinarNum(n, num, indice + 1);
    }
}