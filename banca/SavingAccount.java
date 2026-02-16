
package banca;

public class SavingAccount extends ContoCorrente {

    private final double interesse;
    private int max_prelievi;

    public SavingAccount(String intestatario, int numero, double interesse, int max_prelievi) {
        super(intestatario, numero);
        this.interesse = interesse;
        this.max_prelievi = max_prelievi;
    }

    public SavingAccount(String intestatario, int numero, double saldoIniziale, double interesse, int max_prelievi) {
        super(intestatario, numero, saldoIniziale);
        this.interesse = interesse;
        this.max_prelievi = max_prelievi;
    }

    public double getInteresse() {
        return interesse;
    }

    public int getMax_prelievi() {
        return max_prelievi;
    }

    @Override
    public Movimento doMovimento(Movimento operazione) {
        if (operazione.getOperazione() == MovimentType.Prelievo) {
            if (this.max_prelievi <= 0) {
                throw new IllegalArgumentException("Non puoi fare più prelievi");
            }
            Movimento mov = super.doMovimento(operazione);
            this.max_prelievi--;
            System.out.println("Prelievi rimasti: " + this.max_prelievi);
            return mov;
        } else {
            return super.doMovimento(operazione);
        }
    }

    public double applicaInteresse() {
        double newInteresse = getSaldo() * (this.interesse / 100.0);
        Movimento m = new Movimento(newInteresse, MovimentType.Deposito);
        doMovimento(m);
        System.out.println("Interesse applicato: " + newInteresse + "€");
        return newInteresse;
    }

    @Override
    public String toString() {
        return super.toString() + " SavingAccount [interesse=" + interesse + ", max_prelievi=" + max_prelievi + "]";
    }
}
