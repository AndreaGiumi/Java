
package esercizi;

import java.util.Scanner;

public class Esercizio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci un numero: ");
		int num = s.nextInt();
		
		if(num > 0) {
			int fattoriale = 1;
			for (int i = 1;i<=num;i++) {
				fattoriale *= i;
			}
			System.out.println(fattoriale);
		}
	}

}
