
package mappe;

public class Studente {
	
	private int matricola;
	private String nome;
	private int annoImm;
	
	public Studente(int matricola, String nome, int annoImm) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.annoImm = annoImm;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnnoImm() {
		return annoImm;
	}

	public void setAnnoImm(int annoImm) {
		this.annoImm = annoImm;
	}

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", nome=" + nome + ", annoImm=" + annoImm + "]";
	}
	
	

}
