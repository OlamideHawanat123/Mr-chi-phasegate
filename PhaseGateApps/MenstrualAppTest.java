package tests;

import MyCollections.MyMenstrualApp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MenstrualAppTest {
    MyMenstrualApp input = new MyMenstrualApp("22/03/2025", "26/03/2025", 28, 5, 24, 32);

    @Test
    @DisplayName("Test that menstrual app can tell predict your next period starting date")
            public void testThatMenstrualAppCanHelpToPredictYourNextFlowDate(){
        assertEquals("19/04/2025",input.nextFlowStartingDate());

    }
    @Test
    @DisplayName("Test that menstrual app nextFlowingDate is not null")
    public void testThatMenstrualAppNextFlowingDateIsNull(){
        assertNotNull(input.nextFlowStartingDate());
    }

    @Test
    @DisplayName("Test that menstrual app can help predict the end date of your next period")
    public void testThatMenstrualAppCanHelpToPredictTheEndDateOfYourNextPeriod(){
        assertEquals("24/04/2025", input.nextFlowEndingDate());
    }

    @Test
    @DisplayName("Test that menstrual app can help predict your next ovulation day")
    public void testThatMenstrualAppCanHelpToPredictYourNextOvulation(){
        assertEquals("05/04/2025", input.nextOvulation());
    }



    @Test
    @DisplayName("Test that menstrual app can help get the beginning of fertile days")
    public void testThatMenstrualAppCanHelpToGetFertileDays(){
        assertEquals("28/03/2025", input.startingOfFertileDay());
    }

    @Test
    @DisplayName("Test That menstrual app can determine the ending of your fertile")
    public void testThatMenstrualAppCanDetermineTheEndingOfFertile(){
        assertEquals("03/04/2025", input.endingOfFertileDays());
    }

    @Test
    @DisplayName("Test that menstrual app can help calculate the beginning of safe periods")
    public void testThatMenstrualAppCanHelpToCalculateTheBeginningOfSafePeriod(){
        assertEquals("25/04/2025", input.beginningOfSafePeriods());
    }

    @Test
    @DisplayName("Test that menstrual app can help predict the end date of your safe days")
    public void testThatMenstrualAppCanHelpToPredictEndDateOfYourSafeDays(){
        assertEquals("01/05/2025", input.endingOfSafePeriods());
    }






}
