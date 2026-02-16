package arcaDiNoe;

public class Cane extends AnimaleT {
	
	public String verso() {
		return "bau bau";
	}

	@Override
	public String toString() {
		return "Sono un Cane" + "Categoria:" + categoria() + "verso: " + verso() ;
	}
	
	

}