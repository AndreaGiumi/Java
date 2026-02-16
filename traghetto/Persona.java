
package traghetto;

public class Moto extends Veicolo {

	public Moto(String targa) {
		super(targa);
	}

	@Override
	public double calcolaTariffa() {
		
		if(this.passeggeri.size()<1 || this.passeggeri.size()>2) {
			throw new IllegalArgumentException("Numero passeggeri non valido");
		}
		
		return 3.5 + costoPasseggeri();
	}

}
