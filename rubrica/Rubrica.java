
package rubrica;

import java.util.ArrayList;

public class Rubrica {
	
	private ArrayList<Contatto> rubrica;
	private final int soglia = 5;
	
	public Rubrica() {
		this.rubrica = new ArrayList<>();
		
	}

	public ArrayList<Contatto> getRubrica() {
		return rubrica;
	}
	
	public void addContatto(Contatto contatto) {
		if (this.rubrica.size() <= soglia)
			this.rubrica.add(contatto);
	}
	
	
	public Contatto viewContatto(int posizione) {
		if(posizione <= soglia && posizione <= 0)
		return this.rubrica.get(posizione);
		return null;
		
	}
	
	public String printContatto() {
		for (Contatto contatto : this.rubrica) {
			return contatto.toString();
		}
		return null;
	}
	
	public int numeroContatti() {
		return this.rubrica.size();
	}
	
	public int postiLiberi() {
		return soglia - this.rubrica.size();
	}
	
	
	
	public Contatto cercaContattoByName(String nome) {
		for (Contatto contatto :this.rubrica) {
			if(contatto.getNome().equals(nome)) {
				return contatto;
			}
			
		}
		return null;
	}
	
	
	public Contatto cercaContattoByNumber(String numero) {
		for (Contatto contatto : this.rubrica) {
			if(contatto.getNumero_telefono().equals(numero)) {
				return contatto;
			}
		}
		return null;
	}
	
	
	
	
	

}
