
package arcaDiNoe;

public class Canarino extends AnimaleV {
	public String verso() {
		return "cip cip";
	}
	
	@Override
	public String toString() {
		return "Sono un canarino" + "Categoria" + categoria() + "Verso" + verso();
	}

}
