
package traghetto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Biglietteria {
	private double cassa;
	private Queue<Tariffabile> coda;
	
	
	public Biglietteria(){
		this.cassa = 0;
		this.coda = new LinkedList<>();
	}
	
	public void aggiungiInCoda(Tariffabile t) {
		this.coda.add(t);
	}
    public Tariffabile riceviPagamento() throws IllegalAccessException{
        if (coda.isEmpty())
            throw new IllegalAccessException ("Coda vuota");

        Tariffabile t = coda.poll();
        this.cassa += t.calcolaTariffa();
        return t;
    }

    public double getCassa() {
        return this.cassa;
    }
}
