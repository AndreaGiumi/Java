
package eserciziDate;

import java.util.Date;

public class Esercizio1 {
	public static void main(String[] args) {
		Date fine = new Date(125, 11, 2, 19, 30);
		
		Date now = new Date();
		
		int ore = fine.getHours() - now.getHours();
		int minuti = fine.getMinutes() - now.getMinutes();
		
		if (ore < 0) {
			int newOre = ore - 1;
			System.out.println( "Alla fine della lezione mancano: " + newOre + " ora/e " + minuti + " minuti");
		}
		
		
		if (minuti < 0) {
			int newMin = minuti + 60;
			System.out.println( "Alla fine della lezione mancano: " + ore + " ora/e " + newMin + " minuti");
		}
		
		System.out.println( "Alla fine della lezione mancano: " + ore + " ora/e " + minuti + " minuti");
		
		
	}

}
