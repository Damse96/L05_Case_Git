package ordination;

import java.time.LocalDate;

public class PN {
    private double antalEnheder;
    private Ordination ordination;

    /**
     * Registrer, at der er givet en dosis paa dagen givesDen.
     * Returner true, hvis givesDen er inden for ordinationens gyldighedsperiode, og datoen huskes.
     * Returner false ellers, og datoen givesDen ignoreres.
     */
    public boolean givDosis(LocalDate givesDen) {
        boolean IndenForGyldighed = false;
        int i = 0;
        while (!IndenForGyldighed || i < 1){
            if (givesDen.isBefore(ordination.getSlutDen())&&givesDen.isAfter(ordination.getStartDen())){
                IndenForGyldighed = true;
            }
            else i++;
        }
        return false;
    }

    /** Returner antal gange ordinationen er anvendt. */
    public int getAntalGangeGivet() {

        return -1;
    }
}
