
package geometria;

public class Cerchio {

	private double raggio;

	public Cerchio(double raggio) {
		this.raggio = raggio;
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	@Override
	public String toString() {
		return "Cerchio [raggio=" + raggio + "]";
	}
	
	public double calcolaArea() {
		return Math.PI * Math.pow(raggio, 2);
	}
	
	public double calcolaPerimetro() {
		return 2*raggio*Math.PI;
	}
}
