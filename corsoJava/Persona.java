
package corsoJava;

public class Persona {
	// 1. attributi
	private String nome;
	private int eta;
	private double peso;
	
	
	//2. costruttori
	public Persona(String nome, int eta, double peso) {

		this.nome = nome;
		this.eta = eta;
		this.peso = peso;
	}
	
	public Persona(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
//		this.eta = 0;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		if(eta > 0)
			this.eta = eta;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}
	
	
	// metodo di formattazione
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", eta=" + eta + ", peso=" + peso + "]";
	}
	
	
	// metodi operativi
	
	public void cresce() {
		eta++;
	}
	
	
	public void cresce(int incremento) {
		if(incremento > 0)
			eta += incremento;
	}
	
	

}
