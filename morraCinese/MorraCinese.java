
package morraCinese;

import java.util.Random;
import java.util.Scanner;

public class MorraCinese {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        while (true) {

            int computer = r.nextInt(3);

            System.out.println("REGOLE:\n0 = Sasso\n1 = Carta\n2 = Forbici");
            System.out.print("Inserisci un numero da 0 a 2: ");

            int giocatore = s.nextInt();
            s.nextLine(); 

            System.out.println("Computer lancia: " + computer);
            System.out.println("Giocatore lancia: " + giocatore);

            if (giocatore == computer) {
                System.out.println("Parità!");
            } 
            else if ((giocatore == 0 && computer == 2) ||
                     (giocatore == 1 && computer == 0) ||
                     (giocatore == 2 && computer == 1)) {
                System.out.println("Giocatore vince!");
            } 
            else {
                System.out.println("Computer vince!");
            }

            System.out.print("Vuoi continuare? (S/N): ");
            String continua = s.nextLine().trim().toUpperCase();

            if (continua.equals("N")) {
                System.out.println("Hai scelto di terminare il gioco.");
                break;
            }
        }
        
        s.close();
    }
}
