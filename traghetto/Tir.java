
package traghetto;

public class Tir extends Veicolo {
	private double merce;

	public Tir(String targa, double merce) {
		super(targa);
		this.merce = merce;

	}

	@Override
	public double calcolaTariffa() {
		
		if(this.passeggeri.size()<1 || this.passeggeri.size()>3) {
			throw new IllegalArgumentException("Numero passeggeri non valido");
		}
		double tonnellateMerce = this.merce * 0.5;
		
		return 12.5 + tonnellateMerce + costoPasseggeri();
	}
	
	

}
	
