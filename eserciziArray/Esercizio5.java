
package eserciziArray;

import java.util.Scanner;

//Letto in input un array A di n numeri interi, stampare gli elementi a zigzag, 
//cioè il primo e l'ultimo, poi il secondo e il penultimo, e così via.
//NB: assumiamo la dimensione pari.

public class Esercizio5 {
	public static void main(String[] args) {
		int [] array_num = new int [6];
		
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < array_num.length; i++) {
			System.out.println("Inserisci un numero: ");
			array_num[i] = s.nextInt();
		}
		
        int inizio = array_num.length - 1;
        int fine = 0;
        while (inizio >= fine) {
            System.out.print(array_num[inizio] + " ");
            if (inizio != fine) {
                System.out.print(array_num[fine] + " ");
            }
            inizio--;
            fine++;
        }
		
	}
}
