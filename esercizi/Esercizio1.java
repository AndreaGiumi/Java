
package esercizi;

import java.util.Scanner;

public class Esercizio1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci la base: ");
		
		int n = s.nextInt();
		
		System.out.println("Inserisci l'esponente: ");
		
		int k = s.nextInt();
		
		if (n > 0 && k > 0) {
			int pot = 1;
			for(int i = 1;i<=k;i++) {
				pot =pot * n;
			
			}
			System.out.println(pot);
		}else {
			System.out.println("Errore");
		}
		
		
	}

}
