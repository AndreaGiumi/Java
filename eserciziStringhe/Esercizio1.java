
package eserciziStringhe;

import java.util.Scanner;

public class Esercizio1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci una stringa: ");
		
		String frase = s.nextLine();
		boolean risposta = true;
		
		
		for (int i = 0; i < frase.length(); i++) {
			if(!Character.isDigit(frase.charAt(i))) {
				
				risposta = false;
				break;
				
			}
			
		}
		if(risposta) {
			System.out.println("TESTO NUMERCIO");
		}else {
			System.out.println("TESTO NON NUMERICO");
		}
	}
	
}
