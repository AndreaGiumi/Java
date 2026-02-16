
package banca;

import java.util.ArrayList;

public class ContoCorrente {

    private String intestatario;
    private int numero;
    private double saldo;
    private ArrayList<Movimento> listaMovimenti = new ArrayList<>();

    // Costruttore senza deposito iniziale
    public ContoCorrente(String intestatario, int numero) {
        this.intestatario = intestatario;
        this.numero = numero;
        this.saldo = 0.00;
    }

    // Costruttore con deposito iniziale
    public ContoCorrente(String intestatario, int numero, double saldoIniziale) {
        this.intestatario = intestatario;
        this.numero = numero;
        this.saldo = 0.00;
        if (saldoIniziale > 0) {
            Movimento m = new Movimento(saldoIniziale, MovimentType.Deposito);
            doMovimento(m);
        }
    }

    public String getIntestatario() {
        return intestatario;
    }

    public void setIntestatario(String intestatario) {
        this.intestatario = intestatario;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<Movimento> getListaMovimenti() {
        return listaMovimenti;
    }

    public Movimento doMovimento(Movimento operazione) {
        if (operazione.getOperazione() == MovimentType.Prelievo) {
            if (operazione.getImporto() > this.saldo) {
                throw new IllegalArgumentException("Saldo disponibile non sufficiente!");
            }
            this.saldo -= operazione.getImporto();
        } else {
            this.saldo += operazione.getImporto();
        }
        this.listaMovimenti.add(operazione);
        return operazione;
    }

    public boolean checkBalance() {
        double calcoloBalance = 0.00;
        for (Movimento movimento : listaMovimenti) {
            if (movimento.getOperazione() == MovimentType.Deposito) {
                calcoloBalance += movimento.getImporto();
            } else {
                calcoloBalance -= movimento.getImporto();
            }
        }
        return calcoloBalance == saldo;
    }

    public String getMovimenti() {
        if (this.listaMovimenti.isEmpty()) {
            return "Nessun movimento";
        }
        StringBuilder sb = new StringBuilder();
        for (Movimento movimento : listaMovimenti) {
            sb.append(movimento).append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "ContoCorrente [intestatario=" + intestatario + ", numero=" + numero + ", saldo=" + saldo + "]";
    }
}
