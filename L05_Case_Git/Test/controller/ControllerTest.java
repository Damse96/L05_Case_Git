package controller;


import ordination.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static junit.framework.TestCase.assertEquals;

class ControllerTest {
    @Test
    void opretPNOrdination() {
        PN pn = Controller.opretPNOrdination(
                LocalDate.parse("2019-01-01"),
                LocalDate.parse("2019-01-12"),
                new Patient("050972-1233", "Hans Jørgensen", 89.4),
                new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml"),
                5
        );
        PN pnExpected = new PN(
                LocalDate.parse("2019-01-01"),
                LocalDate.parse("2019-01-12"),
                5
        );

        assertEquals(pnExpected.getSlutDato(), pn.getSlutDato());
        assertEquals(pnExpected.getStartDato(), pn.getStartDato());
        assertEquals(pnExpected.getType(), pn.getType());
    }

    @Test
    void opretDagligFastOrdination() {
        DagligFast dagligFast = Controller.opretDagligFastOrdination(
                LocalDate.parse("2019-01-01"),
                LocalDate.parse("2019-01-12"),
                new Patient("050972-1233", "Hans Jørgensen", 89.4),
                new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml"),
                6, 4, 5, 2
        );

        DagligFast dagligFastExpected = new DagligFast(
                LocalDate.parse("2019-01-01"),
                LocalDate.parse("2019-01-12"),
                6, 4, 5, 2
        );
        assertEquals(dagligFastExpected.getSlutDato(), dagligFast.getSlutDato());
        assertEquals(dagligFastExpected.getStartDato(), dagligFast.getStartDato());
        assertEquals(dagligFastExpected.getType(), dagligFast.getType());
    }


    @Test
    void opretDagligSkaevOrdination() {
        DagligSkaev dagligSkaev = Controller.opretDagligSkaevOrdination(
                LocalDate.parse("2019-01-01"),
                LocalDate.parse("2019-01-12"),
                new Patient("050972-1233", "Hans Jørgensen", 89.4),
                new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml"),
                new LocalTime[]{LocalTime.parse("09:00"), LocalTime.parse("11:00"), LocalTime.parse("14:00"), LocalTime.parse("19:00")},
                new double[] {1,2,0,2}
        );
        DagligSkaev dagligSkaevExpected = new DagligSkaev(
                LocalDate.parse("2019-01-01"),
                LocalDate.parse("2019-01-12")
        );

        assertEquals(dagligSkaevExpected.getSlutDato(), dagligSkaev.getSlutDato());
        assertEquals(dagligSkaevExpected.getStartDato(), dagligSkaev.getStartDato());
        assertEquals(dagligSkaevExpected.getType(), dagligSkaev.getType());
    }


    @Test
    void ordinationPNAnvendt() {
    }

    @Test
    void anbefaletDosisPrDoegn() {
    }

    @Test
    void antalOrdinationerPrVaegtPrLaegemiddel() {
    }

}