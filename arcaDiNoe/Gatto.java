
package arcaDiNoe;

public class Gatto extends AnimaleT {
	public String verso(){
		return "miao miao";
	}

	@Override
	public String toString() {
		return "Sono un gatto" + "Categoria" + categoria() + "Verso" + verso();
	}

}
