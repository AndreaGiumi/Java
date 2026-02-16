
package geometria;
import java.util.Scanner;

public class Geometria {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Scegli tra Rettangolo e Cerchio (oppure 'esci')");
            String forma = s.nextLine().toLowerCase();

            if (forma.equals("esci")) break;

            if (forma.equals("rettangolo")) {
                System.out.println("Inserisci base e altezza:");
                int base = s.nextInt();
                int altezza = s.nextInt();
                s.nextLine();

                Rettangolo r1 = new Rettangolo(base, altezza);

                System.out.println("Cosa vuoi conoscere: area o perimetro?");
                String calcoloR = s.nextLine().toLowerCase();

                if (calcoloR.equals("area")) {
                    System.out.println("L'area del rettangolo è: " + r1.calcolaArea());
                } else if (calcoloR.equals("perimetro")) {
                    System.out.println("Il perimetro del rettangolo è: " + r1.calcolaPerimetro());
                } else {
                    System.out.println("Scelta non valida");
                }

            } else if (forma.equals("cerchio")) {
                System.out.println("Inserisci il raggio:");
                double raggio = s.nextDouble();
                s.nextLine(); 

                Cerchio c1 = new Cerchio(raggio);

                System.out.println("Cosa vuoi conoscere: area o perimetro?");
                String calcoloC = s.nextLine().toLowerCase();

                if (calcoloC.equals("area")) {
                    System.out.println("L'area del cerchio è: " + c1.calcolaArea());
                } else if (calcoloC.equals("perimetro")) {
                    System.out.println("Il perimetro del cerchio è: " + c1.calcolaPerimetro());
                } else {
                    System.out.println("Scelta non valida");
                }
            } else {
                System.out.println("Forma non valida");
            }
        }

        s.close();
    }
}
