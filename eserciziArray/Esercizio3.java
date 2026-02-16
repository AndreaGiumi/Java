
package eserciziArray;

import java.util.Scanner;

//Creare un array A di n numeri interi, popolarlo dinamicamente SOLO per metà e stamparlo.
//Popolare poi la seconda metà con gli stessi valori della prima e stampare nuovamente.
//NB: per semplicità assumiamo che la dimensione dell’array sia un numero pari.
//Es. creo un array da 10 elementi e lo popolo con questi 5 valori (3, 5, 8, 2, 4). 
//Alla fine l'array deve diventare (3, 5, 8, 2, 4, 3, 5, 8, 2, 4).
public class Esercizio3 {
	public static void main(String[] args) {
		int [] array_A = new int [10];
		
		Scanner s = new Scanner(System.in);
		
		int half = array_A.length / 2;
		
		for (int i = 0; i < half; i++) {
			System.out.println("Inserisci un numero: ");
			array_A[i] = s.nextInt();
			
		}
		
		for (int i = 0; i < half; i++) {
			System.out.println(array_A[i]);
		}
		for (int i = 5; i < array_A.length; i++) {
			array_A[i] = array_A[i - 5];
			System.out.println(array_A[i]);

		}
	}

}
