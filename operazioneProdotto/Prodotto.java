
package operazioneProdotto;

public class Prodotto {
	
	private int codice;
	private String descrizione;
	private String categoria;
	private int quantità;
	private boolean disponibilità;
	private double prezzo;
	private int sconto;
	
	public Prodotto(int codice, String descrizione, String categoria, int quantità, boolean disponibilità, double prezzo, int sconto) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.categoria = categoria;
		this.quantità = quantità;
		this.prezzo = prezzo;
		this.disponibilità = disponibilità;
		this.sconto = sconto;
		
		
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getQuantità() {
		return quantità;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}

	public boolean isDisponibilità() {
		return disponibilità;
	}

	public void setDisponibilità(boolean disponibilità) {
		this.disponibilità = disponibilità;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getSconto() {
		return sconto;
	}

	public void setSconto(int sconto) {
		this.sconto = sconto;
	}

	@Override
	public String toString() {
		return "Prodotto [codice=" + codice + ", descrizione=" + descrizione + ", categoria=" + categoria
				+ ", quantità=" + quantità + ", disponibilità=" + disponibilità + ", prezzo=" + prezzo + ", sconto="
				+ sconto + "]";
	}
	
	
	
	

}
