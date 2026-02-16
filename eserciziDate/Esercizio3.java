
package eserciziDate;

import java.util.Random;
import java.util.Scanner;

public class Esercizio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Random r = new Random();
		
		int n = r.nextInt(50);
		
		int i = 0;
		
		while (true) {
			System.out.println("Inserisci un numero: ");
			
			int num = s.nextInt();
			i++;
			
			if (num > n) {
				System.out.println("Troppo grande, riprova con un numero minore");
			
			}else if (num < n){
				System.out.println("Troppo piccolo, riprova con un numero maggiore");
			}else {
				System.out.println("Esatto! Hai indovinato con " + i + " tentativi");
				break;
			}
		}
		
		
	}

}
