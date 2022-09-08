package controller;

import ordination.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

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



    @org.junit.jupiter.api.Test
    void opretDagligFastOrdination() {

        Controller.opretPNOrdination(LocalDate.parse("2019-01-01"), LocalDate.parse("2019-01-12"),
               jane, paracetamol, 123);

        Controller.opretPNOrdination(LocalDate.parse("2019-02-12"), LocalDate.parse("2019-02-14"),
                jane, acetylsalicylsyre, 3);

        Controller.opretPNOrdination(LocalDate.parse("2019-01-20"), LocalDate.parse("2019-01-25"),
                ib, fucidin, 5);

        Controller.opretPNOrdination(LocalDate.parse("2019-01-01"), LocalDate.parse("2019-01-12"),
                jane, paracetamol, 123);


    }

    @org.junit.jupiter.api.Test
    void opretDagligSkaevOrdination() {
    }

    @org.junit.jupiter.api.Test
    void ordinationPNAnvendt() {
    }

    @org.junit.jupiter.api.Test
    void anbefaletDosisPrDoegn() {
    }

    @org.junit.jupiter.api.Test
    void antalOrdinationerPrVaegtPrLaegemiddel() {
    }

    @org.junit.jupiter.api.Test
    void getAllPatienter() {
    }

    @org.junit.jupiter.api.Test
    void getAllLaegemidler() {
    }


    @org.junit.jupiter.api.Test
    void opretLaegemiddel() {
        Laegemiddel acetylsalicylsyre = Controller.opretLaegemiddel(
                "Acetylsalicylsyre", 0.1, 0.15,
                0.16, "Styk");
        Laegemiddel paracetamol = Controller.opretLaegemiddel(
                "Paracetamol", 1, 1.5,
                2, "Ml");
        Laegemiddel fucidin = Controller.opretLaegemiddel(
                "Fucidin", 0.025, 0.025,
                0.025, "Styk");
       Laegemiddel methotrexate = Controller.opretLaegemiddel(
                "Methotrexate", 0.01, 0.015,
                0.02, "Styk");
    }

    @org.junit.jupiter.api.Test
    void initStorage() {
    }
}