
package geometria;

public class Rettangolo {

	private int base, altezza;

	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	@Override
	public String toString() {
		return "Rettangolo : base=" + base + ", altezza=" + altezza;
	}
	
	public int calcolaArea() {
		return base*altezza;
	}
	
	public int calcolaPerimetro() {
		return 2* base + 2* altezza;
	}
	
}
