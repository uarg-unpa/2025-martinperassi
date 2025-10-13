/*
 * CONSGIGNA
 * 
 5. Crear una clase Empleado que modele la información que una empresa mantiene sobre cada empleado: 
 número de legajo, sueldo base, pago por hora extra, horas extra realizadas en el mes, casado o no y número de 
 hijos. Los servicios que deberán proporcionar los objetos de la clase serán los siguientes:  
 
 Cálculo y devolución del complemento correspondiente a las horas extra realizadas.  
 Cálculo y devolución del sueldo bruto.  
 Cálculo  y  devolución  de  las  retenciones,  teniendo  en  cuenta  que  el  porcentaje  de  retención  que  hay  que 
 aplicar es 10% del sueldo base si el empleado está casado más 1% por cada hijo que tenga.
 
 * 
*/


package Tp_2_2;

public class Empleado {
    //ATRIBUTOS
    private int numero_legajo;
    private double sueldo_base;;
    private double pago_por_hora_extra;
    private int horas_extra_realizadas;
    private String estado_civil;
    private int hijos;

    //CONSTRUCTOR
    Empleado(int numero_legajo, double sueldo_base, double pago_por_hora_extra, int horas_extra_realizadas, String estado_civil, int hijos){
        this.numero_legajo = numero_legajo;
        this.sueldo_base = sueldo_base;
        this.pago_por_hora_extra = pago_por_hora_extra;
        this.horas_extra_realizadas = horas_extra_realizadas;
        this.estado_civil = estado_civil;
        this.hijos = hijos;
    }

    //METODOS

    //1. Mostrar datos
    public void mostrarDatos(){
        System.out.println("Numero de legajo: " + numero_legajo);
        System.out.println("Sueldo base: " + sueldo_base);
        System.out.println("Pago por horas extra realizadas: " + pago_por_hora_extra);
        System.out.println("Horas extra realizadas en el mes: " + horas_extra_realizadas);
        System.out.println("Estado civil: " + estado_civil);
        System.out.println("Numero de hijos: " + hijos);
    }

    //2.Pago por las horas extra realizadas
    public void pagarHorasExtras(){
        double pago_horas_extra = pago_por_hora_extra * horas_extra_realizadas;
        System.out.println("Pago por las horas extra realizadas: " + pago_horas_extra);
    }

    //3.Devolucion del sueldo bruto
    public void calcularSueldoBruto(){
        double sueldo_bruto = sueldo_base + pago_por_hora_extra;
        System.out.println("Sueldo Bruto(sueldo base + horas extra realizadas): " + sueldo_bruto);
    }

    //Retencinoes y Devolucion de estas mismas
    public void calcularRetenciones(){
        if(hijos >= 1){
            double retenciones = (sueldo_base * (10 + hijos) / 100);
            System.out.println("retenecion del 10% y cantidad de hijos: " + retenciones);
        }else{
            double retenciones = (sueldo_base * 10 / 100);
            System.out.println("retencion del 10 % : " + retenciones);
        }
    }



}
