package eserciziArray;

import java.util.Iterator;
import java.util.Scanner;

//Creare un array A di n numeri interi e popolarlo dinamicamente.
//Calcolare e stampare:
//    • la somma di tutti gli elementi
//    • la somma degli elementi di posto pari (il posto zero viene contato nei pari!)
//    • la somma degli elementi di posto dispari
//    • la media aritmetica di tuti gli elementi

public class Esercizio4 {
	public static void main(String[] args) {
		
		int [] array_num = new int [5];
		
		Scanner s = new Scanner(System.in);
		
		int somma = 0;
		int sommaPari = 0;
		int sommaDispari = 0;
		
				
		
		for (int i = 0; i < array_num.length; i++) {
			System.out.println("Inserisci numero: ");
			array_num[i] = s.nextInt();
			somma += array_num[i];
			
		}
		
		for (int i = 0; i < array_num.length; i++) {
			if(array_num[i] % 2 == 0) {
				sommaPari += array_num[i];
			}else {
				sommaDispari += array_num[i];
			}
		

		}
		double media = somma / array_num.length;
		System.out.print("Somma totale: " + somma + "\n");
		System.out.print("Somma pari: " + sommaPari + "\n");
		System.out.print("Somma dispari: " + sommaDispari + "\n");
		System.out.print("Media: " + media);
		
	}

}