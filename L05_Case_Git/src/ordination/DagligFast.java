package ordination;


import java.util.Arrays;

public class DagligFast {
    private final Dosis[] doser = new Dosis[4];

    public Dosis[] getDoser() {
        return Arrays.copyOf(doser,4);
    }
}
