package ordination;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class DagligSkaev {
    private ArrayList<Dosis> doser = new ArrayList<>();

    public ArrayList<Dosis> getDoser(){
        return new ArrayList<>(doser);
    }

    public Dosis createDosis(LocalTime tid, double antal){
        Dosis dosis = new Dosis(tid, antal);
        doser.add(dosis);
        return dosis;

    }



    public void opretDosis(LocalTime tid, double antal) {
       double amount = 0;
        for (double ant: Dosis.){

        }

    }
}
