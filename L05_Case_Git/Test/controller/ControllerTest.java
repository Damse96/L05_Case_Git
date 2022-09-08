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
        PN pnAktuel = new PN(
                LocalDate.parse("2019-01-01"),
                LocalDate.parse("2019-01-12"),
                5
        );

        assertEquals(pnAktuel.getSlutDato(), pn.getSlutDato());
        assertEquals(pnAktuel.getStartDato(), pn.getStartDato());
        assertEquals(pnAktuel.getType(), pn.getType());
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

        DagligFast dagligFastAktuel = new DagligFast(
                LocalDate.parse("2019-01-01"),
                LocalDate.parse("2019-01-12"),
                6, 4, 5, 2
        );
        assertEquals(dagligFastAktuel.getSlutDato(), dagligFast.getSlutDato());
        assertEquals(dagligFastAktuel.getStartDato(), dagligFast.getStartDato());
        assertEquals(dagligFastAktuel.getType(), dagligFast.getType());
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
        DagligSkaev dagligSkaevAktuel = new DagligSkaev(
                LocalDate.parse("2019-01-01"),
                LocalDate.parse("2019-01-12")
        );

        assertEquals(dagligSkaevAktuel.getSlutDato(), dagligSkaev.getSlutDato());
        assertEquals(dagligSkaevAktuel.getStartDato(), dagligSkaev.getStartDato());
        assertEquals(dagligSkaevAktuel.getType(), dagligSkaev.getType());
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