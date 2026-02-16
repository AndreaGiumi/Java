
package banca;

public class Bank {
    public static void main(String[] args) {

        // Conto senza saldo iniziale
        ContoCorrente c1 = new ContoCorrente("Mario Rossi", 1001);
        System.out.println(c1);

        // Deposito
        Movimento dep1 = new Movimento(500, MovimentType.Deposito);
        c1.doMovimento(dep1);
        System.out.println("Dopo deposito 500: " + c1.getSaldo());

        // Prelievo valido
        Movimento pre1 = new Movimento(200, MovimentType.Prelievo);
        c1.doMovimento(pre1);
        System.out.println("Dopo prelievo 200: " + c1.getSaldo());

        // Verifica bilancio
        System.out.println("Check balance c1: " + c1.checkBalance());
        System.out.println("Movimenti c1:");
        System.out.println(c1.getMovimenti());

        // Saving account con saldo iniziale
        SavingAccount s1 = new SavingAccount("Luigi Bianchi", 2001, 1000, 2.5, 2);
        System.out.println(s1);

        // Prelievo 300
        Movimento pre2 = new Movimento(300, MovimentType.Prelievo);
        s1.doMovimento(pre2);
        System.out.println("Saldo dopo prelievo 300: " + s1.getSaldo());

        // Applicazione interesse
        double interesseApplicato = s1.applicaInteresse();
        System.out.println("Interesse calcolato: " + interesseApplicato);
        System.out.println("Saldo dopo interesse: " + s1.getSaldo());

        // Prelievi fino a esaurimento
        try {
            Movimento pre3 = new Movimento(100, MovimentType.Prelievo);
            s1.doMovimento(pre3);

            Movimento pre4 = new Movimento(50, MovimentType.Prelievo);
            s1.doMovimento(pre4);

            // Questo dovrebbe lanciare eccezione se max_prelievi era 2
            Movimento pre5 = new Movimento(10, MovimentType.Prelievo);
            s1.doMovimento(pre5);
        } catch (IllegalArgumentException e) {
            System.out.println("Eccezione attesa: " + e.getMessage());
        }

        System.out.println("Movimenti saving account:");
        System.out.println(s1.getMovimenti());
    }
}
