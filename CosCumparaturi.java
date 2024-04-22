import java.util.LinkedList;

public class CosCumparaturi {
	
	LinkedList<Produs> lista = new LinkedList<Produs>();
	
	public void adaugaProdus(Produs produs) {
		lista.add(produs);;
	}
	
	public double calculeazaTotal() {
		double suma = 0;
		for(Produs produs : lista)
			suma += produs.getPret();
		return suma;
			
	}

}
