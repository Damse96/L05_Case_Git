package ordination;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PNTest {

    @Test
    void givDosisFalse() {
        //arrange
        PN pn = new PN(LocalDate.of(2022,7,2),
                LocalDate.of(2022, 7, 5),2);
        //act
        boolean actualResult = pn.givDosis(LocalDate.of(2022,7,6));
        //assert
        assertFalse(actualResult);
    }

    @Test
    void givDosisTrue() {
        //arrange
        PN pn = new PN(LocalDate.of(2022,7,2),
                LocalDate.of(2022, 7, 5),2);
        //act
        boolean actualResult = pn.givDosis(LocalDate.of(2022,7,4));
        //assert
        assertTrue(actualResult);
    }


    @Test
    void samletDosisDage() {
        //arrange
        PN pn = new PN(LocalDate.of(2022,7,2),
                LocalDate.of(2022, 7, 5),2);
        //act
        double actualResult = pn.samletDosis();
        //assert
        assertEquals(6.0, actualResult);
    }

    @Test
    void samletDosisMåned() {
        //arrange
        PN pn = new PN(LocalDate.of(2022,7,2),
                LocalDate.of(2022, 8, 2),2);
        //act
        double actualResult = pn.samletDosis();
        //assert
        assertEquals(62, actualResult);
    }

    @Test
    void samletDosisÅr() {
        //arrange
        PN pn = new PN(LocalDate.of(2022,7,2),
                LocalDate.of(2023, 7, 2),2);
        //act
        double actualResult = pn.samletDosis();
        //assert
        assertEquals(730, actualResult);
    }


}