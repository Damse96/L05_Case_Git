package ordination;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DagligFast extends Ordination {
    private Dosis[] doses = new Dosis[4];

    public DagligFast(LocalDate startDato, LocalDate slutDato, double morgenAntal, double middagAntal, double aftenAntal, double natAntal) {
        super(startDato, slutDato);
        doses[0] = new Dosis(LocalTime.of(9,0),morgenAntal);
        doses[1] = new Dosis(LocalTime.NOON,middagAntal);
        doses[2] = new Dosis(LocalTime.of(20,0),aftenAntal);
        doses[3] = new Dosis(LocalTime.MIDNIGHT,natAntal);
    }

    @Override
    public double samletDosis() {
        double antal = 0;
        for (Dosis dose : doses) {
            antal += dose.getAntal();
        }
        return antal * ChronoUnit.DAYS.between(getStartDato(), getSlutDato());
    }

    @Override
    public double doegnDosis() {
        double antal = 0;
        for (Dosis dose : doses) {
            antal += dose.getAntal();
        }
        return antal;
    }

    @Override
    public String getType() {
        return "DagligFast";
    }

    public Dosis[] getDoser() {
        return doses;
    }
}
