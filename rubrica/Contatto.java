
package rubrica;


public class Contatto {
	
	private String nome;
	private String cognome;
	private String numero_telefono;
	
	
	public Contatto(String nome, String cognome, String numero_telefono) {

		this.nome = nome;
		this.cognome = cognome;
		this.numero_telefono = numero_telefono;
	}


	public String getNumero_telefono() {
		return numero_telefono;
	}


	public void setNumero_telefono(String numero_telefono) {
		this.numero_telefono = numero_telefono;
	}


	public String getNome() {
		return nome;
	}


	public String getCognome() {
		return cognome;
	}
	
	@Override
	public String toString() {
		String s = "Nome contatto: " + this.nome + " " + this.cognome + "\n";
		s+= "Numero di telefono: " + this.numero_telefono;
		
		return s;
	}

}
