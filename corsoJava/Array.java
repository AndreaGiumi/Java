package corsoJava;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int[]newArray = new int [9];
		int [] arrayFor = {1,5,9,78};
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < arrayFor.length; i++) {
			System.out.println("Inserisci numero: ");
			  arrayFor[i] = s.nextInt();
			  
		}
		for (int i = 0; i < arrayFor.length; i++) {
			System.out.println(arrayFor[i]);
			
		}
		
		char [] nome = {'a', 'n', 'n', 'a'};
		
		for (char c : nome) {
			System.out.print(c);
			
		}
	}
	

}