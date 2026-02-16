
package proveDebug;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main2 {
	private static final Logger Logger=LogManager.getLogger(Main2.class);
	
	public static void main(String[] args) {

		Main2 es=new Main2();
		boolean palindroma = es.isPalindroma("osso");
		int occ=es.contaOccorrenze("oooooo", "o");
		
		String stringaprove = "Ciao mondo!";
		String sottostringa = stringaprove.substring(3);
		
//		System.out.println("La parola è palindroma? " + palindroma);
		Logger.info("La parola è palindroma? " + palindroma);
		Logger.info("Numero occorrenze "+occ);

	}
	
	public boolean isPalindroma(String str1) {
		String str2 = "";
		for (int i = str1.length()-1; i >=0; i--) {
			str2 += str1.charAt(i);
			
		}
		return str2.equals(str1);
	}
	
	
	public int contaOccorrenze(String str, String token) {
		int occorrenze = 0;
		for (int i = 0; i <= str.length()-token.length(); i++) {
			String tmp = str.substring(i, i+token.length());
			if(tmp.equals(token)) {
				occorrenze++;
			}
		}
		return occorrenze;
	}

}
