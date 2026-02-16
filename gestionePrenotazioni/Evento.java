
package gestionePrenotazioni;

import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {
	private String nome;
	private LocalDate date;
	private ArrayList<Prenotazione> prenotazioni;
	private boolean chiuso;
	
	public Evento(String nome, LocalDate date) {
		super();
		this.nome = nome;
		this.date = date;
		this.prenotazioni = new ArrayList<>();
		this.chiuso = false;
	}
	
	
	public void aggiungiPrenotazione(ArrayList<Posto> list, String email) {
		
		
	}
	

}
