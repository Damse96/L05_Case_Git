package ordination;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class DagligFast extends Ordination {
    private Dosis[] doses = new Dosis[4];

    public DagligFast(LocalDate startDato, LocalDate slutDato, Patient patient, double morgenAntal, double middagAntal, double aftenAntal, double natAntal) {
        super(startDato, slutDato, patient);
        doses[0] = new Dosis(LocalTime.of(9,0),morgenAntal);
        doses[1] = new Dosis(LocalTime.NOON,middagAntal);
        doses[2] = new Dosis(LocalTime.of(20,0),aftenAntal);
        doses[3] = new Dosis(LocalTime.MIDNIGHT,natAntal);
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

    public Dosis[] getDoser() {
        return doses;
    }
}
