
package esercizi;

import java.util.Scanner;

public class Esercizio4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci x1: ");
		double x1 = s.nextInt();
		System.out.println("Inserisci y1");
		double y1 = s.nextInt();
		System.out.println("Inserisci x2: ");
		double x2 = s.nextInt();
		System.out.println("Inserisci y2");
		double y2 = s.nextInt();
		
		double lato1 = Math.abs(x2 - x1);
		double lato2 = Math.abs(y2 - y1);
		
		if(lato1 == lato2) {
			System.out.println("La figura è un quadrato!");
			
			double area = Math.pow(lato1, 2);
			
			double perimetro = 4 * lato1;
			
			System.out.println("Area: " + area);
			System.out.println("Perimetro: " + perimetro);
			
		}else {
			System.out.println("La figura è un rettangolo generico!");
			
			double area = lato1 * lato2;
			double perimetro = 2 * (lato1 + lato2);
			
			System.out.println("Area: " + area);
			System.out.println("Perimetro: " + perimetro);
		}
	}

}
