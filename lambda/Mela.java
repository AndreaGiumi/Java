
package lambda;

public class Mela {
	private String colore;
	private int peso;
	
	public Mela(String colore, int peso) {
		super();
		this.colore = colore;
		this.peso = peso;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Mela [colore=" + colore + ", peso=" + peso + "]";
	}


}
