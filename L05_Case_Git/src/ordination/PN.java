package ordination;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PN extends Ordination {
    private double antalEnheder;
    private int doseret = 0;

    public PN(LocalDate startDato, LocalDate slutDato, double antalEnheder) {
        super(startDato, slutDato);
        this.antalEnheder = antalEnheder;
    }

    /**
     * Registrer, at der er givet en dosis paa dagen givesDen.
     * Returner true, hvis givesDen er inden for ordinationens gyldighedsperiode, og datoen huskes.
     * Returner false ellers, og datoen givesDen ignoreres.
     */
    public boolean givDosis(LocalDate dato) {
        if (dato.isAfter(getStartDato()) && dato.isBefore(getSlutDato())) {
            doseret++;
            return true;
        }
        return false;
    }

    /** Returner antal gange ordinationen er anvendt. */
    public int getAntalGangeGivet() {
        return doseret;
    }

    @Override
    public double samletDosis() {
        return antalEnheder * antalDage();
    }

    @Override
    public double doegnDosis() {
        return antalEnheder;
    }

    @Override
    public String getType() {
        return "PN";
    }

    public double getAntalEnheder() {
        return antalEnheder;
    }
}
