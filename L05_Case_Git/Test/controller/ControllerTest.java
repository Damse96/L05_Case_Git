package controller;


import ordination.*;

import org.junit.jupiter.api.Test;
import storage.Storage;

import java.time.LocalDate;

class ControllerTest {
    Patient jane = new Patient("050972-1233", "Hans Jørgensen", 89.4);
    Patient finn = new Patient("070985-1153", "Finn Madsen", 83.2);
    Patient ib = new Patient("090149-2529", "Ib Hansen", 87.7);

    Laegemiddel acetylsalicylsyre = new Laegemiddel(
            "Acetylsalicylsyre", 0.1, 0.15,
            0.16, "Styk");
    Laegemiddel paracetamol = new Laegemiddel(
            "Paracetamol", 1, 1.5,
            2, "Ml");
    Laegemiddel fucidin = new Laegemiddel(
            "Fucidin", 0.025, 0.025,
            0.025, "Styk");
    Laegemiddel methotrexate = new Laegemiddel(
            "Methotrexate", 0.01, 0.015,
            0.02, "Styk");

    PN pn1 = Controller.opretPNOrdination (LocalDate.parse("2019-01-01"), LocalDate.parse("2019-01-12"),
    jane, paracetamol, 123.0);

    PN pn2 = Controller.opretPNOrdination(LocalDate.parse("2019-02-12"), LocalDate.parse("2019-02-14"),
    jane, acetylsalicylsyre, 3);

    PN pn3 = Controller.opretPNOrdination(LocalDate.parse("2019-01-20"), LocalDate.parse("2019-01-25"),
    ib, fucidin, 5);

    PN pn4 = Controller.opretPNOrdination(LocalDate.parse("2019-01-01"), LocalDate.parse("2019-01-12"),
    jane, paracetamol, 123);


    @Test
    void opretDagligSkaevOrdination() {
        Controller.initStorage();

        DagligSkaev dagligSkaev = Controller.opretDagligSkaevOrdination(
                LocalDate.parse("2019-01-01"),
                LocalDate.parse("2019-01-12"),
                ,
                paracetamol,

        );


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