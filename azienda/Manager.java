package azienda;

import java.util.Date;

public class Manager extends Impiegato {
	
	private String segretaria;

	public Manager(String nome, double salario, Date dataAssunzione, String segretaria) {
		super(nome, salario, dataAssunzione);
		this.segretaria = segretaria;
	}
	// salaria parte con 2000
	public Manager(String nome, Date dataAssunzione, String segretaria) {
		super(nome, 2000 ,dataAssunzione);
		this.segretaria = segretaria;
		
	}
	public String getSegretaria() {
		return segretaria;
	}
	public void setSegretaria(String segretaria) {
		this.segretaria = segretaria;
	}
	@Override
	public void incrSalario(double aumento) {
		Date oggi = new Date();
		double bonus = 0.5* (oggi.getYear() + 1900 - this.getAnnoAssunzione());
		super.incrSalario(aumento + bonus);
	}
	@Override
	public String toString() {
				return super.toString() + " segretaria:" + segretaria;
	}
	

}