package ordination;

import controller.Controller;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DagligFastTest {

    @Test
void testsamletDosis() {
    DagligFast dagligFast = Controller.opretDagligFastOrdination(
            LocalDate.parse("2019-01-01"),
            LocalDate.parse("2019-01-12"),
            new Patient("050972-1233", "Hans Jørgensen", 89.4),
            new Laegemiddel("Paracetamol", 1, 1.5, 2, "Ml"),4,
            5,6,7 );
    assertEquals(242.0, dagligFast.samletDosis());
}
@Test
    void TestTC1DagligFast(){
        //arrange
    DagligFast df1 = new DagligFast(LocalDate.of(2022,7,2),LocalDate.of(2022,7,10),1.0,2.0,1.0,2.0);

    //act
    double actualResult = df1.samletDosis();

    //assert
    assertEquals(54, actualResult);

    }
@Test
    void TestTC2DagligFast(){
        //arrange
        DagligFast df1 = new DagligFast(LocalDate.of(2022,7,2),LocalDate.of(2022,7,5),1.0,3.0,2.0,2.0);

        //act
        double actualResult = df1.samletDosis();

        //assert
        assertEquals(32, actualResult);

    }

}
