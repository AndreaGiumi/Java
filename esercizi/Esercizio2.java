
package esercizi;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Inserisci base");
		
		int n = s.nextInt();
		
		System.out.println("Inserisci esponente");
		
		int k = s.nextInt();
		
		
		if (n > 0 && k > 0) {
			int sommatoria = 0;
			for(int i = 1;i<=k;i++) {
				sommatoria += k*i;
			
			}
			System.out.println(sommatoria);
		}

	}

}
