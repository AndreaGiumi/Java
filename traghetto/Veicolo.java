
package traghetto;

import java.util.ArrayList;

public abstract class Veicolo implements Tariffabile {
	
	private String targa;
	protected ArrayList<Persona> passeggeri;
	
	public Veicolo(String targa) {
		this.targa = targa;
		this.passeggeri = new ArrayList<Persona>();
	}
	
	public void aggiungiPasseggero(Persona p) {
		if (p == null) {
			throw new IllegalArgumentException("Inseirire passeggero valido");
			
		}else {
			this.passeggeri.add(p);
		}
	}

	public double costoPasseggeri() {
		return this.passeggeri.size() * 2.5;
	}
	
	

}
