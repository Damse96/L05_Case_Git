package ordination;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class DagligSkaev extends Ordination {
    private ArrayList<Dosis> doser = new ArrayList<>();

    public DagligSkaev(LocalDate startDen, LocalDate slutDen) {
        super(startDen, slutDen);
    }



    public ArrayList<Dosis> getDoser(){
        return new ArrayList<>(doser);
    }

    public Dosis createDosis(LocalTime tid, double antal){
        Dosis dosis = new Dosis(tid, antal);
        doser.add(dosis);
        return dosis;

    }

    @Override
    public double samletDosis() {
        int dage = (int) ChronoUnit.DAYS.between(super.getStartDen(), super.getSlutDen());
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



}
