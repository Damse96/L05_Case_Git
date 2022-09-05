package model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void calculateFine() {
        //arrange
        Library lib = new Library("Library");
        LocalDate date1 = LocalDate.parse("2022-08-01");
        LocalDate date2 = LocalDate.parse("2022-08-04");
        LocalDate date3 = LocalDate.parse("2022-08-19");
        LocalDate date4 = LocalDate.parse("2022-08-15");

        int expectedPris = 10;

        int actualResult = lib.calculateFine(date1, date2, false);

        assertEquals(expectedPris, actualResult);
    }

@Test
        void calculateFineAdult7Days(){
            Library lib1 = new Library("Howwarts");
            LocalDate date5 = LocalDate.parse("2022-08-01");
            LocalDate date6 = LocalDate.parse("2022-08-04");
            LocalDate date7 = LocalDate.parse("2022-08-19");
            LocalDate date8 = LocalDate.parse("2022-08-15");

            int expectedPris = 20;

            int actualResult = lib1.calculateFine(date5,date6,true);

            assertEquals(expectedPris, actualResult);

        }


    @Test
    void calculateFineAdult14Days(){
        Library lib1 = new Library("Howwarts");
        LocalDate date5 = LocalDate.parse("2022-08-01");
        LocalDate date6 = LocalDate.parse("2022-08-04");
        LocalDate date7 = LocalDate.parse("2022-08-19");
        LocalDate date8 = LocalDate.parse("2022-08-15");

        int expectedPris = 60;

        int actualResult = lib1.calculateFine(date5,date8,true);

        assertEquals(expectedPris, actualResult);

    }
}