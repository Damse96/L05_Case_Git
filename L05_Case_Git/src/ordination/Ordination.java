package ordination;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Ordination {
    private LocalDate startDato;
    private LocalDate slutDato;
    private Laegemiddel laegemiddel;

    public Ordination(LocalDate startDato, LocalDate slutDato) {
        this.startDato = startDato;
        this.slutDato = slutDato;
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    /** Returner antal hele dage mellem startdato og slutdato. Begge dage inklusive. */
    public int antalDage() {
        return (int) ChronoUnit.DAYS.between(startDato, slutDato) + 1;
    }

    @Override
    public String toString() {
        return startDato.toString();
    }

    /** Returner den totale dosis, der er givet i den periode ordinationen er gyldig. */
    public abstract double samletDosis();

    /** Returner den gennemsnitlige dosis givet pr dag i den periode, ordinationen er gyldig. */
    public abstract double doegnDosis();

    /** Returner ordinationstypen som en String. */
    public abstract String getType();

    public Laegemiddel getLaegemiddel(){
        return laegemiddel;
    }

    public void setLaegemiddel(Laegemiddel laegemiddel){
        this.laegemiddel = laegemiddel;
    }

    public void removeLaegemiddel(){
        this.laegemiddel = null;
    }

}
