package ordination;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class DagligSkaev extends Ordination {
    private ArrayList<Dosis> doser = new ArrayList<>();

    public DagligSkaev(LocalDate startDato, LocalDate slutDato) {
        super(startDato, slutDato);
    }
    public Dosis opretDosis(LocalTime tid, double antal) {
        Dosis dosis = new Dosis(tid,antal);
        doser.add(dosis);
        return dosis;
    }

    @Override
    public double samletDosis() {
        int dage = (int) ChronoUnit.DAYS.between(super.getStartDato(), super.getSlutDato());
        return doegnDosis() * dage;
    }

    @Override
    public double doegnDosis() {
        double total = 0;
        for (Dosis d : doser){
            total += d.getAntal();
        }
        return total;
    }

    @Override
    public String getType() {
        return "dagligSkæv";
    }


    public ArrayList<Dosis> getDoser() {
        return doser;
    }
}
