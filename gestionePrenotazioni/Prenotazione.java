
package gestionePrenotazioni;

import java.util.ArrayList;

public class Prenotazione {
	private String emial;
	private ArrayList<Posto> posti;
	
	public Prenotazione(String emial, ArrayList<Posto> posti) {
		super();
		this.emial = emial;
		this.posti = posti;
	}

	public String getEmial() {
		return emial;
	}

	public void setEmial(String emial) {
		this.emial = emial;
	}

	public ArrayList<Posto> getPosti() {
		return posti;
	}

	public void setPosti(ArrayList<Posto> posti) {
		this.posti = posti;
	}

	@Override
	public String toString() {
		return "Prenotazione [emial=" + emial + ", posti=" + posti + "]";
	}
	
	

}
