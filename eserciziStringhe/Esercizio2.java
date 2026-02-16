
package eserciziStringhe;

import java.util.Scanner;
import java.lang.Math;

public class Esercizio2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci una data: ");
		
		String data = s.nextLine();
		
		String mese = data.substring(3,5);

		int newMese = Integer.parseInt(mese);
				
		switch (newMese) {
		case 1: {
			System.out.println("Gennaio");
			break;
		}
		case 2:{
			System.out.println("Febbraio");
			break;
		}
		case 3:{
			System.out.println("Marzo");
			break;
		}
		case 4:{
			System.out.println("Aprile");
			break;
		}
		case 5:{
			System.out.println("Maggio");
			break;
		}
		case 6:{
			System.out.println("Giugno");
			break;
		}
		case 7:{
			System.out.println("Luglio");
			break;
		}
		case 8:{
			System.out.println("Agosto");
			break;
		}
		case 9:{
			System.out.println("Settembre");
			break;
		}
		case 10:{
			System.out.println("Ottobre");
			break;
		}
		case 11:{
			System.out.println("Novembre");
			break;
		}
		case 12:{
			System.out.println("Dicembre");
		}
	
		default:
			System.out.println("Valore inserito non valido");
		}
	

	}

}
