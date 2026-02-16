
package azienda;

import java.util.Date;

public class Impiegato {
	private final String nome;
	private double salario;
	private final Date dataAssunzione;
	
	private static int contatore = 0;

	public Impiegato(String nome, double salario, Date dataAssunzione) {
		this.nome = nome;
		this.salario = salario;
		this.dataAssunzione = dataAssunzione;
		contatore ++;
	}

	public String getNome() {
		return nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public Date getDataAssunzione() {
		return dataAssunzione;
	}

	public static int getContatore() {
		return contatore;
	}
	
	public int getAnnoAssunzione() {
		return this.dataAssunzione.getYear() + 1900;
	}
	
	public void incrSalario(double aumento) {
		if(aumento >= 0) {
			this.salario += aumento;

		}

	}

	@Override
	public String toString() {
		return "Nome dipendente: nome=" + nome + ", salario=" + salario + ", dataAssunzione=" + dataAssunzione + "";
	}
	
	
	
	
	

}
