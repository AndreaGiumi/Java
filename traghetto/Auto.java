
package traghetto;

public class Auto extends Veicolo {
	
	private TipoVeicolo tipo;


    public Auto(String targa, TipoVeicolo tipo) {
        super(targa);
        this.tipo = tipo;
    }

    @Override
    public double calcolaTariffa() {
        if (passeggeri.size() < 1 || passeggeri.size() > 5)
            throw new IllegalStateException("Numero passeggeri auto non valido");

        double base;
        switch (this.tipo) {
            case Mini -> base = 4;
            case Standard -> base = 5;
            case Suv -> base = 8.5;
            default -> base = 0;
        }

        return base + costoPasseggeri();
    }
}
