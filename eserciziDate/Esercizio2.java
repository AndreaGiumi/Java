
package eserciziDate;

import java.util.Date;
import java.util.Scanner;

public class Esercizio2 {
	public static void main(String[] args) {
		
		Date now = new Date();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Inserisci ora di uscita: ");
		
		int ore = s.nextInt();
		
		System.out.println("Inserisci anche i minuti: ");
		
		int minuti = s.nextInt();
		
		int oreMancanti = ore - now.getHours();
		int minutiMancanti = minuti - now.getMinutes();

		if (minutiMancanti < 0) {
		    minutiMancanti += 60;
		    oreMancanti -= 1;
		}

		System.out.println("Alla fine della lezione mancano: " + 
		    oreMancanti + " ora/e " + minutiMancanti + " minuti");

		
	}

}
