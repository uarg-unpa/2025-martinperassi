package ParcialRecuperatorio;

public class Cola {
    // ATRIBUTOS
	private final int maxcola = 5;
	private int[] elementos;
	private int frente, ultimo;
	
    //CONSTRUCTOR
	public Cola()
	{
		elementos = new int[maxcola];
		frente=0;
		ultimo=0;
	}

	//METODOS
	public boolean estaVacia()
	{
		return (ultimo == frente);
	}
   
	public boolean estaLlena()
	{
		int sigUltimo = siguiente(ultimo);
		return (sigUltimo == frente);
	}
	
	private int siguiente(int subind)
	{
		if (subind == maxcola -1)
			return 0;
		else
			return ++subind;
	}
	
	public void meter(int elem)
	{	
		if(!estaLlena()){
			ultimo = siguiente(ultimo);
			elementos[ultimo]=elem;		
		}	
	}
	
	public int sacar()
	{
		frente = siguiente(frente);
		return elementos[frente];
	}

    public void rotar(int k){
        if(k < 0){
            System.out.println("Error: K no puede ser un número negativo.");
            return;
        }

        for(int i = 0; i < k; i++){
            // Saca el elemento del frente y lo vuelve a meter al final para poder rotarlos
            this.meter(this.sacar());
        }
    }
 
}
