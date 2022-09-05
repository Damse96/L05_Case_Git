package src.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Library {

    final String navn;

    public Library(String navn) {
        this.navn = navn;
    }

    /*

     Pre: calculatedDate < actualDate
          (calculatedDate is the expected return date and
           actualDate is the day you actually return the book)
    */
    public int calculateFine(LocalDate calculatedDate, LocalDate actualDate, boolean adult) {
        int x = calculatedDate.until(actualDate).getDays();
        int lånepris = 0;
            if(x >= 0 && x <= 7) {
                    lånepris = 10;
                } else if (x >= 8 && x <= 14) {
                    lånepris = 30;
                } else if (x >= 15) {
                    lånepris = 45;
                } if (adult){
                    lånepris *= 2;
            } return lånepris;
        }
    }

