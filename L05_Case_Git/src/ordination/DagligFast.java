package ordination;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DagligFast {
    private final Array[] doser = new Array[4];

    public Array[] getDoser() {
        return Arrays.copyOf(doser,4);
    }

}
