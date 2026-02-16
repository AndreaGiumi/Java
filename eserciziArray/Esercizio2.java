
package eserciziArray;

import java.util.Scanner;

//Letto in input un array A di n numeri interi, creare un secondo array B della stessa dimensione e popolarlo 
//invertendo l’ordine degli elementi del primo.

public class Esercizio2 {
	public static void main(String[] args) {
		int [] array_1 = new int [5];
		int [] array_2 = new int [5];
		
		Scanner s = new Scanner(System.in);
		int j = array_1.length - 1;
		
		for (int i = 0; i < array_1.length; i++) {
			System.out.println("Inserisci un numero: ");
			array_1[i] = s.nextInt();
			array_2[j] = array_1[i];
			j = j -1;
		}
		
		
		for (int i = 0; i < array_2.length; i++) {
			System.out.println(array_1[i]);
			
			System.out.println(array_2[i]);
			
		}
	}

}
