package banca;

import java.time.LocalDate;

public class Movimento {
    private final LocalDate data;
    private final double importo;
    private final MovimentType operazione;

    public Movimento(double importo, MovimentType operazione) {
        this.data = LocalDate.now();
        if (importo > 0) {
            this.importo = importo;
        } else {
            throw new IllegalArgumentException("L'importo deve essere positivo");
        }
        this.operazione = operazione;
    }

    public LocalDate getData() {
        return data;
    }

    public double getImporto() {
        return importo;
    }

    public MovimentType getOperazione() {
        return operazione;
    }

    @Override
    public String toString() {
        return "Movimento [data=" + data + ", importo=" + importo + ", operazione=" + operazione + "]";
    }
}