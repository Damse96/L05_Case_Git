package ordination;

import java.time.LocalDate;

public class PN extends Ordination {
    private double antalEnheder;
    private Ordination ordination;
    private int doseret = 0;

    public PN(LocalDate startDato, LocalDate slutDato, Patient patient, double antalEnheder, int doseret) {
        super(startDato, slutDato, patient);
        this.antalEnheder = antalEnheder;
        this.ordination = ordination;
        this.doseret = doseret;
    }

    /**
     * Registrer, at der er givet en dosis paa dagen givesDen.
     * Returner true, hvis givesDen er inden for ordinationens gyldighedsperiode, og datoen huskes.
     * Returner false ellers, og datoen givesDen ignoreres.
     */
    public boolean givDosis(LocalDate givesDen) {
        boolean IndenForGyldighed = false;
        doseret++;
        int i = 0;
        while (!IndenForGyldighed || i < 1){
            if (givesDen.isBefore(ordination.getSlutDato())&&givesDen.isAfter(ordination.getStartDato())){
                IndenForGyldighed = true;
            }
            else i++;
        }
        return false;
    }

    /** Returner antal gange ordinationen er anvendt. */
    public int getAntalGangeGivet() {
        return doseret;
    }

    @Override
    public double samletDosis() {
        return 0;
    }

    @Override
    public double doegnDosis() {
        return 0;
    }

    @Override
    public String getType() {
        return null;
    }

    public double getAntalEnheder() {
        return antalEnheder;
    }
}
