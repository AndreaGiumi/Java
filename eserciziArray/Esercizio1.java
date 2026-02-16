
package eserciziArray;

import java.util.Scanner;

//Esercizio n. 1 – copia array
//Letto in input un array A di n numeri interi, 
//creare un secondo array della stessa dimensione e popolarlo copiando tutti gli elementi del primo

public class Esercizio1 {
	public static void main(String [] args) {
		int[] array_1 = new int [5];
		int[] array_2 = new int [5];
		
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < array_1.length; i++) {
			System.out.println("Inserisci numero: ");
			array_1[i] = s.nextInt();
			array_2[i] = array_1[i];
			
		}
		
		for (int i : array_1) {
			System.out.print(i);
		}
			

		for (int i : array_2) {
			System.out.print(i);
		}
		
	}

}
