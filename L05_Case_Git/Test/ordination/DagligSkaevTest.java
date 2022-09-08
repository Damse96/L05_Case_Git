package ordination;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class DagligSkaevTest {

    @Test
    void samletDosisDage() {
        //arrange
        DagligSkaev ds = new DagligSkaev(
                LocalDate.of(2022,7,2),
                LocalDate.of(2022, 7, 5));
        ds.opretDosis(LocalTime.of(12,15), 2);
        //act
        double actualResult = ds.samletDosis();
        //assert
        assertEquals(8, actualResult);
    }

    @Test
    void samletDosisMåned() {
        //arrange
        DagligSkaev ds = new DagligSkaev(LocalDate.of(2022,7,2),
                LocalDate.of(2022, 8, 2));
        ds.opretDosis(LocalTime.of(12,15), 2);
        //act
        double actualResult = ds.samletDosis();
        //assert
        assertEquals(64, actualResult);
    }

    @Test
    void samletDosisÅr() {
        //arrange
        DagligSkaev ds = new DagligSkaev(LocalDate.of(2022,7,2),
                LocalDate.of(2023, 7, 2));
        ds.opretDosis(LocalTime.of(12,15), 2);
        //act
        double actualResult = ds.samletDosis();
        //assert
        assertEquals(732, actualResult);
    }
}